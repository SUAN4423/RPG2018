package jp.misw.state;

import java.util.HashMap;

import jp.misw.RPG2018;

public class KMState
{
	public boolean MLeft = false;
	public boolean MCenter = false;
	public boolean MRight = false;
	public int[] Mouse = new int[2];

	public HashMap<Integer, Boolean> Key = new HashMap<Integer, Boolean>();
	public HashMap<Character, Boolean> KeyC = new HashMap<Character, Boolean>();

	public boolean IsMouseIn(int x, int y, int Width, int Height)
	{
		if(this.Mouse[0] >= x && this.Mouse[0] <= x + Width)
		{
			if(this.Mouse[1] >= y && this.Mouse[1] <= y + Height)
			{
				return true;
			}
		}
		return false;
	}

	public KMState(RPG2018 game) {
		this.Key.put(game.RIGHT, false);
		this.Key.put(game.LEFT, false);
		this.Key.put(game.UP, false);
		this.Key.put(game.DOWN, false);
		this.Key.put(game.CONTROL, false);
		this.Key.put(114, false);
		this.KeyC.put(game.ENTER, false);
		this.KeyC.put(' ', false);
		this.KeyC.put('r', false);
		this.Key.put(67, false);
		this.Key.put(86, false);
		this.Key.put(88, false);
		this.Key.put(127, false);
	}
}
