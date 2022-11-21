package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel{

	private int x;
	private int y;
	
	private ImageIcon playerR;
	private ImageIcon playerL;
	
	public Player() {
		initData();
		setInitLayout();

	}
	
	private void initData() {
		playerL = new ImageIcon("image/playerL.png");
		playerR = new ImageIcon("image/playerR.png");
	}
	private void setInitLayout() {
		x = 55;
		y= 535;
		this.setIcon(playerR);
		this.setSize(50,50);
		this.setLocation(x,y);
	}
	
}
