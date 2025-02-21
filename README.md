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
```
##
<br>
<br>
<br>

# Projeto RelogioSwing/src/TelaRelogio

Este projeto é uma aplicação Java que exibe a data e a hora atuais em uma interface gráfica. A aplicação utiliza a biblioteca Swing para criar a interface do usuário.

## Funcionalidades

- Exibe a data e a hora atuais quando o botão "Carregar Data e Hora" é clicado.
- Interface gráfica simples e intuitiva.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Swing**: Biblioteca para construção de interfaces gráficas em Java.

## Estrutura do Projeto

O projeto contém a seguinte classe principal:

- **TelaRelogio**: Classe que estende `javax.swing.JFrame` e contém a lógica para exibir a data e a hora.

### Classe `TelaRelogio`

```java
public class TelaRelogio extends javax.swing.JFrame {
    // Construtor e métodos para inicializar a interface
    public TelaRelogio() {
        initComponents();
    }

    // Método para carregar a data e a hora
    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {
        Date relogio = new Date();
        txt2.setText(relogio.toString());
    }
}
```
