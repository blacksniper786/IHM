package IHM.EX02;

import javax.swing.*;

public class Test {
    public static void main (String args[]){
//        Fenetre fen = new Fenetre();
//        fen.setVisible(true);

//        MaFenetre fen = new MaFenetre();
//        fen.setLocationRelativeTo(null);
//        fen.setVisible(true);

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(30, 30, 300, 300);
        f.getContentPane().add(new MyCanvas());
        f.setVisible(true);
    }
}
