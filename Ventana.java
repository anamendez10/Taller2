import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends Thread{
    public void run()
    {
        Ventana3();
    }

    public static void Ventana3()
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setTitle("Ventana");
        frame.setLocation(1000, 0);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setSize(500, 400);

        frame.add(panel);

        int numero = 0;
        
        for(int i = 0; i <= 100; i++)
        {
            numero = i;
            JLabel label = new JLabel("" +  numero);
            panel.add(label);
        }

        

        
    }
}
