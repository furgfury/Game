import Map.Dynamic;
import Movement.Movement;
import Sprite.SpriteSheet;
import Window.GameFrame;
import Window.GamePanel;

public class Clock
{
    private static final long TO_NANO = 1000000000;

    private static long currentNano = System.nanoTime();
    private static long lastTime = System.nanoTime();
    private static double deltaFrame, deltaTick = 0;

    public Clock(Movement move, GamePanel panel, GameFrame frame, SpriteSheet sheet, int fps, int tps)
    {
        runClock(move, panel, frame, sheet, (double) (TO_NANO / fps), (double) (TO_NANO /tps));
    }

    private void runClock(Movement move, GamePanel panel, GameFrame frame, SpriteSheet sheet, double fpns, double tpns)
    {
        while(true)
        {
            currentNano = System.nanoTime();

            deltaFrame += ((currentNano - lastTime) / fpns);
            deltaTick += ((currentNano - lastTime) / tpns);

            while(deltaTick >= 1)
            {
                Dynamic.spriteManipulation(sheet);
                move.checkMovement();
                deltaTick -= 1;
            }
        
            while(deltaFrame >= 1)
            {
                panel.repaint();
                frame.repaint();
                deltaFrame -= 1;
            }

            lastTime = currentNano;
        }
    }
}