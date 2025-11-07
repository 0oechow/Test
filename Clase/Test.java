import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Formulario");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5,5,5,5);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JLabel labelNombre = new JLabel("Nombre:");
            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(labelNombre, gbc);

            JTextField tfNombre = new JTextField(15);
            gbc.gridx = 1;
            panel.add(tfNombre, gbc);

            JButton btnEnviar = new JButton("Enviar");
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 2;
            panel.add(btnEnviar, gbc);

            btnEnviar.addActionListener(e -> {
                String nombre = tfNombre.getText().trim();
                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingresa tu nombre.", "Aviso", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Enviado: " + nombre, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        });
    }
}