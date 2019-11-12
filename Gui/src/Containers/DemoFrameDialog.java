/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thang
 */
public class DemoFrameDialog {
    public static void main(String[] args)
	{
		MyFrame myFrame = new MyFrame("Example on my frame");
		myFrame.setSize(500, 400);
		myFrame.setVisible(true);
		myFrame.addWindowListener(new WindowAdapter()
		{
                        @Override
			public void windowClosing(WindowEvent e){System.exit(0);
		}});
	}

}

