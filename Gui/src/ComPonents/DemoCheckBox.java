/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPonents;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author thang
 */
public class DemoCheckBox extends Applet implements ItemListener
{
	private Checkbox checkBold;
	private Checkbox checkItalic;
	private TextField txtText;
        @Override
	public void init()
	{
		checkBold = new Checkbox("Bold");
		checkItalic = new Checkbox("Italic");
		checkBold.addItemListener(this);
		checkItalic.addItemListener(this);
		txtText = new TextField("Sample Text", 16);
		Font font = new Font("Courier", Font.PLAIN, 14);
		txtText.setFont(font);
                add(txtText);
		add(checkBold);
		add(checkItalic);
	}
        @Override
	public void itemStateChanged(ItemEvent event)
	{
		int valBold = Font.PLAIN;
		int valItalic = Font.PLAIN;
		if(checkBold.getState()) valBold = Font.BOLD;
		if(checkItalic.getState()) valItalic = Font.ITALIC;
		Font  font = new Font("Courier", valBold + valItalic, 14);
		txtText.setFont(font);
	}


}
