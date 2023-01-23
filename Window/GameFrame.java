package Window;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JFrame;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame
{
    private int width;
    private int height;

    public GameFrame(int width, int height, boolean resizable, Component[] comp, KeyListener move)
    {
        this.width = width;
        this.height = height;

        for(int i = 0; i < comp.length; i++)
        {
            add(comp[i]);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(width, height));
        setResizable(resizable);
        addKeyListener(move);
        setVisible(true);
    }

    @Override
    public int getWidth()
    {
        return width;
    }
    
    @Override
    public int getHeight()
    {
        return height;
    }
}