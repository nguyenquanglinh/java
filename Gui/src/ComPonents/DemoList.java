/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPonents;

import java.applet.Applet;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author thang
 */
public class DemoList extends Applet implements ItemListener, ActionListener
{
	private List colorList;
        @Override
	public void init()
	{
		colorList = new List(3, false); // cua so rong du de hien thi 3 item va ko chon nhieu
		colorList.add("White");
		colorList.add("Black");
		colorList.add("Yellow");
		colorList.add("Green");
		colorList.addItemListener(this);
		colorList.addActionListener(this);
		add(colorList);
	}
        @Override
        public void itemStateChanged(ItemEvent event) // Change
	{
		List list = (List) event.getSource();
		showStatus("Item " + list.getSelectedIndex() + " selected");
	}
        @Override
	public void actionPerformed(ActionEvent event) // Enter or Double Click
	{
		List list = (List) event.getSource();
		// String [] st =list.getSelectedItems();
		// int[] it = list.getSelectedIndexes();
		String s = list.getSelectedItem();
		if(s.equals("White")) setBackground(Color.WHITE);
		if(s.equals("Black")) setBackground(Color.BLACK);
		if(s.equals("Yellow")) setBackground(Color.YELLOW);
		if(s.equals("Green")) setBackground(Color.GREEN);
		repaint();
	}


}
