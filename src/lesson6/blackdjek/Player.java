package lesson6.blackdjek;

import java.util.Scanner;

public class Player {
    protected Karta[] kartas = new Karta[10];
    private boolean isGame = true;
    private int id;

    public boolean isGame() {
        return isGame;
    }

    public void setGame(boolean game) {
        isGame = game;
    }

    public void setKartas(Karta[] kartas) {
        this.kartas = kartas;
    }

    //конструктор
    public Player() {

    }

    public Player(Karta k1, Karta k2) {
        kartas[0] = k1;
        kartas[1] = k2;
    }

    //Метод
    public void vskririe() {
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] != null) {
                System.out.println(this.kartas[i].getName() + " " + this.kartas[i].getValue());
            }
        }
    }

    public void addKart(Karta k) {
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] == null) {
                this.kartas[i] = k;
                break;
            }
        }
    }

    public boolean needKartaHad() {
        System.out.println("---------------------");
        this.vskririe();
        System.out.println("Игрок Добавить карту?");
        Scanner s = new Scanner(System.in);
        String res = s.nextLine();
        if (res.equals("yes")) {
            return true;
        } else return false;
    }

    public int showPowerPlayer() {
        int value = 0;
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] != null) {
                value += this.kartas[i].getValue();
            }
        }
        return value;
    }
}
