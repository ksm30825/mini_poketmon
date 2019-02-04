package com.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SavePage extends JPanel{
	private JPanel save;
	private MainFrame mf;
	private ImageIcon saveButtonImage = new ImageIcon(getClass().getResource("/images/save.PNG"));
	private ImageIcon saveBackButtonImage = new ImageIcon(getClass().getResource("/images/saveBack.PNG"));
	
	
	private JButton saveButton = new JButton(saveButtonImage);
	private JButton saveBackButton = new JButton(saveBackButtonImage);
	
	public SavePage(MainFrame mf) {
		this.mf = mf;
		save = new JPanel();
		save.setLayout(null);
		save.setBackground(Color.WHITE);
		JLabel label = new JLabel();
		label.setText("저장 페이지");
		label.setBounds(450, 20, 200, 40);
		
		saveButton.setBounds(305, 170, 430, 130);
		saveButton.setBorderPainted(false);
		saveButton.setFocusPainted(false);
		saveButton.setContentAreaFilled(false);
		//뒤로가기 버튼
		saveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				saveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				saveButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				
				//저장 버튼
				//클릭시 이벤트

			}
		});
		
		saveBackButton.setBounds(315, 370, 430, 130);
		saveBackButton.setBorderPainted(false);
		saveBackButton.setFocusPainted(false);
		saveBackButton.setContentAreaFilled(false);
		//뒤로가기 버튼
		saveBackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				saveBackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				saveBackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
				ChangePanel.changePanel(mf, save, new UserMenu(mf));
			}
		});
		
		save.add(label);
		save.add(saveBackButton);
		save.add(saveButton);
		mf.add(save);
		mf.setVisible(true);
	}
	
}
