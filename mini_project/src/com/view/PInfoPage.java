package com.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PInfoPage extends JPanel{
	private MainFrame mf;
	private JPanel pip;
	private ImageIcon pInfoImage1 = new ImageIcon(getClass().getResource("/images/pInfo1.PNG"));
	private ImageIcon pInfoImage2 = new ImageIcon(getClass().getResource("/images/pInfo2.PNG"));
	private ImageIcon pInfoImage3 = new ImageIcon(getClass().getResource("/images/pInfo3.PNG"));
	private ImageIcon pInfoImage4 = new ImageIcon(getClass().getResource("/images/pInfo4.PNG"));
	private ImageIcon backButtonImage = new ImageIcon(getClass().getResource("/images/back.PNG"));

	private JLabel pInfo1 = new JLabel(pInfoImage1);
	private JLabel pInfo2 = new JLabel(pInfoImage2);
	private JLabel pInfo3 = new JLabel(pInfoImage3);
	private JLabel pInfo4 = new JLabel(pInfoImage4);
	private JButton backButton = new JButton(backButtonImage);
	
	public PInfoPage(MainFrame mf) {
		this.mf = mf;
		pip = new JPanel();
		JLabel label = new JLabel();
		label.setText("포켓몬 정보 페이지");

		pip.setLayout(null);
		pip.setBackground(Color.WHITE);
		
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
				ChangePanel.changePanel(mf, pip, new UserMenu(mf));
			}
		});
		label.setBounds(450, 20, 200, 40);
		
		pInfo1.setBounds(180, 70, 300, 300);
		pInfo2.setBounds(520, 70, 300, 300);
		pInfo3.setBounds(180, 390, 300, 300);
		pInfo4.setBounds(520, 390, 300, 300);
		
		
		pip.add(label);
		pip.add(backButton);
		pip.add(pInfo1);
		pip.add(pInfo2);
		pip.add(pInfo3);
		pip.add(pInfo4);
		
		mf.add(pip);
		mf.setVisible(true);
	}
	
}
