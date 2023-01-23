package Movement;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Sprite.Sprite;

public class Movement implements KeyListener
{
    public static final int WASD = 0;
    public static final int ARROW_KEYS = 1;
    
    public static final int WINDOW_PADDING = 28;

    public Sprite affected;
    
    public double x, y;
    private double speed = 0;
    
    private boolean boolUp, boolDown, boolLeft, boolRight = false;
    private boolean lBound, rBound, tBound, bBound = true;
    
    public int controls[] = new int[4];
    private int leftBound, rightBound, topBound, bottomBound = -1;
    
    public Movement(int controls, Sprite sprite, int windowWidth, int windowHeight)
    {
        affected = sprite;

        rightBound = windowWidth;
        bottomBound = windowHeight;

        switch(controls)
        {
            case WASD:
                moveWASD();
                break;
            case ARROW_KEYS:
                moveArrows();
                break;
            default:
                moveArrows();
        }
    }

    public Movement(char up, char down, char left, char right, Sprite sprite, int windowWidth, int windowHeight)
    {
        controls[0] = (int) up;
        controls[1] = (int) down;
        controls[2] = (int) left;
        controls[3] = (int) right;
    }

    private void moveWASD()
    {
        controls[0] = (int) 'W';
        controls[1] = (int) 'S';
        controls[2] = (int) 'A';
        controls[3] = (int) 'D';
    }
    
    private void moveArrows()
    {
        controls[0] = 38; //keycode for up arrow
        controls[1] = 40; //keycode for down arrow
        controls[2] = 37; //keycode for left arrow
        controls[3] = 39; //keycode for right arrow
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        //up
        if(e.getKeyCode() == controls[0])
        {
            boolUp = true;
        }
        //down
        if(e.getKeyCode() == controls[1])
        {
            boolDown = true;
        }
        //left
        if(e.getKeyCode() == controls[2])
        {
            boolLeft = true;
        }
        //right
        if(e.getKeyCode() == controls[3])
        {
            boolRight = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        //up
        if(e.getKeyCode() == controls[0])
        {
            boolUp = false;
        }
        //down
        if(e.getKeyCode() == controls[1])
        {
            boolDown = false;
        }
        //left
        if(e.getKeyCode() == controls[2])
        {
            boolLeft = false;
        }
        //right
        if(e.getKeyCode() == controls[3])
        {
            boolRight = false;
        }
    }

    public void checkMovement()
    {
        if(affected.getX() > leftBound)
            lBound = true;
        else
            lBound = false;

        if(affected.getX() < rightBound - affected.getSize()[0])
            rBound = true;
        else
            rBound = false;

        if(affected.getY() < bottomBound - affected.getSize()[1] - WINDOW_PADDING)
            bBound = true;
        else
            bBound = false;

        if(affected.getY() > topBound)
            tBound = true;
        else
            tBound = false;
            
        y = affected.getY();
        x = affected.getX();
        
        //up
        if(boolUp && tBound)
        {
            affected.setY(y - speed);
        }
        //down
        if(boolDown && bBound)
        {
            affected.setY(y + speed);
        }
        //left
        if(boolLeft && lBound)
        {
            affected.setX(x - speed);
        }
        //right
        if(boolRight && rBound)
        {
            affected.setX(x + speed);
        }
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public int getLeftBound()
    {
        return leftBound;
    }

    public void setLeftBound(int leftBound)
    {
        this.leftBound = leftBound;
    }

    public int getTopBound()
    {
        return topBound;
    }

    public void setTopBound(int topBound)
    {
        this.topBound = topBound;
    }

    public int getRightBound()
    {
        return rightBound;
    }

    public void setRightBound(int rightBound)
    {
        this.rightBound = rightBound;
    }

    public int getBottomBound()
    {
        return bottomBound;
    }

    public void setBoolDown(boolean boolDown)
    {
        this.boolDown = boolDown;
    }

    @Override
    public void keyTyped(KeyEvent e){}
}