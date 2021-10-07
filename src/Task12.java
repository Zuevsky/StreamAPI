// Использование метода partitioningBy() класса Collectors

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task12 {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340)
        );

        Map<Boolean, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.partitioningBy(p -> p.getCompany() == "Apple"));

        for(Map.Entry<Boolean, List<Phone>> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey());
            for(Phone phone : item.getValue()) {
                System.out.println(phone.getName());
            }
            System.out.println();
        }
    }

    static class Phone {
        private String name;
        private String company;
        private int price;

        public Phone(String name, String comp, int price) {
            this.name = name;
            this.company = comp;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public String getCompany() {
            return company;
        }
    }
}
