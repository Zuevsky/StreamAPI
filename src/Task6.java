// Использование метода sorted() с компаратором.

import java.util.Comparator;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        Stream<MobilePhone> phoneStream = Stream.of(new MobilePhone("iPhone X", "Apple", 600),
                new MobilePhone("Pixel 2", "Google", 500),
                new MobilePhone("iPhone 8", "Apple",450),
                new MobilePhone("Nokia 9", "HMD Global",150),
                new MobilePhone("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhoneComparator())
                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));
    }
}

class PhoneComparator implements Comparator<MobilePhone> {
    public int compare(MobilePhone a, MobilePhone b) {
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}

class MobilePhone {
    private String name;
    private String company;
    private int price;

    public MobilePhone(String name, String comp, int price) {
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
