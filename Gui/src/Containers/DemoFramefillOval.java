/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thang
 */
public class DemoFramefillOval {
    public static void main(String[] args)
	{	MyFrame myFrame = new MyFrame("Example on my frame");
		myFrame.setSize(250, 300);
		myFrame.setVisible(true);
		myFrame.addWindowListener(new WindowAdapter() 
		{// Lop nghe noi khong ten (anonymous inner class listener)
                        @Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

}
class MyFrame extends Frame
{
	public MyFrame(String title)
	{
		super(title);
	}
        @Override
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(40, 40, 80, 80);
	}
}

