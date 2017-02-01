///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package keyboard.typegame;
//
///**
// *
// * @author Meelon
// */
//import java.awt.Graphics;
//import javax.swing.*;
//import java.awt.event.AWTEventListener.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class TypeHere extends JPanel implements ActionListener {
//
//    ImageIcon icon = new ImageIcon(getClass().getResource("life.jpg"));
//    Timer t = new Timer(1000, this);
//    int x = 20;
//    int y = 470;
//    JLabel label;
//
//    TypeHere() {
//        label = new JLabel(icon);
//        this.add(label);
//        label.setBounds(20, 470, 50, 50);
//    }
//
//    @Override
//    public void paintComponent(Graphics g) {
//        System.out.println("Paint");
//
//        label.paint(gd);
//
//        t.start();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("Action");
//        if (x < 500 && y < 500) {
//            y -= 50;
////        }else{
////            t.stop();
//        }
//        repaint();
//    }
//
//    public static void main(String[] args) {
//
//        TypeHere typeHere = new TypeHere();
//        JFrame frame = new JFrame();
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(200, 150, 500, 500);
//        frame.setResizable(false);
//        frame.add(typeHere);
//        frame.setVisible(true);
//    }
//
//}
