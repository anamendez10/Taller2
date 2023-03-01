import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Persona extends Thread{
    public void run()
    {
        Ventana4();
    }

    public static void Ventana4()
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setTitle("Ventana");
        frame.setLocation(500, 400);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setSize(500, 400);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);

        JLabel titulo = new JLabel("HECHO POR:");
        JLabel nombre = new JLabel("Nombre: Ana Sofía Méndez Ramírez");
        JLabel carrera = new JLabel("Carrera: Tecnología en Desarrollo de Software");
        JLabel codigo = new JLabel("Código: 2220211008");
        JLabel semestre = new JLabel("Semestre: 5to");
        JLabel nacimiento = new JLabel("Fecha de nacimiento: 10-11-2003");
        JLabel edad = new JLabel("Edad: 19");

        panel.add(titulo);
        panel.add(nombre);
        panel.add(carrera);
        panel.add(codigo);
        panel.add(semestre);
        panel.add(nacimiento);
        panel.add(edad);
    }
}