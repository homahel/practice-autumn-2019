package lesson05.part02;

/**
 * Попадание в десятку
 * Добавь еще один метод, чтобы программа выводила на экран число 10.
 * <p>
 * Подсказка:
 * используй перегрузку методов.
 * <p>
 * <p>
 * Требования:
 * 1. Класс Solution должен содержать три метода.
 * 2. Перегруженный метод transformValue должен удваивать переданное в него число.
 * 3. Тип и значение переменной i менять нельзя.
 * 4. Тип и значение переменной x менять нельзя.
 * 5. Команду вывода на экран менять нельзя.
 * 6. Метод main должен вызывать метод transformValue только один раз.
 * 7. Программа должна вывести на экран число 10.
 */

public class Task30 {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);
        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }

    public static int transformValue(Integer i) {
        return i * 2;
    }
}
