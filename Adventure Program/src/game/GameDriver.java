package game;

import java.util.Scanner;

public class GameDriver
{
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to an Adventure (of variable length)!");
		System.out.println("*********************************************");
		What is your name, noble adventurer?
		What type of adventurer do you wish to be?
		1) A Knight - Tough, can travel in any weather!
		2) A Princess - Smart and savvy, never caught off guard!
		3) Squire - Quick and agile, the fastest traveler!
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
