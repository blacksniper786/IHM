package IHM.Ex04;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class solution extends JFrame {
    // JFrame
    static JFrame f;
// JButton
    static JButton b, b1, b2;
    // label (étiquette) pour afficher le texte
    static JLabel l;
    // classe main
    public static void main(String[] args){
// créer un nouveau frame pour stocker un champ de texte et un bouton
        f = new JFrame("Panel contenant des boutons");
// créer un label pour afficher un texte
        l = new JLabel("panel label");
// créer des nouveaux boutons
        b = new JButton("Bouton1");
        b1 = new JButton("Bouton2");
        b2 = new JButton("Bouton3");
// créer un panel pour ajouter des boutons
        JPanel p = new JPanel();
// add boutons et label au panel
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l);
// set le background du panel
        p.setBackground(Color.red);
// add le panel au frame
        f.add(p);
// set la taille du frame
        f.setSize(300, 300);
        f.setVisible(true);
    }
}

