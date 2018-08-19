package jp.misw.supers;

import java.util.ArrayList;

import jp.misw.RPG2018;

public abstract class FIELD
{
	private ArrayList<Events> event = new ArrayList<>();

	public abstract void draw(RPG2018 game);

	public void setEvents(Events ev[])
	{
		for(int i = 0; i < ev.length; i++)
		{
			event.add(ev[i]);
		}
	}

	public Events getEvents(int EventNumber)
	{
		return event.get(EventNumber);
	}
}
