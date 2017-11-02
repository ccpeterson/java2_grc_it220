package game;

import java.util.Scanner;

import players.*;

public class GameDriver
{
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to an Adventure (of variable length)!");
		System.out.println("*********************************************");
		System.out.println("What is your name, noble adventurer?");
		String playerName = console.nextLine();
		
		boolean done = false;
		int playerType = 0;
		while (!done)
		{
			System.out.println("What type of adventurer do you wish to be?");
			System.out.println("1) A Knight - Tough, can travel in any weather!");
			System.out.println("2) A Princess - Smart and savvy, never caught off guard!");
			System.out.println("3) Squire - Quick and agile, the fastest traveler!");
			playerType = console.nextInt();
			if (playerType == 1 || playerType == 2 || playerType == 3 )
			{
				done = true;
			}
			else {
				System.out.println("Please enter a valid response");				
			}
		}
		boolean done2 = false;
		int gameLength = 0;
		while (!done2)
		{
			System.out.println("How many tiles long should the advenure be?");
			System.out.println("Please choose a number from 10 to 50");
			gameLength = console.nextInt();
			if (gameLength >= 10 && gameLength <= 50) 
			{
				done2 = true;
			}
			else {
				System.out.println("Please enter a valid response");				
			}
		}
		
		if (playerType ==1)
		{
			Knight newPlayer = new Knight(playerName);
			Game game = new Game(gameLength, newPlayer);
			game.startGame();
		}
		else if (playerType == 2)
		{
			Princess newPlayer = new Princess(playerName);
			Game game = new Game(gameLength, newPlayer);
			game.startGame();
		}
		else if (playerType == 3)
		{
			Squire newPlayer = new Squire(playerName);
			Game game = new Game(gameLength, newPlayer);
			game.startGame();
		}
				
		
		
		console.close();
	}
}
