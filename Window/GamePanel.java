package Window;
import javax.swing.JPanel;

import Sprite.Sprite;

import java.awt.Graphics;

public class GamePanel extends JPanel
{
    public Sprite[][] sprites;

    public GamePanel(Sprite[][] sprites)
    {
        this.sprites = sprites;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for(int i = 0; i < sprites.length; i++)
        {
            for(int j = 0; j < sprites[i].length; j++)
            {
                g.drawImage(sprites[i][j].getSprite(), (int) sprites[i][j].getX(), (int) sprites[i][j].getY(), null);
            }
        }

        //g.drawImage(sprites[0].getSprite(), (int) sprites[0].getX(), (int) sprites[0].getY(), null);
    }
}