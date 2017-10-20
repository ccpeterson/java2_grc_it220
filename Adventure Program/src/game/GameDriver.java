package game;

import java.util.Scanner;

public class GameDriver
{
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		/*
		 * You should greet the user and gather all game
		 * related values before sending them to the 
		 * game object below.
		 */
		
		//send in the number of tiles and a new player object here
		Game game = new Game(0, null);
		game.startGame();
		
		console.close();
	}
}
