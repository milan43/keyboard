/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.AsynchronousFileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Meelon
 */
public class Result extends javax.swing.JFrame implements Printable, ActionListener {

    Cursor cursor = new Cursor(HAND_CURSOR);
    String user;
    int evt;
    int count;
    ImageIcon icon = null;
    int timeleng;
    ImageIcon icon1 = new ImageIcon(getClass().getResource("images/milan.jpg"));
    ImageIcon facebook = new ImageIcon(getClass().getResource("images/Facebook_icon.jpg"));
    ImageIcon twitter = new ImageIcon(getClass().getResource("images/twitter.png"));
    ImageIcon gmail = new ImageIcon(getClass().getResource("images/gmail.png"));
    ImageIcon instagram = new ImageIcon(getClass().getResource("images/instagram.jpg"));
    Font f = new Font("arial", Font.ITALIC, 18);
    Font f1 = new Font("Display", Font.ITALIC, 27);
    JPanel panel;
    //private BufferedImage image;
    ImageIcon fish;
    JLabel follow;
    JButton fb;
    JButton tw;
    JButton in;
    JButton gm;
    JLabel copyright;

    public Result() throws IOException {
        super();
//        image = ImageIO.read(new File("fish.jpg"));
//        fish = new ImageIcon(image);

        initComponents();
//        about = new JDialog(this, true);
    }

    public Result(int count, int evt, String user, ImageIcon icon, int timeleng) {
        super();
        initComponents();
        this.count = count;
        // System.out.println("error" + count);
        this.evt = evt;
        // System.out.println("typed" + evt);
        this.user = user;
        // System.out.println("user" + user);
        this.icon = icon;
//        if (icon == null) {
//            icon = new ImageIcon(getClass().getResource("/images/java.jpg"));
//        }

        this.timeleng = timeleng;
        System.out.println("timelag    " + timeleng);
        getInfo();
    }

    public void getInfo() {
        int errorrate = (count * 100) / evt;
        System.out.println("errorrate" + errorrate);
        System.out.println("tim,ekdkas  " + timeleng);
        int speed = evt / (4 * (timeleng / 60000));
        System.out.println("speed" + speed);
        uname.setText(user);
        System.out.println("user name" + user);
        errorrates.setText(Integer.toString(errorrate) + "%");
        speedrate.setText(Integer.toString(speed) + "w/m");
        errors.setText(Integer.toString(count));
        imageic.setIcon(icon);
        if (timeleng == 60000) {
            jLabel3.setText("01:00 m");
        } else if (timeleng == 120000) {
            jLabel3.setText("02:00 m");
        } else if (timeleng == 180000) {
            jLabel3.setText("03:00 m");
        } else {
            jLabel3.setText("04:00 m");
        }
    }

//    public void ge() {
//        int errorrate = (count / evt) * 100;
//        int speed = evt / 60;
//        uname.setText(user);
//        errors.setText(Integer.toString(errorrate));
//        speedrate.setText(Integer.toString(speed));
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        imageic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errors = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        errorrates = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        speedrate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Information");
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setResizable(false);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Thanks For Visiting");

        uname.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        uname.setText("USER");

        imageic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keyboard/images/images (12).jpg"))); // NOI18N
        imageic.setMaximumSize(new java.awt.Dimension(284, 177));
        imageic.setMinimumSize(new java.awt.Dimension(284, 177));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("5:00m");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Error");

        errors.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        errors.setText("0");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Error Rate");

        errorrates.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        errorrates.setText("1%");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Speed");

        speedrate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        speedrate.setText("0 w/m");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Total Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errorrates, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(speedrate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errors, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imageic, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imageic, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errors, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorrates, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedrate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton2.setText("Restart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("About ");
        jLabel5.setToolTipText("click here");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        Boolean b = job.printDialog();
        if (b) {
            try {
                job.print();
                JOptionPane.showMessageDialog(null, "Printed");
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, ex.getStackTrace());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Printing in Process");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Welcome().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
       
        about = new JDialog(this, true);
        about.setBounds(200, 150, 355, 385);

        panel = new JPanel(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(1, 201, 349, 179);

        img = new JLabel(icon1);
        img.setBounds(0, 1, 183, 200);
        label1 = new JTextArea();
        label1.setBounds(185, 1, 165, 200);
        label1.setEditable(false);
        label1.setLineWrap(true);
        label1.setBackground(Color.GRAY);
        label1.setForeground(Color.BLACK);

        follow = new JLabel("Follow Me!!!");
        follow.setFont(f1);
        follow.setBounds(110, 10, 150, 50);
        fb = new JButton(facebook);
        in = new JButton(instagram);
        tw = new JButton(twitter);
        gm = new JButton(gmail);
        copyright = new JLabel("Copyright @ 2016");
        copyright.setFont(f);
        copyright.setForeground(Color.BLUE);

        fb.setBounds(30, 60, 60, 60);
        tw.setBounds(110, 60, 60, 60);
        in.setBounds(190, 60, 60, 60);
        gm.setBounds(270, 60, 60, 60);
        copyright.setBounds(100, 125, 250, 22);

        fb.setCursor(cursor);
        tw.setCursor(cursor);
        in.setCursor(cursor);
        gm.setCursor(cursor);

        panel.add(follow);
        panel.add(fb);
        panel.add(tw);
        panel.add(in);
        panel.add(gm);
        panel.add(copyright);

        label1.setText(""
                + "Hi! I'm Milan Paudyal.This is a simple typing application developed using java swing "
                + "that may be useful to improve your typing.");
        label1.setFont(f);
        about.setLayout(null);
        about.setResizable(false);
        about.add(img);
        about.add(label1);
        about.add(panel);

        fb.addActionListener(this);
        tw.addActionListener(this);
        in.addActionListener(this);
        gm.addActionListener(this);
        about.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Result().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorrates;
    private javax.swing.JLabel errors;
    private javax.swing.JLabel imageic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel speedrate;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
   JDialog about;
    JLabel img;
    JTextArea label1;

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D gdp = (Graphics2D) graphics;
        gdp.translate(pageFormat.getImageableX()+190, pageFormat.getImageableY()+50);
        jPanel1.printAll(graphics);
        return PAGE_EXISTS;
    }

    public static void main(String[] args) throws IOException {
        new Result().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String url;
        if (e.getSource() == fb) {
            url = "https://www.facebook.com/mlnpdl";
            openWeb(url);
        } else if (e.getSource() == tw) {
            url = "https://twitter.com/mealone43/about/resources/buttons#follow";
            openWeb(url);
        } else if (e.getSource() == in) {
            url = "https://www.instagram.com/milanpaudyal/";
            openWeb(url);
        } else if (e.getSource() == gm) {
            url = "https://plus.google.com/u/0/108367460545396434689";
            openWeb(url);
        }

    }

    public static void openWeb(String url) {
        try {
            Desktop.getDesktop().browse(URI.create(url));

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
