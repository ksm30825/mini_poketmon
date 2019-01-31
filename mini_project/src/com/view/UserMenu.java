package com.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class UserMenu extends JPanel{

	public UserMenu() {
		super();
		JButton button = new JButton("버튼입니다");
		this.setBounds(0, 0, 400, 400);
		this.setBackground(Color.black);
		this.add(button,"South");
		
	}
	
	
}
