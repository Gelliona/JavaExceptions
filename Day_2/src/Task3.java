// Дан следующий код, исправьте его там, где требуется
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            //abc[3] = 9;    Убираем эту строку, так как из-за неё возникает исключение IndexOutOfBoundsException

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println(ex.toString());
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
// Throwable ex убрала в самый низ вариантов исключений, так как вверху оно сработает в любом случае, и другие
// подклассы исключений не будут пойманы. Но чтобы пользователь понял, какое именно исключение возникло, вместо описания
// "что-то пошло не так" сделала именно вывод описания пойманного исключения. Вероятнее всего в данном коде оно поймает
// только ArithmeticException (в случае деления на 0).

// Для метода printSum убрала throws FileNotFoundException, потому что считаю, что в данном методе такое исключение
// возникнуть не может.
