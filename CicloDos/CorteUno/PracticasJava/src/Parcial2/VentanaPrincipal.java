package Parcial2;

import javax.swing.*; // Libreria para hacer ventanas
import java.awt.event.ActionEvent; // Libreria para manejar eventos de botones
import java.awt.event.ActionListener; // Clase principal que crea la ventana y maneja la interacción, todos necesarios para este trabajo

public class VentanaPrincipal extends JFrame {
    private JTextField txtNombre;
    private JTextField txtCalificacion;
    private JButton btnEvaluar;
    private JTextArea areaResultado;

    public VentanaPrincipal() {
        // Configuramos la ventana
        setTitle("Evaluador de Estudiantes");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usamos null layout para poner las cosas manual (más fácil)

        // Cuadritos y campos de texto
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 20, 200, 25);
        add(txtNombre);

        JLabel lblNota = new JLabel("Nota (0-10):");
        lblNota.setBounds(20, 60, 80, 25);
        add(lblNota);

        txtCalificacion = new JTextField();
        txtCalificacion.setBounds(100, 60, 200, 25);
        add(txtCalificacion);

        // Boton
        btnEvaluar = new JButton("Evaluar");
        btnEvaluar.setBounds(100, 100, 100, 30);
        add(btnEvaluar);

        // Area donde sale el resumen
        areaResultado = new JTextArea();
        areaResultado.setBounds(20, 150, 280, 80);
        areaResultado.setEditable(false);
        add(areaResultado);

        // Le damos acción al botón
        btnEvaluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNombre.getText();
                    int nota = Integer.parseInt(txtCalificacion.getText());

                    // Validamos que sea del 0 al 10
                    if (nota < 0 || nota > 10) {
                        areaResultado.setText("Ojo, la nota debe ser entre 0 y 10");
                        return;
                    }

                    // Creamos el objeto y sacamos el texto
                    Estudiante est = new Estudiante(nombre, nota);
                    areaResultado.setText(est.getResumen());

                } catch (NumberFormatException ex) {
                    areaResultado.setText("Por favor mete un número valido, burro xd");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Arrancamos la ventana
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}