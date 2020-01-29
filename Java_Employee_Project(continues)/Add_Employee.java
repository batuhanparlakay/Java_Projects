import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.sun.jdi.Method;

 class Add_Employee implements ActionListener {
	JFrame frame; //create java frame , panel , txtfields and button with actionlistener.
	JLabel panel1 , panel2 , panel3 , panel4, panel5 , panel6 , panel7,  panel8 , panel9 , panel10 , panel11 , panel12 , panel13 , panel14 ,panel15, p ,p1  ;
	JTextField txtfield1 , txtfield2 , txtfield3 , txtfield4 , txtfield5 , txtfield6,txtfield7 , txtfield8 , txtfield9 , txtfield10 , txtfield11 , txtfield12;
	JButton button , button2 , button3;
	
 Add_Employee (int e){
	 
 }
 
 Add_Employee(){
 frame = new JFrame("Programa Hoþgeldiniz");
 frame.setBackground(Color.white);
 frame.setLayout(null);
 
 panel14 = new JLabel();
 panel14.setBounds(0,0,900,700);
 ImageIcon image = new ImageIcon(ClassLoader.getSystemResource(""));
 panel14.setIcon(image);
 
 
 panel1 = new JLabel("Ýsim");
 panel1.setBounds(50,150,100,30);
 panel1.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel1);
 
 
 //-----------------------------------------------------------------------------------------------------------------------//
 
 txtfield1 = new JTextField();
 txtfield1.setBounds(200,150,150,30);
 panel14.add(txtfield1);
 
 
 panel2 = new JLabel("Soyisim");
 panel2.setBounds(400,150,200,30);
 panel2.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel2);
 
 
 //--------------------------------------------------------------------------------------------------------------------//
 
 txtfield2 = new JTextField();
 txtfield2.setBounds(600,150,150,30);
 panel14.add(txtfield2);
 
 
 
 //------------------------------------------------------------------------------------------------------------------------//
 
 
 
 txtfield3 = new JTextField();
 txtfield3.setBounds(200,200,150,30);
 panel14.add(txtfield3);
 
 panel3 = new JLabel("Kimlik No");
 panel3.setBounds(50,200,100,30);
 panel3.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel3);
 
 
 //--------------------------------------------------------------------------------------------------------------------//
 
 txtfield4 = new JTextField();
 txtfield4.setBounds(600,200,150,30);
 panel14.add(txtfield4);
 
 
 panel4 = new JLabel("Yaþ");
 panel4.setBounds(400,200,200,30);
 panel4.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel4);
//______________________________________________________________________________________________________________
 
 
 panel5 = new JLabel("Doðum Tarihi");
 panel5.setBounds(50,250,150,30);
 panel5.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel5);
 
 txtfield5 = new JTextField();
 txtfield5.setBounds(200,250,150,30);
 panel14.add(txtfield5);
 
 //____________________________________________________________________________________________________________________________//
 
 
 panel6 = new JLabel("Doðum Yeri");
 panel6.setBounds(400,250,150,30);
 panel6.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel6);
 
 
 txtfield6 = new JTextField();
 txtfield6.setBounds(600,250,150,30);
 panel14.add(txtfield6);
 
 
 
 //___________________________________________________________________________________________//
 
 
 panel7 = new JLabel("Medeni Durum");
 panel7.setBounds(50,300,160,30);
 panel7.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel7);
 
 txtfield7 = new JTextField();
 txtfield7.setBounds(200,300,150,30);
 panel14.add(txtfield7);
 
 
 //___________________________________________//
 
 panel8 = new JLabel("Çalýþan Bilgileri");
 panel8.setBounds(320,30,500,50);
 panel8.setFont(new Font("x",Font.ITALIC,30));
 panel14.add(panel8);
 frame.add(panel14);
 
 
 txtfield8 = new JTextField();
 txtfield8.setBounds(600,300,150,30);
 panel14.add(txtfield8);
 
 
 
 
 panel9 = new JLabel("Eðitim Durum");
 panel9.setBounds(400,300,150,30);
 panel9.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel9);
 
 
 txtfield9 = new JTextField();
 txtfield9.setBounds(200,350,150,30);
 panel14.add(txtfield9);
 
 
 
 
 panel10 = new JLabel("Tel No");
 panel10.setBounds(50,350,100,30);
 panel10.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel10);
 
 
 txtfield10 = new JTextField();
 txtfield10.setBounds(600,350,150,30);
 panel14.add(txtfield10);
 
 
 
 
 
 
 panel11 = new JLabel("Adres");
 panel11.setBounds(400,350,150,30);
 panel11.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel11);
 
 txtfield11 = new JTextField();
 txtfield11.setBounds(200,400,150,30);
 panel14.add(txtfield11);
 
 txtfield12 = new JTextField();
 txtfield12.setBounds(600,400,150,30);
 panel14.add(txtfield12);
 
 panel12 = new JLabel("E-Posta");
 panel12.setBounds(50,400,150,30);
 panel12.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel12);
 
 panel13 = new JLabel("Baba Adý");
 panel13.setBounds(400,150,200,30);
 panel13.setFont(new Font("x",Font.BOLD,20));
 panel14.add(panel2);

 panel15 = new JLabel("Kan Grup");
 panel15.setBounds(400,300,120,215);
 panel15.setFont(new Font("x" , Font.BOLD,20));
 panel14.add(panel15);
 

 
 
 p=new JLabel();
 p.setBounds(200,450,250,200);
 panel14.add(p);

 p1=new JLabel("");
 p1.setBounds(600,450,250,200);
 panel14.add(p1);

 button = new JButton("Submit");
 button.setBackground(Color.BLACK);
 button.setForeground(Color.WHITE);
 button.setBounds(250,550,150,40);
 
 panel14.add(button);

 button2=new JButton("Cancel");   
 button2.setBackground(Color.BLACK);
 button2.setForeground(Color.WHITE);
 button2.setBounds(450,550,150,40);
 
 panel14.add(button2);
 
 button.addActionListener(this);
 button2.addActionListener(this);
 
 frame.setVisible(true);
 frame.setSize(900,700);
 frame.setLocation(400,150);
}
 
 
public void actionPerformed(ActionEvent ee) {
	String a = txtfield1.getText();
	String b = txtfield2.getText();
	String c = txtfield3.getText();
	String d = txtfield4.getText();
	String r = txtfield5.getText();
	String f = txtfield6.getText();
	String g = txtfield7.getText();
	String h = txtfield8.getText();
	String i = txtfield9.getText();
	String j = txtfield10.getText();
	String k = txtfield11.getText();
	String l = txtfield12.getText();
	if(ee.getSource() == button) {
		try {
			ýnfo cc = new ýnfo();
			String q = "values(('"+a+"','"+b+"','"+c+"','"+d+"','"+r+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"')";
		    cc.s.executeUpdate(q);
		    JOptionPane.showMessageDialog(null, "Baþarýyla Saðlanmýþtýr");
		    frame.setVisible(false);
		    new details();
		}
		
		catch(Exception xx) {
			System.out.println("the error message" + xx);
		}
	}
		
		else if(ee.getSource() ==button2){
			frame.setVisible(false);
			new details();
		}
	}
	

public static void main(String[ ] arg){
    new Add_Employee();
}

}
