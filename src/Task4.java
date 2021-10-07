// Применение фильтрации на потоке объектов.

import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000)
        );

        phoneStream.filter(p -> p.getPrice() < 50000)
                .forEach(p -> System.out.println(p.getName()));
    }
}

class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
