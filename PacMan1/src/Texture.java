import java.awt.image.BufferedImage;

public class Texture {
	
	public static BufferedImage player;
	public static BufferedImage ghost;
	
	public Texture() {
		player = Game.spritesheet.getSprite(0, 0);
		ghost = Game.spritesheet.getSprite(0, 16);
	}
	
}
