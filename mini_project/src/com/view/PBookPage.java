package com.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PBookPage extends JPanel{
	private JPanel pb;
	private MainFrame mf;
	private ImageIcon backButtonImage = new ImageIcon(getClass().getResource("/images/back.PNG"));
	private ImageIcon pInfoImage1 = new ImageIcon(getClass().getResource("/images/pInfo1.PNG"));
	private ImageIcon pInfoImage2 = new ImageIcon(getClass().getResource("/images/pInfo2.PNG"));
	private ImageIcon pInfoImage3 = new ImageIcon(getClass().getResource("/images/pInfo3.PNG"));
	private ImageIcon pInfoImage4 = new ImageIcon(getClass().getResource("/images/pInfo4.PNG"));
	private ImageIcon pInfoImage5 = new ImageIcon(getClass().getResource("/images/pInfo5.PNG"));
	private ImageIcon pInfoImage6 = new ImageIcon(getClass().getResource("/images/pInfo6.PNG"));
	private ImageIcon leftButtonImage = new ImageIcon(getClass().getResource("/images/leftButton.PNG"));
	private ImageIcon rightButtonImage = new ImageIcon(getClass().getResource("/images/rightButton.PNG"));
	private ImageIcon getPokeImage = new ImageIcon(getClass().getResource("/images/getPoke.PNG"));
	
	private JLabel pInfo1 = new JLabel(pInfoImage1);
	private JLabel pInfo2 = new JLabel(pInfoImage2);
	private JLabel pInfo3 = new JLabel(pInfoImage3);
	private JLabel pInfo4 = new JLabel(pInfoImage4);
	private JLabel pInfo5 = new JLabel(pInfoImage5);
	private JLabel pInfo6 = new JLabel(pInfoImage6);
	private JButton leftButton = new JButton(leftButtonImage);
	private JButton rightButton = new JButton(rightButtonImage);
	private JLabel getPokeLabel = new JLabel(getPokeImage);
	
	private JButton backButton = new JButton(backButtonImage);
	public PBookPage(MainFrame mf) {
		this.mf = mf;
		pb = new JPanel();
		
		pb.setLayout(null);
		JLabel label = new JLabel();
		label.setText("도감 페이지");
		label.setBounds(450, 20, 200, 40);
		pb.setBackground(Color.WHITE);
		
		
		leftButton.setBounds(20, 320, 95, 95);
		leftButton.setBorderPainted(false);
		leftButton.setFocusPainted(false);
		leftButton.setContentAreaFilled(false);
		//왼쪽으로 가기 버튼
		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
			}
		});
		
		
		rightButton.setBounds(900, 320, 95, 95);
		rightButton.setBorderPainted(false);
		rightButton.setFocusPainted(false);
		rightButton.setContentAreaFilled(false);
		//오른쪽으로 가기 버튼
		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
				
			}
		});
		
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
				ChangePanel.changePanel(mf, pb, new UserMenu(mf));
			}
		});
		getPokeLabel.setBounds(775, 15, 120, 40);
		pInfo1.setBounds(125, 70, 250, 250);
		pInfo2.setBounds(385, 70, 250, 250);
		pInfo3.setBounds(645, 70, 250, 250);
		pInfo4.setBounds(125, 350, 250, 250);
		pInfo5.setBounds(385, 350, 250, 250);
		pInfo6.setBounds(645, 350, 250, 250);
		
		pb.add(getPokeLabel);
		pb.add(leftButton);
		pb.add(rightButton);
		pb.add(pInfo1);
		pb.add(pInfo2);
		pb.add(pInfo3);
		pb.add(pInfo4);
		pb.add(pInfo5);
		pb.add(pInfo6);
		
		pb.add(label);
		pb.add(backButton);
		mf.add(pb);
		mf.setVisible(true);
	}
	

	
}
