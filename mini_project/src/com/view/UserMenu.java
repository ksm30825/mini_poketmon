package com.view;


import java.awt.Button;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UserMenu extends JPanel {
	private JPanel userMenu;
	private MainFrame mf;

	private ImageIcon saveButtonImage = new ImageIcon(getClass().getResource("/images/saveButton.PNG"));
	private ImageIcon pBookButtonImage = new ImageIcon(getClass().getResource("/images/pBookButton.PNG"));
	private ImageIcon pokemonInfoButtonImage = new ImageIcon(getClass().getResource("/images/pokemonInfoButton.PNG"));
	private ImageIcon userInfoButtonImage = new ImageIcon(getClass().getResource("/images/userInfoButton.PNG"));
	private ImageIcon userInvenButtonImage = new ImageIcon(getClass().getResource("/images/userInvenButton.PNG"));
	private ImageIcon saveButtonEnteredImage = new ImageIcon(getClass().getResource("/images/saveButtonEntered.PNG"));
	private ImageIcon pBookButtonEnteredImage = new ImageIcon(getClass().getResource("/images/pBookButtonEntered.PNG"));
	private ImageIcon pokemonInfoButtonEnteredImage = new ImageIcon(getClass().getResource("/images/pokemonInfoButtonEntered.PNG"));
	private ImageIcon userInfoButtonEnteredImage = new ImageIcon(getClass().getResource("/images/userInfoButtonEntered.PNG"));
	private ImageIcon userInvenButtonEnteredImage = new ImageIcon(getClass().getResource("/images/userInvenButtonEntered.PNG"));
	
	private JButton saveButton = new JButton(saveButtonImage);
	private JButton pBookButton = new JButton(pBookButtonImage);
	private JButton pokemonInfoButton = new JButton(pokemonInfoButtonImage);
	private JButton userInfoButton = new JButton(userInfoButtonImage);
	private JButton userInvenButton = new JButton(userInvenButtonImage);
	
	private JButton saveButtonEntered = new JButton(saveButtonEnteredImage);
	private JButton pBookButtonEntered = new JButton(pBookButtonEnteredImage);
	private JButton pokemonInfoButtonEntered = new JButton(pokemonInfoButtonEnteredImage);
	private JButton userInfoButtonEntered = new JButton(userInfoButtonEnteredImage);
	private JButton userInvenButtonEntered = new JButton(userInvenButtonEnteredImage);
	

	
	public UserMenu(MainFrame mf) {
		userMenu = new JPanel();
		this.mf = mf;
		settingButton(saveButton);


		saveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				saveButton.setIcon(saveButtonEnteredImage);
				saveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				saveButton.setIcon(saveButtonImage);
				saveButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				ChangePanel.changePanel(mf, userMenu, new SavePage(mf));			
			}
		});
		
		userMenu.add(saveButton);
		
		settingButton(pBookButton);
		pBookButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pBookButton.setIcon(pBookButtonEnteredImage);
				pBookButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pBookButton.setIcon(pBookButtonImage);
				pBookButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				ChangePanel.changePanel(mf, userMenu, new PBookPage(mf));
			}
		});
		userMenu.add(pBookButton);
		
		settingButton(pokemonInfoButton);
		pokemonInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pokemonInfoButton.setIcon(pokemonInfoButtonEnteredImage);
				pokemonInfoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				pokemonInfoButton.setIcon(pokemonInfoButtonImage);
				pokemonInfoButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
				ChangePanel.changePanel(mf, userMenu, new PInfoPage(mf));
			}
		});
		userMenu.add(pokemonInfoButton);

		settingButton(userInfoButton);
		userInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				userInfoButton.setIcon(userInfoButtonEnteredImage);
				userInfoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				userInfoButton.setIcon(userInfoButtonImage);
				userInfoButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				ChangePanel.changePanel(mf, userMenu, new UserInfoPage(mf));
				//클릭시 이벤트
			}
		});
		userMenu.add(userInfoButton);
		
		settingButton(userInvenButton);
		
		userInvenButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				userInvenButton.setIcon(userInvenButtonEnteredImage);
				userInvenButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				userInvenButton.setIcon(userInvenButtonImage);
				userInvenButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				//클릭시 이벤트
				ChangePanel.changePanel(mf, userMenu, new UserInvenPage(mf));
			}
		});
		
		userMenu.add(userInvenButton);
		this.mf.add(userMenu);
		mf.setVisible(true);
		
		
	}
	public void settingButton(JButton jb) {
		jb.setBorderPainted(false);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
	}



	
}
