import java.io.IOException;
import java.awt.Component;

import Map.Static;
import Movement.Movement;
import Sprite.Sprite;
import Sprite.SpriteSheet;
import Window.GameFrame;
import Window.GamePanel;

public class Main
{
    public static GameFrame frame;
    public static GamePanel panel;
    public static SpriteSheet sheet;
    public static Movement move;
    public static Clock clock;
    public static Static still;

    private static final int WINDOW_WIDTH = 900;
    private static final int WINDOW_HEIGHT = 600;
    private static final boolean RESIZABLE = false;
    
    private static final int FPS = 60;
    private static final int TPS = 60;

    public static void main(String[] args) throws IOException
    {
        sheet = new SpriteSheet();
        still = new Static(sheet);

        move = new Movement(Movement.ARROW_KEYS, sheet.last(3), WINDOW_WIDTH, WINDOW_HEIGHT);
        move.setSpeed(3);
        
        Sprite[][] draw = sheet.getSprites();
        panel = new GamePanel(draw);
        
        Component[] components = {panel};
        frame = new GameFrame(WINDOW_WIDTH, WINDOW_HEIGHT, RESIZABLE, components, move);

        clock = new Clock(move, panel, frame, sheet, FPS, TPS);
    }
}