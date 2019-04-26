package com.cctc.amatlock.test;

import java.awt.*;

public class Wall extends CoreObject
{

    /**
     * Creates the core object. All subclasses
     * will call this with super.
     * The super call to the Rectangle class.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public Wall(int x, int y, int width, int height, Color color)
    {
        super(x, y, width, height, color);
    }

    @Override
    public void tick()
    {
        Ball ball = Screen.getInstance().ball;
        if(ball.intersects(this) )
        {
            ball.setVelY(ball.getVelY() * -1);
        }
    }

    @Override
    public void render(Graphics g)
    {

    }
}
