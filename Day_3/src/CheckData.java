public class CheckData {

    private String Name;
    private String Surname;
    private String SecondName;
    private String Date;
    private long Telephone;
    private char Gender;
    private boolean CorrectData = true;

    public CheckData(String enterString) {
        String[] enterStrings = enterString.split(" ");
        if (ProcessErrorCode(enterStrings)) {
            try {

                ParseData(enterStrings);
            } catch (RuntimeException e) {
                CorrectData = false;
                System.out.println(e.getMessage());
            }
        }
    }

    public String getName() {
        if (CorrectData) {
            return Name;
        }
        throw new RuntimeException("Данные некорректны");
    }

    public String getSurname() {
        if (CorrectData) {
            return Surname;
        }
        throw new RuntimeException("Данные некорректны");
    }

    public String getSecondName() {
        if (CorrectData) {
            return SecondName;
        }
        throw new RuntimeException("Данные некорректны");
    }

    public String getDate() {
        if (CorrectData) {
            return Date;
        }
        throw new RuntimeException("Данные некорректны");
    }

    public boolean getCorrect() {
        return CorrectData;
    }

    public long getTelephone() {
        if (CorrectData) {
            return Telephone;
        }
        throw new RuntimeException("Данные некорректны");
    }

    public char getGender() {
        if (CorrectData) {
            return Gender;
        }
        throw new RuntimeException("Данные некорректны");
    }

    private boolean ProcessErrorCode(String[] enterData) {
        int code = checkData(enterData);
        if (code == -1) {
            System.out.println("Вы ввели меньше данных, чем требуется");
            CorrectData = false;
            return false;
        } else if (code == 1) {
            System.out.println("Вы ввели больше данных, чем требуется");
            CorrectData = false;
            return false;
        }
        return true;
    }
    private int checkData(String[] enterData) {
        if (enterData.length < 6) {
            return -1;
        } else if (enterData.length > 6) {
            return 1;
        }
        return 0;
    }


    private void ParseData(String[] enterData) {
        for (String tempString : enterData) {
            if (Character.isDigit(tempString.charAt(0))) {
                ParseNumber(tempString);
            } else if (tempString.length() == 1) {
                if (tempString.equals("м") || tempString.equals("ж")) {
                    Gender = tempString.charAt(0);
                } else {
                    throw new RuntimeException(
                            "Пол не распознан");
                }
            } else if (Character.isAlphabetic(tempString.charAt(0))) {
                ParseName(tempString);
            } else {
                throw new RuntimeException("Введенные данные некорректны");
            }
        }

    }

    private void ParseNumber(String digitString) {
        if (digitString.indexOf('.') != -1) {
            ParseDate(digitString);
        } else {
            try {
                Telephone = Long.parseLong(digitString);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат номера телефона");
            }
        }
    }

    private void ParseDate(String dateString) {
        if (dateString.length() > 10 || dateString.codePointAt(2) != 46 || dateString.codePointAt(5) != 46) {
            throw new RuntimeException("Неверный формат даты");
        }
        int day = 0;
        int month = 0;
        int year = 0;
        String[] temp = dateString.split("\\.");
        try {
            day = Integer.parseInt(temp[0]);
            month = Integer.parseInt(temp[1]);
            year = Integer.parseInt(temp[2]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат даты");
        }
        if (day > 0 && day < 32 && month > 0 && month < 13 && year > 1900 && year < 2024) {
            Date = dateString;
        } else {
            throw new RuntimeException("Неверный формат даты");
        }
    }

    public void ParseName(String wordString) {
        for (int i = 0; i < wordString.length(); i++) {
            if (!Character.isAlphabetic(wordString.charAt(i))) {
                throw new RuntimeException("Неверный формат ФИО");
            }
        }
        if (Surname == null) {
            Surname = wordString;
        } else if (Name == null) {
            Name = wordString;
        } else {
            SecondName = wordString;
        }
    }
}
