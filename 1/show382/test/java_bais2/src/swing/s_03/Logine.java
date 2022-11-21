package swing.s_03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Logine extends JFrame {
	JPanel jPanel1;
	JPanel jPanel2;
	JButton button1;
	JLabel jLabel1;
	JLabel jLabel2;
	JTextField jTextField1;
	JTextField jTextField2;
	
	public Logine() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("로그인 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		button1 = new JButton("로그인");
		jLabel1 = new JLabel("id : ");
		jLabel2 = new JLabel("pasword : ");
		jTextField1 = new JTextField("아이디 입력",10);
		jTextField2 = new JTextField("비번입력",10);
	}
	private void setInitLayout() {
		jPanel1.setBackground(Color.black);
		jPanel2.setBackground(Color.black);
		jPanel2.add(jLabel2);
		jPanel2.add(jTextField2);
		jPanel2.add(button1);
		setLayout(new BorderLayout(300, 200));
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField1);
		setLayout(new GridLayout(2,1));
		add(jPanel1);
		add(jPanel2);
		
		setVisible(true);
		
		
	}
}
