import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Tile extends Rectangle{
	public Tile(int x, int y) {
		setBounds(x,y,32,32);
	}
	public void render(Graphics g) {
		g.setColor(new Color(0,38,255));
		g.fillRect(x, y, width, height);
	}
}
