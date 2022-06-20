package Package;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Vypocet{

	public final double PI = 3.1415;

	JFrame frame = new JFrame();
	
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
	JTextField vysledek_Z;
	JTextField vysledek_Y;

	public Vypocet(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(7,2));
		frame.setTitle("Výsledky");
		frame.setVisible(true);
				
		vysledek_R = new JTextField();
		vysledek_R.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_R.setForeground(Color.white);
		vysledek_R.setBackground(Color.black);
		vysledek_R.setCaretColor(Color.white);
		vysledek_R.setText("vysledek R: "+Zadani.hodnota_R.getText());
		
		vysledek_f = new JTextField();
		vysledek_f.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_f.setForeground(Color.white);
		vysledek_f.setBackground(Color.black);
		vysledek_f.setCaretColor(Color.white);
		vysledek_f.setText("vysledek f: "+Zadani.hodnota_f.getText()+" Hz");
		
		/*vysledek_Z = new JTextField();
		vysledek_Z.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Z.setForeground(Color.white);
		vysledek_Z.setBackground(Color.black);
		vysledek_Z.setCaretColor(Color.white);
		vysledek_Z.setText("vysledek Z: "+Zadani..getText());
		
		vysledek_Y = new JTextField();
		vysledek_Y.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Y.setForeground(Color.white);
		vysledek_Y.setBackground(Color.black);
		vysledek_Y.setCaretColor(Color.white);
		vysledek_Y.setText("vysledek Y: "+Zadani..getText());*/
		
		vysledek_C = new JTextField();
		vysledek_C.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_C.setForeground(Color.white);
		vysledek_C.setBackground(Color.black);
		vysledek_C.setCaretColor(Color.white);
		vysledek_C.setText("vysledek C: "+Zadani.hodnota_C.getText()+" μF");
		
		vysledek_L = new JTextField();
		vysledek_L.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_L.setForeground(Color.white);
		vysledek_L.setBackground(Color.black);
		vysledek_L.setCaretColor(Color.white);
		vysledek_L.setText("vysledek L: "+Zadani.hodnota_L.getText());
		
		vysledek_U = new JTextField();
		vysledek_U.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_U.setForeground(Color.white);
		vysledek_U.setBackground(Color.black);
		vysledek_U.setCaretColor(Color.white);
		vysledek_U.setText("vysledek U: "+Zadani.hodnota_rU.getText()+" + "+Zadani.hodnota_iU.getText()+" j");
		
		vysledek_I = new JTextField();
		vysledek_I.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_I.setForeground(Color.white);
		vysledek_I.setBackground(Color.black);
		vysledek_I.setCaretColor(Color.white);
		vysledek_I.setText("vysledek I: "+Zadani.hodnota_rI.getText()+" + "+Zadani.hodnota_iI.getText()+" j");
		
		vysledek_S = new JTextField();
		vysledek_S.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_S.setForeground(Color.white);
		vysledek_S.setBackground(Color.black);
		vysledek_S.setCaretColor(Color.white);
		vysledek_S.setText("vysledek S: "+Zadani.hodnota_rS.getText()+" + "+Zadani.hodnota_iS.getText()+" j");
		
		vysledek_P = new JTextField();
		vysledek_P.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_P.setForeground(Color.white);
		vysledek_P.setBackground(Color.black);
		vysledek_P.setCaretColor(Color.white);
		vysledek_P.setText("vysledek P: "+Zadani.hodnota_P.getText());
				
		vysledek_XC = new JTextField();
		vysledek_XC.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_XC.setForeground(Color.white);
		vysledek_XC.setBackground(Color.black);
		vysledek_XC.setCaretColor(Color.white);
		if(Zadani.hodnota_XC==null) {
			vysledek_XC.setText("vysledek Xc: -"+(1/(2*PI*Zadani.f*Zadani.C)));
		}
		else {
			vysledek_XC.setText("vysledek XC: -"+Zadani.hodnota_XC.getText()+" j");
		}
		
		vysledek_XL = new JTextField();
		vysledek_XL.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_XL.setForeground(Color.white);
		vysledek_XL.setBackground(Color.black);
		vysledek_XL.setCaretColor(Color.white);
		vysledek_XL.setText("vysledek XL: "+Zadani.hodnota_XL.getText()+" j");
		
		vysledek_Q = new JTextField();
		vysledek_Q.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Q.setForeground(Color.white);
		vysledek_Q.setBackground(Color.black);
		vysledek_Q.setCaretColor(Color.white);
		vysledek_Q.setText("vysledek Q: "+Zadani.hodnota_Q.getText()+" j");
		
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
