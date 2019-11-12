/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPonents;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;

/**
 *
 * @author thang
 */
public class DemoLabel extends Applet
{
	private Label label;
      
        @Override
	public void init()
	{
		Font font = new Font("Courier", Font.BOLD, 20);
		label = new Label("Thu nghiem voi Label");
		label.setFont(font);
		this.add(label);
	}
        @Override
	public void paint(Graphics g)
	{
		showStatus("Noi dung cua Label la: " + label.getText());
	}
}
