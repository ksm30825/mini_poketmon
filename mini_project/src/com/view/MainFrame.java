package com.view;

import java.awt.Color;
import java.awt.Menu;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("테스트");
		
		setBounds(10,10,1024,768);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MainFrame();
		
	}
	
	
}
