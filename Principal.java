import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame{

    public static void main(String[] args) {
        
        Contenedor();
        Cancion cancion = new Cancion();
        Informacion informacion = new Informacion();
        Ventana ventana = new Ventana();
        Persona persona = new Persona();

        cancion.Src("jazz.wav");

        cancion.start();
        informacion.start();
        ventana.start();
        persona.start();
    }

    public static void Contenedor()
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setTitle("Cancion");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocation(0, 0);
        
        JLabel label = new JLabel("Cierra esta ventana para que deje de sonar la música");

        frame.setVisible(true);
        frame.add(label);
    }
    // Hacer una ventana con 4 "div's" donde se vea que todo se está ejecutando en simultaneo, luego que salga el option pane 
    // diciendo que si se quiere cerrar la ventana tiene que dar "OK"

}