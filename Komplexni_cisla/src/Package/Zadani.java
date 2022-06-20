package Package;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Zadani implements ActionListener{
	
	Vypocet vypocet = new Vypocet();
	JFrame frame = new JFrame();
	JButton ulozit_zadani;
	static JTextField hodnota_R;
	static JTextField hodnota_f;
	static JTextField hodnota_C;
	static JTextField hodnota_L;
	static JTextField hodnota_rU;
	static JTextField hodnota_iU;
	static JTextField hodnota_rI;
	static JTextField hodnota_iI;
	static JTextField hodnota_rS;
	static JTextField hodnota_XC;
	static JTextField hodnota_XL;
	static JTextField hodnota_Q;
	static JTextField hodnota_iS;
	static JTextField hodnota_P;
	JTextField vysledek_R;
	JTextField vysledek_f;
	JTextField vysledek_C;
	JTextField vysledek_L;
	JTextField vysledek_U;
	JTextField vysledek_I;
	JTextField vysledek_S;
	JTextField vysledek_XC;
	JTextField vysledek_XL;
	JTextField vysledek_Q;
	JTextField vysledek_P;

	public Zadani(){

		
		
		ulozit_zadani = new JButton("Submit");
		ulozit_zadani.addActionListener(this);
		
		JOptionPane.showMessageDialog(null, "Zapište hodnoty (i=imaginární, r=reálná)", "Zadání",JOptionPane.INFORMATION_MESSAGE);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(7,2));
		frame.setTitle("Zapište hodnoty (i=imaginární, r=reálná)");
		frame.setVisible(true);
		
		hodnota_R = new JTextField();
		hodnota_R.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_R.setForeground(Color.white);
		hodnota_R.setBackground(Color.black);
		hodnota_R.setCaretColor(Color.white);
		hodnota_R.setText("hodnota R:");
		
		hodnota_f = new JTextField();
		hodnota_f.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_f.setForeground(Color.white);
		hodnota_f.setBackground(Color.black);
		hodnota_f.setCaretColor(Color.white);
		hodnota_f.setText("hodnota f:");
		
		hodnota_C = new JTextField();
		hodnota_C.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_C.setForeground(Color.white);
		hodnota_C.setBackground(Color.black);
		hodnota_C.setCaretColor(Color.white);
		hodnota_C.setText("hodnota C:");
		
		hodnota_L = new JTextField();
		hodnota_L.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_L.setForeground(Color.white);
		hodnota_L.setBackground(Color.black);
		hodnota_L.setCaretColor(Color.white);
		hodnota_L.setText("hodnota L:");
		
		hodnota_rU = new JTextField();
		hodnota_rU.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rU.setForeground(Color.white);
		hodnota_rU.setBackground(Color.black);
		hodnota_rU.setCaretColor(Color.white);
		hodnota_rU.setText("hodnota rU:");
		
		hodnota_rI = new JTextField();
		hodnota_rI.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rI.setForeground(Color.white);
		hodnota_rI.setBackground(Color.black);
		hodnota_rI.setCaretColor(Color.white);
		hodnota_rI.setText("hodnota rI:");
		
		hodnota_rS = new JTextField();
		hodnota_rS.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rS.setForeground(Color.white);
		hodnota_rS.setBackground(Color.black);
		hodnota_rS.setCaretColor(Color.white);
		hodnota_rS.setText("hodnota rS:");
		
		hodnota_P = new JTextField();
		hodnota_P.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_P.setForeground(Color.white);
		hodnota_P.setBackground(Color.black);
		hodnota_P.setCaretColor(Color.white);
		hodnota_P.setText("hodnota P:");
		
		/*-----------------------------------------------------------------*/
		
		hodnota_XC = new JTextField();
		hodnota_XC.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_XC.setForeground(Color.white);
		hodnota_XC.setBackground(Color.black);
		hodnota_XC.setCaretColor(Color.white);
		hodnota_XC.setText("hodnota XC:");
		
		hodnota_XL = new JTextField();
		hodnota_XL.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_XL.setForeground(Color.white);
		hodnota_XL.setBackground(Color.black);
		hodnota_XL.setCaretColor(Color.white);
		hodnota_XL.setText("hodnota XL:");
		
		hodnota_iU = new JTextField();
		hodnota_iU.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iU.setForeground(Color.white);
		hodnota_iU.setBackground(Color.black);
		hodnota_iU.setCaretColor(Color.white);
		hodnota_iU.setText("hodnota iU:");
		
		hodnota_iI = new JTextField();
		hodnota_iI.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iI.setForeground(Color.white);
		hodnota_iI.setBackground(Color.black);
		hodnota_iI.setCaretColor(Color.white);
		hodnota_iI.setText("hodnota iI:");
		
		hodnota_iS = new JTextField();
		hodnota_iS.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iS.setForeground(Color.white);
		hodnota_iS.setBackground(Color.black);
		hodnota_iS.setCaretColor(Color.white);
		hodnota_iS.setText("hodnota iS:");
		
		hodnota_Q = new JTextField();
		hodnota_Q.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_Q.setForeground(Color.white);
		hodnota_Q.setBackground(Color.black);
		hodnota_Q.setCaretColor(Color.white);
		hodnota_Q.setText("hodnota Q:");
		
		frame.add(hodnota_R);
		frame.add(hodnota_XL);
		frame.add(hodnota_f);
		frame.add(hodnota_XC);
		frame.add(hodnota_L);
		frame.add(hodnota_iU);
		frame.add(hodnota_C);
		frame.add(hodnota_iI);
		frame.add(hodnota_rU);
		frame.add(hodnota_Q);
		frame.add(hodnota_rI);
		frame.add(hodnota_iS);
		frame.add(hodnota_rS);
		frame.add(hodnota_P);
		frame.add(ulozit_zadani);
		frame.pack();
		frame.setSize(1920,1080);

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==ulozit_zadani) {
			
			new Vypocet();
			frame.dispose();
			
		}

	}
