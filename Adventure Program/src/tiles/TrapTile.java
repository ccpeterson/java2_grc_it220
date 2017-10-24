package tiles;

import game.Game;

public class TrapTile extends BasicTile {

	public TrapTile(TileType type) 
	{
		super(type.TRAP);
	}

	@Override
	public void visitTile(Game game)
	{
		if (game.getPlayer().maxFatigue != 12)
		{
			game.getPlayer().currentFatigue -= 2;
			System.out.println(game.getPlayer().currentFatigue);
			game.movePlayer(-1);
		}
		game.getPlayer().stepsOnTrap();
	}
}