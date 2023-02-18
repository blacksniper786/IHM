package IHM.EX01;
import javax.swing.JFrame;
import javax.swing.JRootPane;
public class TP01 {
    public static void main(final String args[]) {
        JFrame frame = new JFrame("Exemple d’ornement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setUndecorated(true); //(1)
        frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
//la ligne (1) ,when it's commented,we saw two barre on our window ,but when its activated we saw just one
