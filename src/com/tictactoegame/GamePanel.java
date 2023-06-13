package com.tictactoegame;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class GamePanel implements ActionListener
{
	JFrame jf;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	 
	int count =0;
	String str="";
	boolean win=false;
	Color colour1;
	String player1, player2 ;
	String player;
	GamePanel(String player1, String player2) 
	{
	  this.player1=player1;
	  this.player2=player2;
	}
	void openGamePanel()
	{
		 jf=new JFrame();
		jf.setTitle(player1+ " turns");
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new GridLayout(3,3));
	    jb1=new JButton();
		jb1.addActionListener(this);
		jf.add(jb1);
		 jb2=new JButton();
		jb2.addActionListener(this);
		jf.add(jb2);
		 jb3=new JButton();
		jb3.addActionListener(this);
		jf.add(jb3);
	    jb4=new JButton();
		jb4.addActionListener(this);
		jf.add(jb4);
		 jb5=new JButton();
		jb5.addActionListener(this);
		jf.add(jb5);
		 jb6=new JButton();
		jb6.addActionListener(this);
		jf.add(jb6);
		 jb7=new JButton();
		jb7.addActionListener(this);
		jf.add(jb7);
		 jb8=new JButton();
		jb8.addActionListener(this);
		jf.add(jb8);
	   jb9=new JButton();
		jb9.addActionListener(this);
		jf.add(jb9);
		jf.setVisible(true);
	}
	
@Override
public void actionPerformed(ActionEvent e)
{
	count =count+1;
	if (count%2==0)
	{
		str="0";
		colour1=Color.red;
		jf.setTitle(player1+ " turns");
	}
	else
	{
		str="X";
		colour1=Color.yellow;
		jf.setTitle(player2+ " turns");
	}
	//add event to buttons
	if (e.getSource()==jb1)
	{
		jb1.setBackground(colour1);
		jb1.setFont(new Font("Arial",1, 50));
		jb1.setText(str);
		jb1.setEnabled(false);
		
	}
	if (e.getSource()==jb2)
	{
		jb2.setBackground(colour1);
		jb2.setFont(new Font("Arial",1, 50));
		jb2.setText(str);
		jb2.setEnabled(false);
	}
	if (e.getSource()==jb3)
	{
		jb3.setBackground(colour1);
		jb3.setFont(new Font("Arial",1, 50));
		jb3.setText(str);
		jb3.setEnabled(false);
	}
	if (e.getSource()==jb4)
	{
		jb4.setBackground(colour1);
		jb4.setFont(new Font("Arial",1, 50));
		jb4.setText(str);
		jb4.setEnabled(false);
	}
	if (e.getSource()==jb5)
	{
		jb5.setBackground(colour1);
		jb5.setFont(new Font("Arial",1, 50));
		jb5.setText(str);
		jb5.setEnabled(false);
	}
	if (e.getSource()==jb6)
	{
		jb6.setBackground(colour1);
		jb6.setFont(new Font("Arial",1, 50));
		jb6.setText(str);
		jb6.setEnabled(false);
	}
	if (e.getSource()==jb7)
	{
		jb7.setBackground(colour1);
		jb7.setFont(new Font("Arial",1, 50));
		jb7.setText(str);
		jb7.setEnabled(false);
	}
	if (e.getSource()==jb8)
	{
		jb8.setBackground(colour1);
		jb8.setFont(new Font("Arial",1, 50));
		jb8.setText(str);
		jb8.setEnabled(false);
	}
	if (e.getSource()==jb9)
	{
		jb9.setBackground(colour1);
		jb9.setFont(new Font("Arial",1, 50));
		jb9.setText(str);
		jb9.setEnabled(false);
	}
	winningPossibilities();
	whoWins();
}
void winningPossibilities()
{
	//horizental winning possibilities
	if (jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText() !="")
	{
		//JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	}
	else if (jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() !="")
	{
		//JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	}
	else if (jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() !="")
	{
		//JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	
	}
	//vertical winning possibilites
	else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText() !="")
	{
		//JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	
	}
	else if (jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() !="")
	{
	//	JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	
	}
	else if (jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() !="")
	{
	//	JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	
	}
	//diagonal winning possibilities
	else if (jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb5.getText() !="")
	{
		//JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	
	}
	else if (jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() !="")
	{
		//JOptionPane.showMessageDialog(jf, str+"wins");
		win=true;
	
	}
	//game draw
	else
	{
		//JOptionPane.showMessageDialog(jf, "game draw");
		win=false;
	
	}
	
}
void whoWins()
{
	if (win==true)
	{
		if (str.equals("0"))
		{
			player=player2;
		}
		else
		{
			player=player1;
		}
		JOptionPane.showMessageDialog(jf, player+ " wins");
		restart();
	}
	else if(win==false && count>=9)
	{
		JOptionPane.showMessageDialog(jf, "match draw");
		restart();
	}
}
void restart()
{
	int i=JOptionPane.showConfirmDialog(jf, "do u want to restart  the game");
	if (i==0)    //for yes i value is 0
	{
		jb1.setText("");
		jb2.setText("");
		jb3.setText("");
		jb4.setText("");
		jb5.setText("");
		jb6.setText("");
		jb7.setText("");
		jb8.setText("");
		jb9.setText("");
	
	/*	jb1.setEnabled(true);
		jb2.setEnabled(true);
		jb3.setEnabled(true);
		jb4.setEnabled(true);
		jb5.setEnabled(true);
		jb6.setEnabled(true);
		jb7.setEnabled(true);
		jb8.setEnabled(true);
		jb9.setEnabled(true); */ // instead of this
		
		buttonSetEnabling(true);
		jb1.setBackground(null);
		jb2.setBackground(null);
		jb3.setBackground(null);
		jb4.setBackground(null);
		jb5.setBackground(null);
		jb6.setBackground(null);
		jb7.setBackground(null);
		jb8.setBackground(null);
		jb9.setBackground(null);
		

		str="";
		count=0;
		win=false;
	}
	else if(i==1)    //for no i value is 1
	{
		System.exit(0);   //shutdowns the jvm
	}
	else            // for cancel i value is 2 and for cross(X) i value is -1
	{
		/*jb1.setEnabled(false);
		jb2.setEnabled(false);
		jb3.setEnabled(false);
		jb4.setEnabled(false);
		jb5.setEnabled(false);
		jb6.setEnabled(false);
		jb7.setEnabled(false);
		jb8.setEnabled(false);
		jb9.setEnabled(false);*/ //instead of this 
		buttonSetEnabling(false);

	}
}
void buttonSetEnabling(boolean b)
{
	jb1.setEnabled(b);
	jb2.setEnabled(b);
	jb3.setEnabled(b);
	jb4.setEnabled(b);
	jb5.setEnabled(b);
	jb6.setEnabled(b);
	jb7.setEnabled(b);
	jb8.setEnabled(b);
	jb9.setEnabled(b);
}
}



