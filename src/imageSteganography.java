import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.event.AncestorListener;

import org.w3c.dom.events.Event;

public class imageSteganography<ActionEvent> {
    private JFrame frame;
    private Component messageField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    imageSteganography window = new imageSteganography();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

        });

    }

    public imageSteganography() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonsPanel = new JPanel();
        frame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        buttonsPanel.setLayout(new GridLayout(0, 2, 0, 0));

        JButton encryptButton = new JButton("Encrypt");

        buttonsPanel.add(encryptButton);

        JButton decryptButton = new JButton("Decrypt");

        buttonsPanel.add(decryptButton);

        JPanel messagePanel = new JPanel();
        frame.getContentPane().add(messagePanel, BorderLayout.CENTER);
        messagePanel.setLayout(null);

        JLabel messageLabel = new JLabel("Message:");
        messageLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        messageLabel.setBounds(40, 58, 72, 26);
        messagePanel.add(messageLabel);
        messageField = new JTextField();
        messageField.setBounds(115, 63, 301, 20);

        messagePanel.add(messageField);
        ((JTextField) messageField).setColumns(10);

        ActionListener encryptListener = new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub
                File imageFile = FileChooser.MakeFileChooser();
                if (imageFile != null) {

                }

            }

        };
        encryptButton.addActionListener((ActionListener) encryptListener);

    }
}
