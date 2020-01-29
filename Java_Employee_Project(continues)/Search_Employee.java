import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Search_Employee implements ActionListener {

	JFrame f;
	JTextField t;
	JLabel l1,l2;
	JButton b1,b2;
	
	Search_Employee(){
		f=new JFrame("search");
		f.setBackground(Color.green);
		f.setLayout(null);
		
		l2 = new JLabel();
		l2.setBounds(0,0,500,270);
		l2.setLayout(null);
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource(""));
		l2.setIcon(img);
		
		
		l1 = new JLabel("Çalýþan Id");
		l1.setVisible(true);
		l1.setBounds(40,50,250,30);
		l1.setForeground(Color.white);
		Font f1 = new Font("x", Font.BOLD,25);
		l1.setFont(f1);
		l2.add(l1);
		f .add(l2);
		
		t = new JTextField();
		t.setBounds(240,50,220,30);
		l2.add(t);
		
		b1 = new JButton("Search");
		b1.setBounds(240,150,100,30);
		b1.addActionListener(this);
		l2.add(b1);
		
		b2 = new JButton("cancel");
		b2.setBounds(360,150,100,30);
		b2.addActionListener(this);
		l2.add(b2);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		   if(e.getSource()==b2) {
			   f.setVisible(false);
			   details d = new details();
		   }
		   
		   if (e.getSource() == b1) {
			   new Update_Employee(t.getText());
			   f.setVisible(false);
		   }
	}
	
public static void main (String [] args) {
	new Search_Employee();
}
}
