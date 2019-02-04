package com.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserInfoPage extends JPanel {
	private MainFrame mf;
	private JPanel uip;
	private ImageIcon backButtonImage = new ImageIcon(getClass().getResource("/images/back.PNG"));
	private ImageIcon charactorImage = new ImageIcon(getClass().getResource("/images/charactorImage.PNG"));
	private ImageIcon badgeImage = new ImageIcon(getClass().getResource("/images/badge.PNG"));
	private ImageIcon playTimeImage= new ImageIcon(getClass().getResource("/images/playTime.PNG"));
	private ImageIcon goldImage = new ImageIcon(getClass().getResource("/images/gold.PNG"));
	private ImageIcon getPokeImage = new ImageIcon(getClass().getResource("/images/getPoke.PNG"));
	private ImageIcon userNameImage = new ImageIcon(getClass().getResource("/images/userName.PNG"));
	
	private JLabel charactorLabel = new JLabel(charactorImage);
	private JLabel badgeLable = new JLabel(badgeImage);
	private JLabel playTimeLabel = new JLabel(playTimeImage);
	private JLabel goldLabel = new JLabel(goldImage);
	private JLabel getPokeLabel = new JLabel(getPokeImage);
	private JLabel userNameLabel = new JLabel(userNameImage);
	
	private JButton backButton = new JButton(backButtonImage);
	
	public UserInfoPage(MainFrame mf) {
		this.mf = mf;
		uip = new JPanel();
		JLabel label = new JLabel();
		label.setText("유저 정보 페이지");

		uip.setLayout(null);
		uip.setBackground(Color.WHITE);
		
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
				ChangePanel.changePanel(mf, uip, new UserMenu(mf));
			}
		});
		
		label.setBounds(450, 20, 200, 40);
		
		charactorLabel.setBounds(180, 70, 300, 200);
		userNameLabel.setBounds(180, 280, 300, 90);
		badgeLable.setBounds(520, 70, 300, 300);
		playTimeLabel.setBounds(180, 390, 300, 300);
		goldLabel.setBounds(520, 390, 300, 140);
		getPokeLabel.setBounds(520, 550, 300, 140);
		
		
		uip.add(label);
		uip.add(backButton);
		uip.add(charactorLabel);
		uip.add(userNameLabel);
		uip.add(badgeLable);
		uip.add(playTimeLabel);
		uip.add(goldLabel);
		uip.add(getPokeLabel);
		
		mf.add(uip);
		mf.setVisible(true);
	
	
	
	}
}
