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

    //FPS
    int FPS = 60;

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

        double drawInterval = 1000000000/FPS; // 0.01666 sekunden
        double nextDrawTime = System.nanoTime() + drawInterval;

        while(gameThread != null) {

            //1 UPDATE: update information wie Charakter position
            update();

            // 2 DRAW: Zeige Bildschirm mit updated information
            repaint();

            double remainingTime = nextDrawTime
        }
    }
    public void update() {
        if(keyH.upPressed) {
            playerY -= playerSpeed;
        } else if (keyH.downPressed) {
            playerY += playerSpeed;
        } else if (keyH.leftPressed) {
            playerX -= playerSpeed;
        } else if (keyH.rightPressed) {
            playerX += playerSpeed;
        }
    }
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.white);

        g2.fillRect(playerX, playerY, tileSize, tileSize);

        g2.dispose();
    }

}
