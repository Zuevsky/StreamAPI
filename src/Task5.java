// Использование метода map() и flatMap() в стриме.

import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<Phone> phoneStream1 = Stream.of(
                new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000)
        );

        Stream<Phone> phoneStream2 = Stream.of(
                new Phone("iPhone 8", 66000),
                new Phone("Lumia 1100", 52500),
                new Phone("Samsung Galaxy S 9", 47890)
        );

        phoneStream1.map(p -> p.getName()) // помещаем в поток только названия телефонов
                .forEach(s -> System.out.println(s));

        phoneStream2
                .flatMap(p -> Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int) (p.getPrice() * 0.1))
                ))
                .forEach(s -> System.out.println(s));
    }
}