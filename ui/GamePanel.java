package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTreeUI;

/**
 * @author Pawiancoder, Augenringe
 */

public class GamePanel extends JPanel implements Runnable {

    //Bildschirm Einstellungen
    final int originalTilesize = 16; //16x16 Tile
    final int Scale = 3;

    final int tileSize = originalTilesize * Scale; //48x48 Tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenwidth = tileSize * maxScreenCol; // 768 pixel
    final int screenHeight = tileSize * maxScreenRow; // 576 pixel

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;

    //Setze Standart position des Spielers
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenwidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while(gameThread != null) {
            // 1 UPDATE: update information wie Charakter position
            update();

            // 2 DRAW:
        }
    }

}
