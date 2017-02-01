/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard.typegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Meelon
 */
public class MovingText extends JPanel implements ActionListener {

    int x = 20;
    int y = 490;
    int delay = 1000;
    Timer t;
    Font f = new Font("Arial", Font.BOLD, 22);

    public MovingText() {
        t = new Timer(delay, this);
        this.setBackground(Color.ORANGE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D d = (Graphics2D) g;
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Hello", x, y);
        if (delay > 0) {
            delay = delay - 10;
            t.setDelay(delay);
        }
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (y >= 0) {
            y -= 50;
        } else {
            if (x <= 500) {
                x += 50;
            } else {
                x = 20;
            }
            y = 490;
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 150, 500, 500);
        frame.setVisible(true);
        frame.add(new MovingText());
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
