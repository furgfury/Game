// package Clock;

// import Movement.Movement;

// class TickClock
// {
//     private static long currentNano = System.nanoTime();
//     private static long lastTime = System.nanoTime();
//     private static double deltaTick = 0;

//     public static void renderTick(Movement move, double tpns)
//     {
//         currentNano = System.nanoTime();

//         lastTime = currentNano;

//         while(deltaTick >= 1)
//         {
//             currentNano = System.nanoTime();

//             deltaTick += ((currentNano - lastTime) / tpns);

//             lastTime = currentNano;

//             while(deltaTick >= 1)
//             {
//                 move.checkMovement();
//                 deltaTick -= 1;
//             }
//         }
//     }
// }