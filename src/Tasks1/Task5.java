package Tasks1;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        /*

        В данной программе нам нужно реализовать фейс-контроль в клубе, причем для женщин и мужчин он будет различен.
        Если на фейс-контроль пришел мужчина старше 18 лет или женщина старше 21 года, то мы должны вывести текст в консоль "Вы можете пройти в клуб",
        если пришедший человек не удовлетворяет этим условиям, то нужно вывести текст "Вы не можете пройти в клуб".

         */

        String[] names = {"Петр", "Марина"};

        int age = new Random().nextInt(45) + 1;                  // Получаем случайный возраст от 1 до 45 лет
        String name = names[new Random().nextInt(2)];            // Получаем случайное имя мужчины или женщины


        // TODO: тут должен быть ваш код В данной программе нужно комбинировать условия для достижения поставленной цели.


    }
}
