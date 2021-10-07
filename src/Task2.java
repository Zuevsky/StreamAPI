// Создание потока данных способ №2.

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        Stream<String> citiesStream = cities.stream(); // получаем поток
        citiesStream = citiesStream.filter(s -> s.length() == 6); // применяем фильтрацию по длине строки
        citiesStream.forEach(s -> System.out.println(s)); // выводим отфильтрованные строки на консоль
    }
}
