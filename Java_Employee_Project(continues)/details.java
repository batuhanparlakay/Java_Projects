import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class details implements ActionListener {

	JFrame frame;
	JLabel label1,label2;
	JButton button1,button2,button3,button4;
	
	details(){
		frame = new JFrame("Çalýþan Detaylarý");
		frame.setBackground(Color.white);
		frame.setLayout(null);
		
		
		label1 = new JLabel();
		label1.setBounds(0,0,700,500);
		label1.setLayout(null);
		ImageIcon i1 = new ImageIcon("");
		label1.setIcon(i1);
		frame.add(label1);
		
		
		
		label2 = new JLabel("Çalýþan Detaylarý");
		label2.setBounds(430,20,200,40);
		label2.setForeground(Color.black);
		label1.add(label2);
		
		button1 = new JButton ("Ekle");
		button1.setBounds(420,80,100,40);
		button1.setFont(new Font("x" , Font.BOLD,15));
		button1.addActionListener(this);
		label1.add(button1);
		
		button2= new JButton("Görünen");
		button2.setBounds(530,80,100,40);
		button2.setFont(new Font("x" , Font.BOLD,15));
		button2.addActionListener(this);
		label1.add(button2);
		
		
		button3 = new JButton("iptal");
		button3.setBounds(420,140,100,40);
		button3.setFont(new Font("x",Font.BOLD,15));
		button3.addActionListener(this);
		label1.add(button3);
		
		button4 = new JButton("güncelleme");
		button4.setBounds(530,140,100,40);
		button4.setFont(new Font("x",Font.BOLD,15));
		button4.addActionListener(this);
		label1.add(button4);
		
		frame.setVisible(true);
		frame.setSize(700,500);
		frame.setLocation(450,200);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==button1) {
			frame.setVisible(false);
			new Add_Employee();
		}
		
		if(e.getSource()==button2) {
			frame.setVisible(false);
			new Výew_Employee();
			
		}
		
		if(e.getSource()==button3) {
			frame.setVisible(false);
			new Remove_Employee();
		}
		
		if(e.getSource()==button4) {
			frame.setVisible(false);
			new Search_Employee();
		}
		
	}

    public static void main(String[ ] arg){
        details d = new details();
    }
		}
