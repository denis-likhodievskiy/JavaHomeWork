package com.pb.likhodievskiy.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Client());
    }

    public void run() {
        try {
            Socket server = new Socket("127.0.0.1", 1234);
            BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
            PrintWriter outServer = new PrintWriter(server.getOutputStream(), true);

            JFrame frame = new JFrame ("Client");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(600, 400);

            JTextField jTextField = new JTextField(15);

            JLabel jLabel = new JLabel("<html>Messages:</html>");

            JButton jButton = new JButton("Submit");
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        String dataFromUser = jTextField.getText();
                        if (dataFromUser.isEmpty()) {
                            JOptionPane.showMessageDialog(null,"Enter message","Info",
                                    JOptionPane.WARNING_MESSAGE);
                        } else {
                            String jLabelText = jLabel.getText();

                            outServer.println(dataFromUser);
                            jLabel.setText("<html>" + jLabelText.substring(6, jLabelText.length() - 6) + "<br>" + inServer.readLine() + "</html>");
                            jTextField.setText("");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            frame.add(jTextField, BorderLayout.NORTH);
            frame.add(jLabel, BorderLayout.CENTER);
            frame.add(jButton, BorderLayout.SOUTH);

            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}