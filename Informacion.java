import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Informacion extends Thread{
    
    public void run()
    {
        Ventana1();
    }

    public static void Ventana1()
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setTitle("Información");
        frame.setLocation(500, 0);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setSize(500, 400);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);

        String bogota = ZonedDateTime.now(ZoneId.of("America/Bogota")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String chicago = ZonedDateTime.now(ZoneId.of("America/Chicago")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String kolkata = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String paris = ZonedDateTime.now(ZoneId.of("Europe/Paris")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String hobart = ZonedDateTime.now(ZoneId.of("Australia/Hobart")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String panama = ZonedDateTime.now(ZoneId.of("America/Panama")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String yukon = ZonedDateTime.now(ZoneId.of("Canada/Yukon")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String samarkand = ZonedDateTime.now(ZoneId.of("Asia/Samarkand")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String dubai = ZonedDateTime.now(ZoneId.of("Asia/Dubai")).format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        

        JLabel colombia = new JLabel("Bogotá: " + bogota);
        colombia.setSize(100, 50);
        JLabel usa = new JLabel("Chicago: " + chicago);
        JLabel corea_sur = new JLabel("Seúl: " + kolkata);
        JLabel gran_bretaña = new JLabel("Londres: " + paris);
        JLabel australia = new JLabel("Londres: " + hobart);
        JLabel panamaa = new JLabel("Panama: " + panama);
        JLabel canada = new JLabel("Yukon: " + yukon);
        JLabel uzbekistan = new JLabel("Samarkand: " + samarkand);
        JLabel emiratos_arabes = new JLabel("Dubai: " + dubai);
        
        panel.add(colombia);
        panel.add(usa);
        panel.add(corea_sur);
        panel.add(gran_bretaña);    
        panel.add(australia);
        panel.add(panamaa);
        panel.add(canada);
        panel.add(uzbekistan);
        panel.add(emiratos_arabes);

    }


}