package com.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserInvenPage extends JPanel {
	private JPanel uivp;
	private MainFrame mf;
	private ImageIcon backButtonImage = new ImageIcon(getClass().getResource("/images/back.PNG"));
	private ImageIcon itemInfoImage = new ImageIcon(getClass().getResource("/images/itemInfo.PNG"));
	private ImageIcon itemListImage = new ImageIcon(getClass().getResource("/images/itemList.PNG"));
	private ImageIcon useButtonImage = new ImageIcon(getClass().getResource("/images/useButton.PNG"));
	private ImageIcon upButtonImage = new ImageIcon(getClass().getResource("/images/upButton.PNG"));
	private ImageIcon downButtonImage = new ImageIcon(getClass().getResource("/images/downButton.PNG"));
	
	private JButton backButton = new JButton(backButtonImage);
	private JButton useButton = new JButton(useButtonImage);
	private JButton upButton = new JButton(upButtonImage);
	private JButton downButton = new JButton(downButtonImage);
	
	private JLabel itemInfoLabel = new JLabel(itemInfoImage);
	private JLabel itemListLabel = new JLabel(itemListImage);
	
	public UserInvenPage(MainFrame mf) {
		this.mf = mf;
		uivp = new JPanel();
		
		uivp.setLayout(null);
		uivp.setBackground(Color.WHITE);
		JLabel label = new JLabel();
		label.setText("가방 페이지");
		
		itemInfoLabel.setBounds(500, 100, 300, 300);
		itemListLabel.setBounds(100,30,400,650);
		
	
		useButton.setBounds(500, 450, 300, 150);
		useButton.setBorderPainted(false);
		useButton.setFocusPainted(false);
		useButton.setContentAreaFilled(false);
		useButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				useButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				useButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
			}
		});
		uivp.add(useButton);
		
		upButton.setBounds(150, 20, 95, 95);
		upButton.setBorderPainted(false);
		upButton.setFocusPainted(false);
		upButton.setContentAreaFilled(false);
		upButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				upButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				upButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
				ChangePanel.changePanel(mf, uivp, new UserMenu(mf));
			}
		});
		uivp.add(upButton);
	
		downButton.setBounds(150, 650, 95, 95);
		downButton.setBorderPainted(false);
		downButton.setFocusPainted(false);
		downButton.setContentAreaFilled(false);
		downButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				downButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				downButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
				ChangePanel.changePanel(mf, uivp, new UserMenu(mf));
			}
		});
		uivp.add(downButton);
		
		label.setBounds(450, 20, 200, 40);
		backButton.setBounds(920, 640, 70, 50);
		backButton.setBorderPainted(false);
		backButton.setFocusPainted(false);
		backButton.setContentAreaFilled(false);
		//뒤로가기 버튼
		backButton.addMouseListener(new MouseAdapter() {
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
				ChangePanel.changePanel(mf, uivp, new UserMenu(mf));
			}
		});
		uivp.add(backButton);
		
		
		uivp.add(itemInfoLabel);
		uivp.add(itemListLabel);
		
		uivp.add(label);
		
		mf.add(uivp);
		mf.setVisible(true);
		
		
	}
	
}
