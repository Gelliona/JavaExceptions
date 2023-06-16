// Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

// Максимум, что мне пришло в голову, (не знаю, насколько это соответствует логике задачи) - это инициализировать
// массив, которого не было в коде, и заменить исключение ArithmeticException просто на Exception. В этом случае будет
// отлавливаться не только ArithmeticException (деление на 0), но и ArrayIndexOutOfBoundsException (в случае, если
// в массиве менее 9 элементов, и нужный индекс [8] не будет найден), а также NullPointerException (в случае, если
// массив будет равен null). Тем более, что пойманное исключение выводится последней строкой кода, а если оно всегда
// было бы одинаковое (ArithmeticException), то какой смысл его выводить, как переменную, которая всегда имеет одно
// и то же значение? Здесь подразумевается вариативность значения переменной "e". В остальном не нашла ошибок.