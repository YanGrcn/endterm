package tictac;

import java.util.Scanner;

public class Main { //Main part
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	int exit=0;
	while(exit!=1) {
		GameBoard a = new GameBoard(); 
		a.Victory=0;
	while(a.Victory!=1) {
		a.getGameBoard();
		System.out.println("Choose your row and column.");
		int row=scan.nextInt();
		int column=scan.nextInt();
		a.GamePositionAdd(row, column, "Person");
		a.getGameBoard();
		a.TieTest();
		a.WinnerTest();
		a.VictoryTest();
		a.BotsTurn();
		a.getGameBoard();
		a.WinnerTest();
		a.VictoryTest();
	}
	System.out.println("Choose your option:");
	System.out.println("1.Play again");
	System.out.println("2.Exit");
	if(scan.nextInt()==2) {
		exit=1;
	}
	}
	}
}
