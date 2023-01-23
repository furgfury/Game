package Sprite;
import java.io.IOException;

public class SpriteSheet
{
    //add new sprites here
    //background sprites
    private Sprite background = new Sprite("/Users/quinnfurgueson/Desktop/Folders/Programming/Java/Game/Images/Backgrounds/background.jpg");

    //player sprites
    private Sprite joe = new Sprite("/Users/quinnfurgueson/Desktop/Folders/Programming/Java/Game/Images/Sprites/joever.png");

    //add sprites in reverse order of how you would like them to be layered
    //they will be rendered within the array from top to bottom, first rendered
    //at the bottom layer, last rendered at top layer
    //they will be rendered in order of background -> static -> dynamic -> player
    //background at the bottom layer, player at top layer
    private Sprite[] backgroundSprites = {
        background,
    };

    private Sprite[] staticSprites = {

    };

    private Sprite[] dynamicSprites = {

    };

    private Sprite[] playerSprites = {
        joe,
    };

    private Sprite[][] sprites = {
        backgroundSprites,
        staticSprites,
        dynamicSprites,
        playerSprites,
    };


    public SpriteSheet() throws IOException {}

    public Sprite[][] getSprites()
    {
        return sprites;
    }

    public Sprite getSpriteIndex(int group, int index)
    {
        return sprites[group][index];
    }

    public Sprite last(int group)
    {
        return sprites[group][sprites[group].length - 1];
    }
}