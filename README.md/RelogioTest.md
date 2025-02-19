# Projeto RelogioTest

Este projeto é uma aplicação Java que exibe um relógio digital em uma interface gráfica utilizando a biblioteca Swing. O relógio é atualizado a cada segundo. Este projeto foi criado como base para aprender a fazer o projeto **RelogioSwing**.

## Funcionalidades

- Exibe a hora atual em formato digital (HH:mm:ss).
- Atualiza a hora automaticamente a cada segundo.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Swing**: Biblioteca para construção de interfaces gráficas em Java.

## Estrutura do Projeto

O projeto contém a seguinte classe principal:

- **RelogioTest**: Classe que cria a interface do relógio e atualiza a hora.

### Classe `RelogioTest`

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RelogioTest {
    private JLabel label;

    public RelogioTest() {
        // Configuração da janela do relógio
        JFrame frame = new JFrame("Relógio");
        label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 48));
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Timer para atualizar o relógio a cada segundo
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
        new RelogioTest();
    }
}
