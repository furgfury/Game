package Map;

import Sprite.SpriteSheet;

public class Static
{
    private static final int WINDOW_WIDTH = 900;
    private static final int WINDOW_HEIGHT = 600;

    public Static(SpriteSheet sheet)
    {
        editSprites(sheet);
    }

    private static void editSprites(SpriteSheet sheet)
    {
        //change sizes and init positions here
        sheet.getSpriteIndex(0, 0).setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    }
}