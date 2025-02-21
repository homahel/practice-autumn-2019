package lesson05.part04.task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import lesson05.part04.task10.Person;

/**
 * User, Loser, Coder and Proger
 * 1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
 * Строки(ключи) могут быть такими: "user", "loser", "coder", "proger".
 * Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
 * <p>
 * 2. Для каждой введенной строки нужно:
 * 2.1. Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
 * 2.2. Передать этот объект в метод doWork.
 * <p>
 * 3. Написать реализацию метода doWork, который:
 * 3.1. Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
 * 3.2. Вызывает метод doNothing(), если person имеет тип Loser.
 * 3.3. Вызывает метод writeCode(), если person имеет тип Coder.
 * 3.4. Вызывает метод enjoy(), если person имеет тип Proger.
 * <p>
 * <p>
 * Требования:
 * 1. Метод main должен считывать строки с клавиатуры.
 * 2. Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не совпадает с одной из ожидаемых(user, loser, coder, proger).
 * 3. Для каждой корректной(user, loser, coder, proger) введенной строки должен быть вызван метод doWork с соответствующим объектом класса Person в качестве параметра.
 * 4. В классе Solution должен быть реализован метод doWork с одним параметром типа Person.
 * 5. Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
 * 6. Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
 * 7. Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
 * 8. Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.
 */

public class Task10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> strings = new ArrayList<>();
        strings.add("user");
        strings.add("loser");
        strings.add("coder");
        strings.add("proger");
        while (true) {
            key = reader.readLine();
            if (!strings.contains(key))
                break;
            if (key.equals("user"))
                person = new Person.User();
            else if (key.equals("loser"))
                person = new Person.Loser();
            else if (key.equals("coder"))
                person = new Person.Coder();
            else if (key.equals("proger"))
                person = new Person.Proger();
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
    }
}
