/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author thang
 */
public class DemoFramePanel extends Frame {

    public static void main(String[] args) {
        Choice choice;
        choice = new Choice();
        choice.add("Red");
        choice.add("Green");
        choice.add("Blue");
        Button ok = new Button("Ok");
        Button cancel = new Button("Cancel");
        Panel panel = new Panel();
        panel.add(ok);
        Component add;
        add = panel.add(cancel);
    }
}
