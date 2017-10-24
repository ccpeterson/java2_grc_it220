package tiles;

import game.Game;

public class MudTile extends BasicTile
{
	public MudTile(TileType type)
	{
		super(type.MUD);
	}

	@Override
	public void visitTile(Game game)
	{

	}
}