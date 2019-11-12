/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPonents;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thang
 */
public class DemoButton extends Applet implements ActionListener {

    private Button blueButton;
    private Button whiteButton;
    private Button helloButton;

    @Override
    public void init() {
        blueButton = new Button("Blue");
        whiteButton = new Button("White");
        helloButton = new Button("Hello");
        blueButton.addActionListener(this);
        whiteButton.addActionListener(this);
        helloButton.addActionListener(this);
        add(blueButton);
        add(whiteButton);
        add(helloButton);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == helloButton) {
            javax.swing.JOptionPane.showMessageDialog(this, "Hello !");
        } else {
            if (event.getSource() == blueButton) {
                this.setBackground(Color.BLUE);
            } else if (event.getSource() == whiteButton) {
                this.setBackground(Color.WHITE);
            }
            repaint();
        }
    }
}
