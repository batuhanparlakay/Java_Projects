import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Update_Employee {

	
	JFrame f;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l15,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3; 
    String id_emp;
    
    Update_Employee(String x){
    	
    	super();
    	f = new JFrame("update details");
    	f.setVisible(true);
    	f.setSize(900,500);
    	f.setLocation(450,250);
    	f.setBackground(Color.white);
    	f.setLayout(null);
    	
    	id_emp=x;
    	l15 = new JLabel();
    	l15.setBounds(0, 0, 900, 500);
    	l15.setLayout(null);
    	
    	
    	
    	
    	l8 = new JLabel("update employee detail : ");
    	l8.setBounds(50, 10, 500, 50);
    	l8.setFont(new Font("x" , Font.ITALIC ,40));
    	l8.setForeground(Color.black);
    	l15.add(l8);
    	f.add(l15);
    	
    	
    	l1 = new JLabel("Name");
    	l1.setBounds(50, 100, 100, 30);
    	l1.setFont(new Font("x" , Font.BOLD , 20));
    	
    	t1 = new JTextField();
    	t1.setBounds(200, 100, 150, 30);
    	l15.add(t1);
    	
    	//_______________________________________________________________________________//
    	
    	l2 = new JLabel();
    	
    	
    	
    	
    	
    }
	
	
	
	
	
	
}
