import java.awt.Color;
import java.awt.Graphics;
public class HUD {
public static int Health = 100;
public static int TowerHealth = 100;

public void tick(){
//Health--;
//TowerHealth --;
Health = Game.clamp(Health, 0, 100);
TowerHealth = Game.clamp(TowerHealth, 0, 500);

}
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(15, 15,200, 32);
        g.setColor(Color.green);
        g.fillRect(15, 15, Health * 2, 32);
        g.setColor(Color.BLACK);
        g.drawRect(15, 15,200, 32);
    }

    public void renderTower(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(15, 80,200, 32);
        g.setColor(Color.BLUE);
        g.fillRect(15, 80, TowerHealth * 2, 32);
        g.setColor(Color.black);
        g.drawRect(15, 80,200, 32);
    }

}
