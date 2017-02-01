/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard.typegame;

/**
 *
 * @author Meelon
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TypingGame1 extends JPanel implements ActionListener {

    JPanel main;
    JPanel panel;
    Container c;
    JTextField field;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel score;
    JPanel life;
    JButton start;
    JLabel words;
    JLabel count;
    JLabel info;
    ImageIcon icon;
    int x = 50;
    int y = 300;
    int z = 300;
    Timer t;
    String word = "Hello";
    Font f = new Font("ARIAL", Font.BOLD, 20);

    //ImageIcon panelbg;
    TypingGame1() {
        main = new JPanel();
        t = new Timer(1000, this);
        System.out.println("Constructor");
        icon = new ImageIcon(getClass().getResource("life.jpg"));
        ImageIcon imageIcon = new ImageIcon((getClass().getResource("gamebg.jpg")));

        //panelbg = new ImageIcon("images/12027647_1634458913503157_542355314541447901_n.png");
        info = new JLabel("k xa");
        panel = new JPanel(null);
        JLabel image = new JLabel(imageIcon);
        panel.add(image);
        panel.setBackground(Color.red);
        field = new JTextField();
        label1 = new JLabel(icon);
        label2 = new JLabel(icon);
        label3 = new JLabel(icon);
        score = new JLabel("Score");
        life = new JPanel();
        start = new JButton("Start");
        count = new JLabel("0");
        // words = new JLabel("Hello");

        main.setBounds(100, 100, 500, 500);
        this.add(main);
        main.setBackground(Color.red);
        main.add(panel);
        System.out.println("Panel added");
        panel.add(field);
        life.add(label1);
        life.add(label2);
        life.add(label3);
        main.add(life);
        life.add(count);
        life.add(score);

        info.setBounds(100, 200, 100, 50);
        label1.setBounds(260, 10, 90, 70);
        label2.setBounds(330, 10, 90, 70);
        label3.setBounds(400, 10, 90, 70);
        life.setBounds(0, 0, 500, 80);
        score.setBounds(120, 20, 100, 50);
        count.setBounds(220, 20, 100, 50);
        panel.setBounds(0, 70, 500, 430);
//        words.setBounds(50, 300, 80, 25);

        //image.setBounds(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight());
        // field.setEditable(true);
        field.setBounds(270, 300, 200, 30);
        panel.add(field);
        // panel.add(words);

        count.setFont(f);
        score.setFont(f);
//        words.setFont(f);
        panel.add(info);

        panel.setBackground(Color.MAGENTA);
        life.setBackground(Color.GRAY);

        start.setBounds(10, 18, 80, 50);
        life.add(start);
        System.out.println("Cons finished");
        this.setVisible(true);
    }

    String[] s = {"Hello", "Thank", "Okay", "Morning", "Nepal", "Pigeon", "Mountain", "ox", "temper"};

    int lifetime = 1;
    int i = 0;

    @Override
    public void paintComponent(Graphics g) {
        System.out.println("Painting");
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g;
        gd.setColor(Color.red);
        gd.setFont(f);
        gd.drawString(word, x, y);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action Performed");
        //  Timer timer = new Timer(1000, this);
        if (y < 0 || y < 430) {
            y += 50;
        }

        repaint();

        System.out.println("Repaint");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        frame.setBackground(Color.YELLOW);
        frame.setResizable(false);
        frame.add(new TypingGame1());
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
