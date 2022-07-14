package dz;

public class Main {
	public static void main(String[] args) {
		
	
	Koloda koloda = new Koloda();
	
	Dealer d = new Dealer(); // создали дилера 
	Player player1 = new Player("IGROOK1");

	Game blackdjek = new Game(d); // добавили дилера 
	
	blackdjek.addPlayer(player1);
	
	blackdjek.addTwoKartaToPlayer(d);
	blackdjek.addTwoKartaToPlayer(player1);
	

	blackdjek.addKartaToPlayer(player1); // добавляем карты считаем очки 
	blackdjek.addKartaToDealer(d); // добавляем карты считаем очки 
	
	player1.vskritie();
		System.out.println();
	d.vskritie();
	
	blackdjek.printToWin();




	}		 
}