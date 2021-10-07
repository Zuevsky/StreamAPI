// Создание потока данных способ №3.

import java.util.stream.*;

public class Task3 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 4, 5, 7);
        intStream.forEach(i -> System.out.println(i));

        LongStream longStream = LongStream.of(100, 250, 400, 5843787, 237);
        longStream.forEach(l -> System.out.println(l));

        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream.forEach(d -> System.out.println(d));

        Stream stringStream = Stream.of("Рим", "Москва", "Перу", "Париж");
        stringStream.forEach(a -> System.out.println(a));
    }
}