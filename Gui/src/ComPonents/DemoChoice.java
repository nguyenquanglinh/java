/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPonents;

import java.applet.Applet;
import java.awt.Choice;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author thang
 */
public class DemoChoice extends Applet implements ItemListener {

    private Choice choice;
    private TextField txtText;
    private Font font;

    @Override
    public void init() {
        choice = new Choice();
        choice.addItem("TimesRoman");
        choice.addItem("Courier");
        choice.addItem("Helvetica");
        choice.addItemListener(this);
        txtText = new TextField("Sample Text", 16);
        txtText.setEditable(false);
        font = new Font(choice.getItem(0), Font.PLAIN, 12);
        txtText.setFont(font);
        add(choice);
        add(txtText);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        font = new Font(choice.getSelectedItem(), Font.PLAIN, 12);
        txtText.setFont(font);
    }

}
