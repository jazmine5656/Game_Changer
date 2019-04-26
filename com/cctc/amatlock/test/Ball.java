package com.cctc.amatlock.test;

import java.awt.*;

public class Ball extends CoreObject
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
    public Ball(int x, int y, int width, int height, Color color)
    {
        super(x, y, width, height, color);
    }

    @Override
    public void tick()
    {
        x += velX;
        y += velY;
        Ball ball = Screen.getInstance().ball;
        if(x < 0)
        {
            ball.setVelX(ball.getVelX() * -1);
        }
        if(x > Reference.WIDTH)
        {
            ball.setVelX(ball.getVelX() * -1);
        }
        if(y > Reference.HEIGHT)
        {
            System.out.println("You won.");
        }

    }

    @Override
    public void render(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