public void Vypocet(){
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new GridLayout(7,2));
	frame.setTitle("Výsledky");
	frame.setVisible(true);
			
	vysledek_R = new JTextField();
	vysledek_R.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_R.setForeground(Color.white);
	vysledek_R.setBackground(Color.black);
	vysledek_R.setCaretColor(Color.white);
	vysledek_R.setText("vysledek R: "+hodnota_R);
	
	vysledek_f = new JTextField();
	vysledek_f.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_f.setForeground(Color.white);
	vysledek_f.setBackground(Color.black);
	vysledek_f.setCaretColor(Color.white);
	vysledek_f.setText("vysledek f: "+hodnota_f);
	
	vysledek_C = new JTextField();
	vysledek_C.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_C.setForeground(Color.white);
	vysledek_C.setBackground(Color.black);
	vysledek_C.setCaretColor(Color.white);
	vysledek_C.setText("vysledek C: "+hodnota_C);
	
	vysledek_L = new JTextField();
	vysledek_L.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_L.setForeground(Color.white);
	vysledek_L.setBackground(Color.black);
	vysledek_L.setCaretColor(Color.white);
	vysledek_L.setText("vysledek L: "+hodnota_L);
	
	vysledek_U = new JTextField();
	vysledek_U.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_U.setForeground(Color.white);
	vysledek_U.setBackground(Color.black);
	vysledek_U.setCaretColor(Color.white);
	vysledek_U.setText("vysledek U: "+Zadani.hodnota_rU+" + "+Zadani.hodnota_iU+" j");
	
	vysledek_I = new JTextField();
	vysledek_I.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_I.setForeground(Color.white);
	vysledek_I.setBackground(Color.black);
	vysledek_I.setCaretColor(Color.white);
	vysledek_I.setText("vysledek I: "+Zadani.hodnota_rI+" + "+Zadani.hodnota_iI+" j");
	
	vysledek_S = new JTextField();
	vysledek_S.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_S.setForeground(Color.white);
	vysledek_S.setBackground(Color.black);
	vysledek_S.setCaretColor(Color.white);
	vysledek_S.setText("vysledek S: "+Zadani.hodnota_rS+" + "+Zadani.hodnota_iS+" j");
	
	vysledek_P = new JTextField();
	vysledek_P.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_P.setForeground(Color.white);
	vysledek_P.setBackground(Color.black);
	vysledek_P.setCaretColor(Color.white);
	vysledek_P.setText("vysledek P: "+Zadani.hodnota_P);
			
	vysledek_XC = new JTextField();
	vysledek_XC.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_XC.setForeground(Color.white);
	vysledek_XC.setBackground(Color.black);
	vysledek_XC.setCaretColor(Color.white);
	vysledek_XC.setText("vysledek XC: -"+Zadani.hodnota_XC+" j");
	
	vysledek_XL = new JTextField();
	vysledek_XL.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_XL.setForeground(Color.white);
	vysledek_XL.setBackground(Color.black);
	vysledek_XL.setCaretColor(Color.white);
	vysledek_XL.setText("vysledek XL: "+Zadani.hodnota_XL+" j");
	
	vysledek_Q = new JTextField();
	vysledek_Q.setFont(new Font("Consolas",Font.PLAIN,35));
	vysledek_Q.setForeground(Color.white);
	vysledek_Q.setBackground(Color.black);
	vysledek_Q.setCaretColor(Color.white);
	vysledek_Q.setText("vysledek Q: "+Zadani.hodnota_Q+" j");
	
	frame.add(vysledek_R);
	frame.add(vysledek_XL);
	frame.add(vysledek_f);
	frame.add(vysledek_XC);
	frame.add(vysledek_L);
	frame.add(vysledek_U);
	frame.add(vysledek_C);
	frame.add(vysledek_I);
	frame.add(vysledek_Q);
	frame.add(vysledek_I);
	frame.add(vysledek_S);
	frame.add(vysledek_P);
	frame.pack();
	frame.setSize(1920,1080);
}

}
