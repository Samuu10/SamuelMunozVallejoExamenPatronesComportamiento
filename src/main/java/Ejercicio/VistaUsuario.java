package Ejercicio;
import javax.swing.*;
import java.awt.*;

//Clase VistaUsuario que extiende de JFrame y representa la interfaz gráfica de usuario
public class VistaUsuario extends JFrame{
    //Atributos
    private JTextArea areaTexto;
    private JButton botonCountUp;
    private JButton botonCountDown;
    private Reverser reverser;

    //Getters & Setters
    public JTextArea getAreaTexto() {
        return areaTexto;
    }
    public void setAreaTexto(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }
    public JButton getBotonCountUp() {
        return botonCountUp;
    }
    public void setBotonCountUp(JButton botonCountUp) {
        this.botonCountUp = botonCountUp;
    }
    public JButton getBotonCountDown() {
        return botonCountDown;
    }
    public void setBotonCountDown(JButton botonCountDown) {
        this.botonCountDown = botonCountDown;
    }
    public Reverser getReverser() {
        return reverser;
    }
    public void setReverser(Reverser reverser) {
        this.reverser = reverser;
    }

    //Constructor
    public VistaUsuario(){
        //Configuramos el JFrame
        setTitle("Prueba de la Parada");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creamos el área de texto
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        add(scrollPane, BorderLayout.CENTER);

        //Creamos los botones
        botonCountUp = new JButton("Probar CountUp");
        botonCountDown = new JButton("Probar CountDown");

        //Creamos el panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(botonCountUp);
        panelBotones.add(botonCountDown);
        add(panelBotones, BorderLayout.NORTH);

        //Creamos una instancia de Reverser y le pasamos esta instancia de VistaUsuario
        reverser = new Reverser(this);

        //Añadimos un ActionListener para el botón CountUp
        botonCountUp.addActionListener(e -> {
            Programa programa = new ProgramaCountUp();
            //Ejecutamos reverse en un hilo separado
            new Thread(() -> reverser.reverse(programa)).start();
        });

        //Añadimos un ActionListener para el botón CountDown
        botonCountDown.addActionListener(e -> {
            Programa programa = new ProgramaCountDown();
            //Ejecutamos reverse en un hilo separado
            new Thread(() -> reverser.reverse(programa)).start();
        });

        setVisible(true);
    }

    //Método que actualiza el área de texto
    public void update(String texto){
        areaTexto.append(texto + "\n");
    }

    //Método principal
    public static void main(String[] args) {
        new VistaUsuario();
    }
}