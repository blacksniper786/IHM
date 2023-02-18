package IHM.EX03;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/*
public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
//Vous verrez cette phrase chaque fois que la méthode sera invoquée
        System.out.println("Coucou !");
//        g.fillOval(20, 20, 75, 75);
//        g.drawOval(20, 20, 75, 75);
//        g.drawRect(20, 20, 75, 75);
//        g.fillRect(20, 20, 75, 75);
        g.drawString("abdelfatah", 20, 20);
//
//int x1 = this.getWidth()/4;
//int y1 = this.getHeight()/4;
//g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
    }
}
*/
/*
public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
        Font font = new Font("Courier", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.green);
        g.drawString("Salam ! Les étudiants SIR !", 20, 20);
    }
}
*/
/*
public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
        try {
            Image img = ImageIO.read(new File("/home/abdelfatah/Pictures/jvm.png"));
            g.drawImage(img, 0, 0, this);
//Pour une image de fond
//g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
        } catch(IOException e) {
            e.printStackTrace();}
    }
}
*/
public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        GradientPaint gp=new GradientPaint(0,0,Color.black,30,30,Color.white,true);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
//g2d.fillOval(20, 20, 75, 75);
    }
}


