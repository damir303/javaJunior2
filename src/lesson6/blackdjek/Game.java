package lesson6.blackdjek;

import java.util.ArrayList;

public class Game implements IGame {

    private Coloda col = new Coloda();

    public Game(Player player) {
        playersArr.add(player);
        //players[0] = player;
    }

    private Player[] players = new Player[6];
    private ArrayList<Player> playersArr = new ArrayList<Player>();

    @Override
    public void addPlayer(Player player) {
        playersArr.add(player);
        /*
        for (int i =0;i<players.length;i++) {
            if(players[i] == null){
                players[i] = player;
                return;
            }
        }
         */
    }

    @Override
    public void addTwoKartaToPlayer() {
        for (Player player : playersArr) {
            player.addKart(this.col.getsRandomKart());
            player.addKart(this.col.getsRandomKart());
        }
    }

    @Override
    public void needMoreKarta() {

        for (Player player : playersArr) {
            boolean b = player.needKartaHad();
            while (b) {
                player.addKart(this.col.getsRandomKart());
                b = player.needKartaHad();
            }
        }
    }

    @Override
    public void printToWin() {
        int count = 0;
        /*
        если больше 21 то проиграл
        вывести игрока с максимальным количеством очков
         */

        for (Player player : playersArr) {
            if (player.showPowerPlayer() > 21) {
                player.setGame(false);
            } else count++;
        }
        int winValue = 0;
        if (count > 0) {
            if (count == 1) {
                for (Player player : playersArr) {
                    if (player.isGame()) {
                        System.out.println("ѕобедил единственный игрок");
                        player.vskririe();
                        return;
                    }
                }
            } else {
                for (Player player : playersArr) {
                    if (winValue < player.showPowerPlayer()) ;
                    winValue = player.showPowerPlayer();
                }
            }
            for (Player player : playersArr) {
               if(winValue==player.showPowerPlayer()){
                   System.out.println("ѕобедитель!");
                   player.vskririe();
               }
            }
        } else {
            System.out.println("ƒиллер победил!");
        }
    }
}
