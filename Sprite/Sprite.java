package Sprite;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Sprite
{
    private BufferedImage sprite = null;
    private int[] size = new int[2];
    private double x, y = 0;

    public Sprite(String path) throws IOException
    {
        sprite = getImage(path);
        this.x = 0;
        this.y = 0;
    }

    private BufferedImage getImage(String path) throws IOException
    {
        BufferedImage img = ImageIO.read(new File(path));
        
        size[0] = img.getWidth();
        size[1] = img.getHeight();

        return img;
    }

    public BufferedImage getSprite()
    {
        return sprite;
    }

    public int[] getSize()
    {
        return size;
    }

    public void setSize(int width, int height)
    {
        Image temp = sprite.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage rescaled = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        
        Graphics2D g2d = rescaled.createGraphics();
        g2d.drawImage(temp, 0, 0, null);
        g2d.dispose();
        
        sprite = rescaled;

        int[] size = {width, height};
        this.size = size;
    }

    // public void lerpSize(int[] size, float time)
    // {

    // }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}