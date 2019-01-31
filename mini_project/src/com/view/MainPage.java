package com.view;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPage  extends JPanel {
	private MainFrame mf;
	private JPanel mainPage;
	
	public MainPage(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
		
		this.setSize(300,200);
		this.setBackground(Color.BLUE);
		
		mf.add(this);
	}
}



























