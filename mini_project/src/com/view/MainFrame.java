package com.view;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MainFrame extends JFrame {

	public static final int SCREEN_WIDTH = 1024;
	public static final int SCREEN_HEIGHT = 768;
	private URL searchURL;
	private JButton button;
	private ImageIcon imageicon;
	public MainFrame() {
		
		
		super("테스트");
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		System.out.println(this.hashCode());
		new MainPage(this);
		
		this.setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		
	}
	
	
}

