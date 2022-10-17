package gui; 

import emporium.Emporium;
import product.Item;
import product.IceCreamFlavor;
import product.MixInFlavor;
import product.MixInAmount;
import product.MixIn;
import product.Scoop;

import java.awt.BorderLayout;
import java.awt.Font;


import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JLabel;
import javax.swing.JButton;

import javax.imageio.ImageIO;

import emporium.Emporium;

public class MainWin extends JFrame{
	private Emporium emporium;
	private JMenuItem createScoop; 
	private JLabel display; 




		MainWin(){

		JFrame frame = new JFrame();
		
		
		
		JPanel panel = new JPanel(); 
		panel.setBorder(BorderFactory.createEmptyBorder(100,100,60,100));
		panel.setLayout(new GridLayout(0,1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mavs Ice Cream Emporium");
		frame.pack();
		frame.setVisible(true);
		
		
		
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
        
        JMenu file = new JMenu("File");
        menubar.add(file);
        
        JMenu view = new JMenu("View");
        menubar.add(view);
        
        JMenu create = new JMenu("Create");
        menubar.add(create);
        
        JMenu help = new JMenu("Help");
        menubar.add(help);
		
		}
		

		/*
		
		// BaseLine Code given by prof rice, Using for additional refrence
		
		
       
    */

}
