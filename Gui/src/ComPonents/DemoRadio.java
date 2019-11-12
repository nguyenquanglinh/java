/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPonents;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author thang
 */
public class DemoRadio extends Applet implements ItemListener
{
	private Checkbox plain, bold, italic;
	private CheckboxGroup group;
	private TextField txtText;
        @Override
	public void init()
	{
		group = new CheckboxGroup();
		plain = new Checkbox("Plain", group,true);
		bold = new Checkbox("Bold", group, false);
		italic = new Checkbox("Italic", group, false);
		txtText = new TextField("Sample Text");
		txtText.setFont(new Font("Courier", Font.PLAIN, 14));
		plain.addItemListener(this);
		bold.addItemListener(this);
		italic.addItemListener(this);
                add(txtText);
		add(plain);
		add(italic);
		add(bold);
	}
        @Override
	public void itemStateChanged(ItemEvent event)
	{
		int mode = 0;
		if(event.getSource() == plain) mode = Font.PLAIN;
		if(event.getSource() == italic) mode = Font.ITALIC;
		if(event.getSource() == bold) mode = Font.BOLD;
		txtText.setFont(new Font("Courier", mode, 14));
	}


}
