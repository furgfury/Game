package Map;

import Sprite.SpriteSheet;
import Sprite.Transformations;

public class Dynamic
{
    private static final double SPEED = 0.2;

    private static Transformations transformations;

    public static void spriteManipulation(SpriteSheet sheet)
    {
        transformations = new Transformations();
        //do transformations here

        //transformations.glide(sheet.getSpriteIndex(0, 0), Transformations.DOWN, SPEED);
        transformations.oscillate(sheet.getSpriteIndex(0, 0), SPEED, 200, 0, 20, 100);

    }
}