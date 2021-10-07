// Терминальные методы max() и min(). Сравнение сложных объектов и получение результата.

import java.util.stream.Stream;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.addAll(Arrays.asList(new Phone[] {
                new Phone("iPhone 8", 52000),
                new Phone("Nokia 9", 35000),
                new Phone("Samsung Galaxy S9", 48000),
                new Phone("HTC U12", 36000)
        }));

        Phone min = phones.stream().min(Phone::compare).get();
        Phone max = phones.stream().max(Phone::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max.getName(), max.getPrice());
    }

    static class Phone {
        private String name;
        private int price;

        public Phone(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public static int compare (Phone p1, Phone p2) {
            if(p1.getPrice() > p2.getPrice()) {
                return 1;
            }
            return -1;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
