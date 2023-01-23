package Sprite;

public class Transformations
{
    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    public void glide(Sprite affected, int direction, double speed)
    {
        double x = affected.getX();
        double y = affected.getY();

        switch(direction)
        {
            case UP:
                affected.setY(y -= speed);
                break;
            case DOWN:
                affected.setY(y += speed);
                break;
            case LEFT:
                affected.setX(x -= speed);
                break;
            case RIGHT:
                affected.setX(x += speed);
                break;
            default:
        }
    }
    public void oscillate(Sprite affected, double speed, int x1, int y1, int x2, int y2)
    {

    }
}