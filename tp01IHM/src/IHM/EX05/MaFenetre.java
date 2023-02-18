package IHM.EX05;

import javax.swing.*;
import java.awt.*;
public class MaFenetre extends JFrame {
    JButton reveButton; JButton foiButton; JButton implicationButton;
    JButton butsButton; JButton actionButton;
    public MaFenetre() {
        super("Cinq clés de la réussite");
        setSize(348, 128); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout(); setLayout(flo);
        reveButton = new JButton("LE RÊVE");
        foiButton = new JButton("LA FOI");
        implicationButton = new JButton("L’IMPLICATION");
        butsButton = new JButton("LES BUTS");
        actionButton = new JButton("L’ACTION");
        add(reveButton); add(foiButton); add(implicationButton); add(butsButton);
        add(actionButton);}
}

