package com.cctc.amatlock.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener
{
    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        Paddle player = Screen.getInstance().player;

        if(e.getKeyCode() == KeyEvent.VK_A)
        {
            player.setVelX(-1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_D)
        {
            player.setVelX(1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }
}
