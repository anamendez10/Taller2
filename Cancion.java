import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

public class Cancion extends Thread{
    String src;

    Cancion(){
    }

    public void run()
    {
        File ruta = new File(src);
        try {
            Ventana2();
            AudioInputStream audio = AudioSystem.getAudioInputStream(ruta);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(0);
            //JOptionPane.showMessageDialog(null, "Presionar OK para detener la canción");

        } catch (UnsupportedAudioFileException e) {
           System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
         } catch (LineUnavailableException e) {
            System.out.println(e);
         }
    }

    public void Src(String src)
    {
        this.src = src;
    }

    public static void Ventana2()
    {
        JPanel panel = new JPanel(null);
        panel.setBounds(200, 0, 200, 500); 
        panel.setSize(300, 500);
        panel.setBackground(Color.BLUE);

        JLabel colombia = new JLabel("Hora Colombia");
        colombia.setBounds(200, 0, 100, 40);
        
        panel.add(colombia);
        
    }  
}