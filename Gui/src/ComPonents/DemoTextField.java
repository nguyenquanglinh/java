/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPonents;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 *
 * @author thang
 */
public class DemoTextField extends Applet implements ActionListener, TextListener {

    private TextField txtEdit;
    private TextField txtReadOnly;
    private TextField txtPass;
    private final String PASSWORD = "Java";

    @Override
    public void init() {
        txtEdit = new TextField("Your name here");
        txtEdit.addTextListener(this);
        txtPass = new TextField(12);
        txtPass.setEchoChar('*');
        txtPass.addActionListener(this);
        txtReadOnly = new TextField("This text is read only");
        txtReadOnly.setEditable(false);
        add(txtEdit);
        add(txtPass);
        add(txtReadOnly);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (txtPass.getText().equals(PASSWORD)) {
            txtReadOnly.setText("Password is valid");
        } else {
            txtReadOnly.setText("Invalid password !");
        }
    }

    @Override
    public void textValueChanged(TextEvent evt) {
        txtReadOnly.setText(txtEdit.getText());
    }

  
}


