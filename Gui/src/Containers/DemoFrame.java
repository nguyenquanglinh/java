/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author thang
 */
public class DemoFrame {
    public static void main(String[] args)
	{
		Frame frame = new Frame("Example on Frame");
		Label label = new Label("This is a label in Frame",Label.CENTER);
		frame.add(label, BorderLayout.CENTER);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.addWindowListener(new MyWindowListener());
	}
}
class MyWindowListener extends WindowAdapter
{
        @Override
	public void windowClosing(WindowEvent event)
	{        JOptionPane.showMessageDialog(null, "Exit");
		System.exit(0);
	}
}


