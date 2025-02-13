/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Alisson Kaelan
 */
public class RelogioSwing {
    private JLabel label;

    public RelogioSwing() {
        JFrame frame = new JFrame("Relógio");
        label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 48));
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarRelogio();
            }
        });
        timer.start();
    }

    private void atualizarRelogio() {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        label.setText(formato.format(new Date()));
    }

    public static void main(String[] args) {
        new RelogioSwing();
    }
    
}
