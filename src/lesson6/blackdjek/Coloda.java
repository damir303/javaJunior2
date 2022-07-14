package lesson6.blackdjek;

import java.util.concurrent.ThreadLocalRandom;

public class Coloda {

    private Karta[] kartas = new Karta[52];

    public Coloda(){
        kartas[0] = new Karta("Двойка черви",2);
        kartas[1] = new Karta("Двойка Буби",2);
        kartas[2] = new Karta("Двойка Крести",2);
        kartas[3] = new Karta("Двойка Пики",2);

        kartas[4] = new Karta("Тройка черви",3);
        kartas[5] = new Karta("Тройка Буби",3);
        kartas[6] = new Karta("Тройка Крести",3);
        kartas[7] = new Karta("Тройка Пики",3);

        kartas[8] = new Karta("Четверка черви",4);
        kartas[9] = new Karta("Четверка Буби",4);
        kartas[10] = new Karta("Четверка Крести",4);
        kartas[11] = new Karta("Четверка Пики",4);

        kartas[12] = new Karta("Пятерка черви",5);
        kartas[13] = new Karta("Пятерка Буби",5);
        kartas[14] = new Karta("Пятерка Крести",5);
        kartas[15] = new Karta("Пятерка Пики",5);

        kartas[16] = new Karta("Шестерка черви",6);
        kartas[17] = new Karta("Шестерка Буби",6);
        kartas[18] = new Karta("Шестерка Крести",6);
        kartas[19] = new Karta("Шестерка Пики",6);

        kartas[20] = new Karta("Семерка черви",7);
        kartas[21] = new Karta("Семерка Буби",7);
        kartas[22] = new Karta("Семерка Крести",7);
        kartas[23] = new Karta("Семерка Пики",7);

        kartas[24] = new Karta("Восьмерка черви",8);
        kartas[25] = new Karta("Восьмерка Буби",8);
        kartas[26] = new Karta("Восьмерка Крести",8);
        kartas[27] = new Karta("Восьмерка Пики",8);

        kartas[28] = new Karta("Девятка черви",9);
        kartas[29] = new Karta("Девятка Буби",9);
        kartas[30] = new Karta("Девятка Крести",9);
        kartas[31] = new Karta("Девятка Пики",9);

        kartas[32] = new Karta("Десятка черви",10);
        kartas[33] = new Karta("Десятка Буби",10);
        kartas[34] = new Karta("Десятка Крести",10);
        kartas[35] = new Karta("Десятка Пики",10);

        kartas[36] = new Karta("Валет черви",10);
        kartas[37] = new Karta("Валет Буби",10);
        kartas[38] = new Karta("Валет Крести",10);
        kartas[39] = new Karta("Валет Пики",10);

        kartas[40] = new Karta("Дама черви",10);
        kartas[41] = new Karta("Дама Буби",10);
        kartas[42] = new Karta("Дама Крести",10);
        kartas[43] = new Karta("Дама Пики",10);

        kartas[44] = new Karta("Король черви",10);
        kartas[45] = new Karta("Король Буби",10);
        kartas[46] = new Karta("Король Крести",10);
        kartas[47] = new Karta("Король Пики",10);

        kartas[48] = new Karta("Туз черви",11);
        kartas[49] = new Karta("Туз Буби",11);
        kartas[50] = new Karta("Туз Крести",11);
        kartas[51] = new Karta("Туз Пики",11);
    }

    public Karta getsRandomKart(){
        int randomNum =
                ThreadLocalRandom.current().nextInt(0, kartas.length-1);
        return kartas[randomNum];
    }
}
