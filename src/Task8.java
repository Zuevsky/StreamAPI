// Использование метода reduce() с дополнительным параметром identity.

import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000)
        );

        int sum = phoneStream.reduce(0,
                (x, y) -> (y.getPrice() < 50000) ? x + y.getPrice() : x + 0,
                (x, y) -> x + y);

        System.out.println(sum); // 117000
    }

    static class Phone {
        private String name;
        private int price;

        public Phone(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
