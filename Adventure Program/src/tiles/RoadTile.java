package tiles;

import game.Game;

public class RoadTile extends BasicTile
{
	public RoadTile(TileType type)
	{
		super(type.ROAD);
	}

	@Override
	public void visitTile(Game game)
	{
		if (game.getPlayer().maxFatigue == 15)
		{
			game.getPlayer().currentFatigue -= 1;
			System.out.println(game.getPlayer().currentFatigue);
		}
		game.getPlayer().stepsOnRoad();
	}
}