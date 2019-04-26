package com.cctc.amatlock.test;

import java.awt.*;

public class Blocks extends CoreObject
{
    boolean broken = false;
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
    public Blocks(int x, int y, int width, int height, Color color)
    {
        super(x, y, width, height, color);
    }

    @Override
    public void tick()
    {
        Ball ball = Screen.getInstance().ball;
        if(intersects(ball))
        {
            broken = true;
            ball.setVelY(ball.getVelY() * -1);
        }

        Rectangle right = new Rectangle(16, 3, 1, 1);
        Rectangle left = new Rectangle(16, 3, 1, 1);
        if(ball.intersects(left) || ball.intersects(right) )
        {
            broken = true;
            ball.setVelY(ball.getVelY() * -1);
        }
        broken = true;
        ball.setVelY(ball.getVelY() * -1);
    }

    @Override
    public void render(Graphics g)
    {
        if(broken)
        {
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }
    }
}
