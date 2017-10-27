package tiles;
/**
 * Project: Adventure Program 
 * 10/24/17
 * @author Clinton Peterson
 */
import game.Game;

public abstract class BasicTile
{
	private TileType type;
	
	public BasicTile(TileType type)
	{
		this.type = type;
	}
	
	public TileType getType()
	{
		return type;
	}
	
	public String toString()
	{
		return type.toString().substring(0, 1);
	}
	
	public abstract void visitTile(Game game);
}
