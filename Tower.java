import java.awt.*;

public class Tower extends GameObject{

    public Tower(int x, int y, ID id){
        super(x, y, id);
    }
    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x, y,50, 50);
    }
}
