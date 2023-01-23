// package Clock;

// //import Map.Dynamic;
// import Sprite.SpriteSheet;
// import Window.GameFrame;
// import Window.GamePanel;

// public class FrameClock
// {
//     private static long currentNano = System.nanoTime();
//     private static long lastTime = System.nanoTime();
//     private static double deltaFrame = 0;

//     public static void renderFrame(GamePanel panel, GameFrame frame, SpriteSheet sheet, double fpns)
//     {
//         currentNano = System.nanoTime();

//         deltaFrame += ((currentNano - lastTime) / fpns);

//         lastTime = currentNano;

//         while(deltaFrame >= 1)
//         {
//             //Dynamic.spriteManipulation(sheet);
//             panel.repaint();
//             frame.repaint();
//             deltaFrame -= 1;
//         }
//     }
// }
