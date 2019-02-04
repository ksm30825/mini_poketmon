package com.view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MainPage  extends JPanel {

	
	private MainFrame mf;
	private JPanel mainPage;
	
	public MainPage(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
		
		JButton jb = new JButton("버튼");
		jb.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(mf.hashCode());
				ChangePanel.changePanel(mf, mainPage, new UserMenu(mf));
			}
			
		});
		mainPage.add(jb);
		this.setBackground(Color.BLUE);
		mf.add(this);
	}
}



























