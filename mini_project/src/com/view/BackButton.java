package com.view;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BackButton extends JButton{
	private ImageIcon backButtonImage = new ImageIcon(getClass().getResource("/images/back.PNG"));
	private JButton backButton = new JButton(backButtonImage);
	public BackButton() {
		backButton.setBounds(920, 640, 70, 50);
		backButton.setBorderPainted(false);
		backButton.setFocusPainted(false);
		backButton.setContentAreaFilled(false);
		//뒤로가기 버튼
	/*	backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
			}
		});*/
	}
	
}
