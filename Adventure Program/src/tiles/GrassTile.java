package tiles;

import game.Game;

public class GrassTile extends BasicTile
{
	public GrassTile(TileType type)
	{
		super(type.GRASS);
	}

	@Override
	public void visitTile(Game game)
	{
		game.getPlayer().currentFatigue -= 1;
		System.out.println(game.getPlayer().currentFatigue);
		game.getPlayer().stepsOnGrass();
	}
}