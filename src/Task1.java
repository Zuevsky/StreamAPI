// Создание потока данных.

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид", "Киев", "Минск", "Рим");
        cities.stream() // получаем поток
                .filter(a -> a.length() >= 5) // применяем фильтрацию по длине строки
                .forEach(a -> System.out.println(a)); // выводим отфильтрованные строки на консоль
    }
}