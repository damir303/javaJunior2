package lesson6.blackdjek;

import java.util.concurrent.ThreadLocalRandom;

public class Coloda {

    private Karta[] kartas = new Karta[52];

    public Coloda(){
        kartas[0] = new Karta("������ �����",2);
        kartas[1] = new Karta("������ ����",2);
        kartas[2] = new Karta("������ ������",2);
        kartas[3] = new Karta("������ ����",2);

        kartas[4] = new Karta("������ �����",3);
        kartas[5] = new Karta("������ ����",3);
        kartas[6] = new Karta("������ ������",3);
        kartas[7] = new Karta("������ ����",3);

        kartas[8] = new Karta("�������� �����",4);
        kartas[9] = new Karta("�������� ����",4);
        kartas[10] = new Karta("�������� ������",4);
        kartas[11] = new Karta("�������� ����",4);

        kartas[12] = new Karta("������� �����",5);
        kartas[13] = new Karta("������� ����",5);
        kartas[14] = new Karta("������� ������",5);
        kartas[15] = new Karta("������� ����",5);

        kartas[16] = new Karta("�������� �����",6);
        kartas[17] = new Karta("�������� ����",6);
        kartas[18] = new Karta("�������� ������",6);
        kartas[19] = new Karta("�������� ����",6);

        kartas[20] = new Karta("������� �����",7);
        kartas[21] = new Karta("������� ����",7);
        kartas[22] = new Karta("������� ������",7);
        kartas[23] = new Karta("������� ����",7);

        kartas[24] = new Karta("��������� �����",8);
        kartas[25] = new Karta("��������� ����",8);
        kartas[26] = new Karta("��������� ������",8);
        kartas[27] = new Karta("��������� ����",8);

        kartas[28] = new Karta("������� �����",9);
        kartas[29] = new Karta("������� ����",9);
        kartas[30] = new Karta("������� ������",9);
        kartas[31] = new Karta("������� ����",9);

        kartas[32] = new Karta("������� �����",10);
        kartas[33] = new Karta("������� ����",10);
        kartas[34] = new Karta("������� ������",10);
        kartas[35] = new Karta("������� ����",10);

        kartas[36] = new Karta("����� �����",10);
        kartas[37] = new Karta("����� ����",10);
        kartas[38] = new Karta("����� ������",10);
        kartas[39] = new Karta("����� ����",10);

        kartas[40] = new Karta("���� �����",10);
        kartas[41] = new Karta("���� ����",10);
        kartas[42] = new Karta("���� ������",10);
        kartas[43] = new Karta("���� ����",10);

        kartas[44] = new Karta("������ �����",10);
        kartas[45] = new Karta("������ ����",10);
        kartas[46] = new Karta("������ ������",10);
        kartas[47] = new Karta("������ ����",10);

        kartas[48] = new Karta("��� �����",11);
        kartas[49] = new Karta("��� ����",11);
        kartas[50] = new Karta("��� ������",11);
        kartas[51] = new Karta("��� ����",11);
    }

    public Karta getsRandomKart(){
        int randomNum =
                ThreadLocalRandom.current().nextInt(0, kartas.length-1);
        return kartas[randomNum];
    }
}
