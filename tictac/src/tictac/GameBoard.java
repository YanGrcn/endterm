package tictac;

import java.util.Random;

public class GameBoard {
	public int Victory=0;
	String VictoryOfWho="NoWin";
	private char[][] GameBoard={{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
	public void getGameBoard() {
		System.out.println("Your gameboard for now: ");
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
			System.out.print(GameBoard[i][j]);
			}
		System.out.println();
		}
		System.out.println();
	}
	public void GamePositionAdd(int Row, int Column, String Gamer) {
		if (Row==1) {
		Row=Row-1;
		}
		else if (Row==2) {
		Row=Row;
		}
		else if (Row==3) {
		Row=Row+1;
		}
		else {
		System.out.println ("Wrong position!");
		}
		if (Column==1) {
		Column=Column-1;
		}
		else if (Column==2) {
		Column=Column;
		}
		else if (Column==3) {
		Column=Column+1;
		}
		else {
		System.out.println ("Wrong position!");
		}
		if (Gamer=="Person") {
			this.GameBoard[Row][Column]='X';
		}
		else {
			this.GameBoard[Row][Column]='O';
		}
	}
	public char GamePositionCheck(int Row, int Column) {
		if (Row==1) {
		Row=Row-1;
		}
		else if (Row==2) {
		Row=Row;
		}
		else if (Row==3) {
		Row=Row+1;
		}
		if (Column==1) {
		Column=Column-1;
		}
		else if (Column==2) {
		Column=Column;
		}
		else if (Column==3) {
		Column=Column+1;
		}
		return this.GameBoard[Row][Column];
	}
	public void WinnerTest(){
		if(GamePositionCheck(1,1)==GamePositionCheck(1,2) & GamePositionCheck(1,2)==GamePositionCheck(1,3) & GamePositionCheck(1,1)!=' ' & GamePositionCheck(1,2)!=' ' & GamePositionCheck(1,3)!=' '){
			if (GamePositionCheck(1,1)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(1,1)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
		if(GamePositionCheck(2,1)==GamePositionCheck(2,2) & GamePositionCheck(2,2)==GamePositionCheck(2,3) & GamePositionCheck(2,1)!=' ' & GamePositionCheck(2,2)!=' ' & GamePositionCheck(2,3)!=' ') {
			if (GamePositionCheck(2,1)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(2,1)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
		if(GamePositionCheck(3,1)==GamePositionCheck(3,2) & GamePositionCheck(3,2)==GamePositionCheck(3,3) & GamePositionCheck(3,1)!=' ' & GamePositionCheck(3,2)!=' ' & GamePositionCheck(3,3)!=' ') {
			if (GamePositionCheck(3,1)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(3,1)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
		if(GamePositionCheck(1,1)==GamePositionCheck(2,2) & GamePositionCheck(2,2)==GamePositionCheck(3,3) & GamePositionCheck(1,1)!=' ' & GamePositionCheck(2,2)!=' ' & GamePositionCheck(3,3)!=' ') {
			if (GamePositionCheck(1,1)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(1,1)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
		if(GamePositionCheck(3,1)==GamePositionCheck(2,2) & GamePositionCheck(2,2)==GamePositionCheck(1,3) & GamePositionCheck(3,1)!=' ' & GamePositionCheck(2,2)!=' ' & GamePositionCheck(1,3)!=' ') {
			if (GamePositionCheck(3,1)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(3,1)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
		if(GamePositionCheck(1,1)==GamePositionCheck(2,1) & GamePositionCheck(2,1)==GamePositionCheck(3,1) & GamePositionCheck(1,1)!=' ' & GamePositionCheck(2,1)!=' ' & GamePositionCheck(3,1)!=' ') {
			if (GamePositionCheck(1,1)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(1,1)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
		if(GamePositionCheck(1,2)==GamePositionCheck(2,2) & GamePositionCheck(2,2)==GamePositionCheck(3,2) & GamePositionCheck(1,2)!=' ' & GamePositionCheck(2,2)!=' ' & GamePositionCheck(2,2)!=' ') {
			if (GamePositionCheck(1,2)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(1,2)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
		if(GamePositionCheck(1,3)==GamePositionCheck(2,3) & GamePositionCheck(2,3)==GamePositionCheck(3,3) & GamePositionCheck(1,3)!=' ' & GamePositionCheck(2,3)!=' ' & GamePositionCheck(3,3)!=' ') {
			if (GamePositionCheck(1,3)=='X') {
			this.VictoryOfWho="Person";
			}
			else if (GamePositionCheck(1,3)=='O') {
			this.VictoryOfWho="Bot";
			}
		}
	}
	public void TieTest() {
		if(Victory!=1) {
			int Tie=1;
			for (int i=1;i<4;i++) {
				for(int j=1;j<4;j++) {
					if (GamePositionCheck(i,j)!='X' & GamePositionCheck(i,j)!='O') {
						Tie=0;
					}
				}
			}
		    if(Tie==1) {
		    	this.VictoryOfWho="Tie";
		    }
		}
		
	}
	public void BotsTurn() {
		int Used=0;
		int Row=-1;
		int Column=-1;
		if(((GamePositionCheck(1,1)==GamePositionCheck(1,2) & GamePositionCheck(1,1)=='O' & GamePositionCheck(1,2)=='O') || (GamePositionCheck(1,2)==GamePositionCheck(1,3) & GamePositionCheck(1,2)=='O' & GamePositionCheck(1,3)=='O')
				|| (GamePositionCheck(1,1)==GamePositionCheck(1,3)& GamePositionCheck(1,1)=='O' & GamePositionCheck(1,3)=='O')) & Used==0) {
			if (GamePositionCheck(1,1)!='X' & GamePositionCheck(1,1)!='O') {
				Row=1;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(1,2)!='X' & GamePositionCheck(1,2)!='O') {
				Row=1;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(1,3)!='X' & GamePositionCheck(1,3)!='O') {
				Row=1;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(2,1)==GamePositionCheck(2,2)& GamePositionCheck(2,1)=='O' & GamePositionCheck(2,2)=='O') || (GamePositionCheck(2,2)==GamePositionCheck(2,3)& GamePositionCheck(2,2)=='O' & GamePositionCheck(2,3)=='O')
				|| (GamePositionCheck(2,1)==GamePositionCheck(2,3)& GamePositionCheck(2,1)=='O' & GamePositionCheck(2,3)=='O')) & Used==0) {
			if (GamePositionCheck(2,1)!='X' & GamePositionCheck(2,1)!='O') {
				Row=2;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(2,3)!='X' & GamePositionCheck(2,3)!='O') {
				Row=2;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(3,1)==GamePositionCheck(3,2)& GamePositionCheck(3,1)=='O' & GamePositionCheck(3,2)=='O') || (GamePositionCheck(3,2)==GamePositionCheck(3,3)& GamePositionCheck(3,2)=='O' & GamePositionCheck(3,3)=='O') 
				|| (GamePositionCheck(3,1)==GamePositionCheck(3,3)& GamePositionCheck(3,1)=='O' & GamePositionCheck(3,3)=='O')) & Used==0) {
			if (GamePositionCheck(3,1)!='X' & GamePositionCheck(3,1)!='O') {
				Row=3;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(3,2)!='X' & GamePositionCheck(3,2)!='O') {
				Row=3;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(3,3)!='X' & GamePositionCheck(3,3)!='O') {
				Row=3;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,1)==GamePositionCheck(2,2)& GamePositionCheck(1,1)=='O' & GamePositionCheck(2,2)=='O') || (GamePositionCheck(2,2)==GamePositionCheck(3,3)& GamePositionCheck(2,2)=='O' & GamePositionCheck(3,3)=='O')
				|| (GamePositionCheck(1,1)==GamePositionCheck(3,3)& GamePositionCheck(1,1)=='O' & GamePositionCheck(3,3)=='O')) & Used==0) {
			if (GamePositionCheck(1,1)!='X' & GamePositionCheck(1,1)!='O') {
				Row=1;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(3,3)!='X' & GamePositionCheck(3,3)!='O') {
				Row=3;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(3,1)==GamePositionCheck(2,2)& GamePositionCheck(3,1)=='O' & GamePositionCheck(2,2)=='O') || (GamePositionCheck(2,2)==GamePositionCheck(1,3)& GamePositionCheck(2,2)=='O' & GamePositionCheck(1,3)=='O')
				|| (GamePositionCheck(3,1)==GamePositionCheck(1,3)& GamePositionCheck(3,1)=='O' & GamePositionCheck(1,3)=='O')) & Used==0) {
			if (GamePositionCheck(3,1)!='X' & GamePositionCheck(3,1)!='O') {
				Row=3;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(1,3)!='X' & GamePositionCheck(1,3)!='O') {
				Row=1;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,1)==GamePositionCheck(2,1)& GamePositionCheck(1,1)=='O' & GamePositionCheck(2,1)=='O') || (GamePositionCheck(2,1)==GamePositionCheck(3,1)& GamePositionCheck(2,1)=='O' & GamePositionCheck(3,1)=='O')
				|| (GamePositionCheck(1,1)==GamePositionCheck(3,1)& GamePositionCheck(1,1)=='O' & GamePositionCheck(3,1)=='O')) & Used==0) {
			if (GamePositionCheck(1,1)!='X' & GamePositionCheck(1,1)!='O') {
				Row=1;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,1)!='X' & GamePositionCheck(2,1)!='O') {
				Row=2;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(3,1)!='X' & GamePositionCheck(3,1)!='O') {
				Row=3;
				Column=1;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,2)==GamePositionCheck(2,2)& GamePositionCheck(1,2)=='O' & GamePositionCheck(2,2)=='O') || (GamePositionCheck(2,2)==GamePositionCheck(3,2)& GamePositionCheck(2,2)=='O' & GamePositionCheck(3,2)=='O')
				|| (GamePositionCheck(1,2)==GamePositionCheck(3,2)& GamePositionCheck(1,2)=='O' & GamePositionCheck(3,2)=='O')) & Used==0) {
			if (GamePositionCheck(1,2)!='X' & GamePositionCheck(1,2)!='O') {
				Row=1;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(3,2)!='X' & GamePositionCheck(3,2)!='O') {
				Row=3; 
				Column=2;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,3)==GamePositionCheck(2,3) & GamePositionCheck(1,3)=='O' & GamePositionCheck(2,3)=='O') || (GamePositionCheck(2,3)==GamePositionCheck(3,3)& GamePositionCheck(2,3)=='O' & GamePositionCheck(3,3)=='O')
				|| (GamePositionCheck(1,3)==GamePositionCheck(3,3)& GamePositionCheck(1,3)=='O' & GamePositionCheck(3,3)=='O')) & Used==0) {
			if (GamePositionCheck(1,3)!='X' & GamePositionCheck(1,3)!='O') {
				Row=1;
				Column=3;
				Used+=1;
			}
			else if (GamePositionCheck(2,3)!='X' & GamePositionCheck(2,3)!='O') {
				Row=2;
				Column=3;
				Used+=1;
			}
			else if (GamePositionCheck(3,3)!='X' & GamePositionCheck(3,3)!='O') {
				Row=3;
				Column=3;
				Used+=1;
			}
		}
		
		
		if(((GamePositionCheck(1,1)==GamePositionCheck(1,2) & GamePositionCheck(1,1)!=' ' & GamePositionCheck(1,2)!=' ') || (GamePositionCheck(1,2)==GamePositionCheck(1,3) & GamePositionCheck(1,2)!=' ' & GamePositionCheck(1,3)!=' ')
				|| (GamePositionCheck(1,1)==GamePositionCheck(1,3)& GamePositionCheck(1,1)!=' ' & GamePositionCheck(1,3)!=' ')) & Used==0) {
			if (GamePositionCheck(1,1)!='X' & GamePositionCheck(1,1)!='O') {
				Row=1;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(1,2)!='X' & GamePositionCheck(1,2)!='O') {
				Row=1;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(1,3)!='X' & GamePositionCheck(1,3)!='O') {
				Row=1;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(2,1)==GamePositionCheck(2,2)& GamePositionCheck(2,1)!=' ' & GamePositionCheck(2,2)!=' ') || (GamePositionCheck(2,2)==GamePositionCheck(2,3)& GamePositionCheck(2,2)!=' ' & GamePositionCheck(2,3)!=' ')
				|| (GamePositionCheck(2,1)==GamePositionCheck(2,3)& GamePositionCheck(2,1)!=' ' & GamePositionCheck(2,3)!=' ')) & Used==0) {
			if (GamePositionCheck(2,1)!='X' & GamePositionCheck(2,1)!='O') {
				Row=2;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(2,3)!='X' & GamePositionCheck(2,3)!='O') {
				Row=2;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(3,1)==GamePositionCheck(3,2)& GamePositionCheck(3,1)!=' ' & GamePositionCheck(3,2)!=' ') || (GamePositionCheck(3,2)==GamePositionCheck(3,3)& GamePositionCheck(3,2)!=' ' & GamePositionCheck(3,3)!=' ') 
				|| (GamePositionCheck(3,1)==GamePositionCheck(3,3)& GamePositionCheck(3,1)!=' ' & GamePositionCheck(3,3)!=' ')) & Used==0) {
			if (GamePositionCheck(3,1)!='X' & GamePositionCheck(3,1)!='O') {
				Row=3;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(3,2)!='X' & GamePositionCheck(3,2)!='O') {
				Row=3;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(3,3)!='X' & GamePositionCheck(3,3)!='O') {
				Row=3;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,1)==GamePositionCheck(2,2)& GamePositionCheck(1,1)!=' ' & GamePositionCheck(2,2)!=' ') || (GamePositionCheck(2,2)==GamePositionCheck(3,3)& GamePositionCheck(2,2)!=' ' & GamePositionCheck(3,3)!=' ')
				|| (GamePositionCheck(1,1)==GamePositionCheck(3,3)& GamePositionCheck(1,1)!=' ' & GamePositionCheck(3,3)!=' ')) & Used==0) {
			if (GamePositionCheck(1,1)!='X' & GamePositionCheck(1,1)!='O') {
				Row=1;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(3,3)!='X' & GamePositionCheck(3,3)!='O') {
				Row=3;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(3,1)==GamePositionCheck(2,2)& GamePositionCheck(3,1)!=' ' & GamePositionCheck(2,2)!=' ') || (GamePositionCheck(2,2)==GamePositionCheck(1,3)& GamePositionCheck(2,2)!=' ' & GamePositionCheck(1,3)!=' ')
				|| (GamePositionCheck(3,1)==GamePositionCheck(1,3)& GamePositionCheck(3,1)!=' ' & GamePositionCheck(1,3)!=' ')) & Used==0) {
			if (GamePositionCheck(3,1)!='X' & GamePositionCheck(3,1)!='O') {
				Row=3;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(1,3)!='X' & GamePositionCheck(1,3)!='O') {
				Row=1;
				Column=3;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,1)==GamePositionCheck(2,1)& GamePositionCheck(1,1)!=' ' & GamePositionCheck(2,1)!=' ') || (GamePositionCheck(2,1)==GamePositionCheck(3,1)& GamePositionCheck(2,1)!=' ' & GamePositionCheck(3,1)!=' ')
				|| (GamePositionCheck(1,1)==GamePositionCheck(3,1)& GamePositionCheck(1,1)!=' ' & GamePositionCheck(3,1)!=' ')) & Used==0) {
			if (GamePositionCheck(1,1)!='X' & GamePositionCheck(1,1)!='O') {
				Row=1;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(2,1)!='X' & GamePositionCheck(2,1)!='O') {
				Row=2;
				Column=1;
				Used+=1;
			}
			else if (GamePositionCheck(3,1)!='X' & GamePositionCheck(3,1)!='O') {
				Row=3;
				Column=1;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,2)==GamePositionCheck(2,2)& GamePositionCheck(1,2)!=' ' & GamePositionCheck(2,2)!=' ') || (GamePositionCheck(2,2)==GamePositionCheck(3,2)& GamePositionCheck(2,2)!=' ' & GamePositionCheck(3,2)!=' ')
				|| (GamePositionCheck(1,2)==GamePositionCheck(3,2)& GamePositionCheck(1,2)!=' ' & GamePositionCheck(3,2)!=' ')) & Used==0) {
			if (GamePositionCheck(1,2)!='X' & GamePositionCheck(1,2)!='O') {
				Row=1;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(2,2)!='X' & GamePositionCheck(2,2)!='O') {
				Row=2;
				Column=2;
				Used+=1;
			}
			else if (GamePositionCheck(3,2)!='X' & GamePositionCheck(3,2)!='O') {
				Row=3; 
				Column=2;
				Used+=1;
			}
		}
		if(((GamePositionCheck(1,3)==GamePositionCheck(2,3)& GamePositionCheck(1,3)!=' ' & GamePositionCheck(2,3)!=' ') || (GamePositionCheck(2,3)==GamePositionCheck(3,3)& GamePositionCheck(2,3)!=' ' & GamePositionCheck(3,3)!=' ')
				|| (GamePositionCheck(1,3)==GamePositionCheck(3,3)& GamePositionCheck(1,3)!=' ' & GamePositionCheck(3,3)!=' ')) & Used==0) {
			if (GamePositionCheck(1,3)!='X' & GamePositionCheck(1,3)!='O') {
				Row=1;
				Column=3;
				Used+=1;
			}
			else if (GamePositionCheck(2,3)!='X' & GamePositionCheck(2,3)!='O') {
				Row=2;
				Column=3;
				Used+=1;
			}
			else if (GamePositionCheck(3,3)!='X' & GamePositionCheck(3,3)!='O') {
				Row=3;
				Column=3;
				Used+=1;
			}
		}
		if (Used==0 & VictoryOfWho!="Tie"){
			do {
			Random rand = new Random();
			Row=rand.nextInt(3)+1;
			Column=rand.nextInt(3)+1;
			}
			while (GamePositionCheck(Row,Column)=='O' || GamePositionCheck(Row,Column)=='X');
		}
		if (VictoryOfWho!="Tie"){
		GamePositionAdd(Row, Column, "Bot");
		}
	}
	public void VictoryTest() {
		if (VictoryOfWho!="NoWin" & VictoryOfWho!="Tie") {
			this.Victory=1;
			System.out.println(Victory());
		}
		else if(VictoryOfWho=="Tie") {
			this.Victory=1;
			System.out.println(Tie());
		}
	}
	public String Victory() {
		return "Game over. " + VictoryOfWho + " won!";
	}
	public String Tie() {
		return "Game over." + VictoryOfWho + "!";
	}
}
