package jp.misw;

import jp.misw.state.KMState;
import jp.misw.state.STATE;
import processing.core.PApplet;

public class RPG2018 extends PApplet
{
	public KMState kmState = new KMState(this);

	public static void main(String[] args)
	{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		PApplet.main("jp.misw.RPG2018");
	}
	@Override
	public void settings()
	{
		size(1280, 720);
	}

	@Override
	public void setup()
	{

	}

	@Override
	public void draw()
	{
		STATE.currentField.draw(this);
	}

	@Override
	public void mousePressed()
	{
		if( mouseButton == LEFT )
		{
			//���{�^���������ꂽ�Ƃ��̏���
			kmState.MLeft = true;
		}
		else if( mouseButton == CENTER )
		{
			//�����{�^���������ꂽ�Ƃ��̏���
			kmState.MCenter = true;
		}
		else if( mouseButton == RIGHT )
		{
			//�E�{�^���������ꂽ�Ƃ��̏���
			kmState.MRight = true;
		}
	}

	@Override
	public void mouseReleased()
	{
		if( mouseButton == LEFT )
		{
			//���{�^���������ꂽ�Ƃ��̏���
			kmState.MLeft = false;
		}
		else if( mouseButton == CENTER )
		{
			//�����{�^���������ꂽ�Ƃ��̏���
			kmState.MCenter = false;
		}
		else if( mouseButton == RIGHT )
		{
			//�E�{�^���������ꂽ�Ƃ��̏���
			kmState.MRight = false;
		}
	}

	@Override
	public void keyPressed()
	{
		kmState.Key.put(keyCode, true);
		kmState.KeyC.put(key, true);
		//System.out.println(this.key + " " + this.keyCode);
	}

	@Override
	public void keyReleased()
	{
		kmState.Key.put(keyCode, false);
		kmState.KeyC.put(key, false);
	}

	void keyPressed(java.awt.event.KeyEvent e)
	{
		int mod = e.getModifiersEx();
		if (e.getKeyCode()==java.awt.event.KeyEvent.VK_Z&&(mod & java.awt.event.InputEvent.CTRL_DOWN_MASK) != 0) {
			System.out.println("ctrl+z");
		}
	}
}
