package Package;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Zadani implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton ulozit_zadani;
	public static JTextField hodnota_R;
	public static JTextField hodnota_f;
	public static JTextField hodnota_C;
	public static JTextField hodnota_L;
	public static JTextField hodnota_rU;
	public static JTextField hodnota_iU;
	public static JTextField hodnota_rI;
	public static JTextField hodnota_iI;
	public static JTextField hodnota_rS;
	public static JTextField hodnota_Xc;
	public static JTextField hodnota_Xl;
	public static JTextField hodnota_Q;
	public static JTextField hodnota_iS;
	public static JTextField hodnota_P;
	public static JTextField hodnota_rZ;
	public static JTextField hodnota_iZ;
	public static JTextField hodnota_iY;
	public static JTextField hodnota_rY;
	public static Double R;
	public static Double f;
	public static Double C;
	public static Double L;
	public static Double rU;
	public static Double iU;
	public static Double rI;
	public static Double iI;
	public static Double rS;
	public static Double Xc;
	public static Double Xl;
	public static Double Q;
	public static Double iS;
	public static Double P;
	public static Double rZ;
	public static Double iZ;
	public static Double iY;
	public static Double rY;
	public static JLabel zadani_R;
	public static JLabel zadani_f;
	public static JLabel zadani_C;
	public static JLabel zadani_L;
	public static JLabel zadani_rU;
	public static JLabel zadani_iU;
	public static JLabel zadani_rI;
	public static JLabel zadani_iI;
	public static JLabel zadani_rS;
	public static JLabel zadani_Xc;
	public static JLabel zadani_Xl;
	public static JLabel zadani_Q;
	public static JLabel zadani_iS;
	public static JLabel zadani_P;
	public static JLabel zadani_rZ;
	public static JLabel zadani_iZ;
	public static JLabel zadani_iY;
	public static JLabel zadani_rY;

	public Zadani(){

		ulozit_zadani = new JButton("Submit");
		ulozit_zadani.addActionListener(this);
		ulozit_zadani.setSize(1920,120);
		
		JOptionPane.showMessageDialog(null, "Zapište hodnoty (i=imaginární, r=reálná)", "Zadání",JOptionPane.INFORMATION_MESSAGE);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(7,4));
		frame.setTitle("Zapište hodnoty (i=imaginární, r=reálná)");
		frame.setVisible(true);
		frame.setResizable(false);
		
		hodnota_R = new JTextField();
		hodnota_R.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_R.setForeground(Color.white);
		hodnota_R.setBackground(Color.black);
		hodnota_R.setCaretColor(Color.white);
		zadani_R = new JLabel("R:");
		zadani_R.setOpaque(true);
		zadani_R.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_R.setForeground(Color.white);
		zadani_R.setBackground(Color.black);
		
		hodnota_rZ = new JTextField();
		hodnota_rZ.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_rZ.setForeground(Color.white);
		hodnota_rZ.setBackground(Color.black);
		hodnota_rZ.setCaretColor(Color.white);
		zadani_rZ = new JLabel("rZ:");
		zadani_rZ.setOpaque(true);
		zadani_rZ.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_rZ.setForeground(Color.white);
		zadani_rZ.setBackground(Color.black);
		
		hodnota_rY = new JTextField();
		hodnota_rY.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_rY.setForeground(Color.white);
		hodnota_rY.setBackground(Color.black);
		hodnota_rY.setCaretColor(Color.white);
		zadani_rY = new JLabel("rY:");
		zadani_rY.setOpaque(true);
		zadani_rY.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_rY.setForeground(Color.white);
		zadani_rY.setBackground(Color.black);
		
		hodnota_f = new JTextField();
		hodnota_f.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_f.setForeground(Color.white);
		hodnota_f.setBackground(Color.black);
		hodnota_f.setCaretColor(Color.white);
		zadani_f = new JLabel("f:");
		zadani_f.setOpaque(true);
		zadani_f.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_f.setForeground(Color.white);
		zadani_f.setBackground(Color.black);
		
		hodnota_C = new JTextField();
		hodnota_C.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_C.setForeground(Color.white);
		hodnota_C.setBackground(Color.black);
		zadani_C = new JLabel("C: [μF]");
		zadani_C.setOpaque(true);
		zadani_C.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_C.setForeground(Color.white);
		zadani_C.setBackground(Color.black);
		
		hodnota_L = new JTextField();
		hodnota_L.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_L.setForeground(Color.white);
		hodnota_L.setBackground(Color.black);
		hodnota_L.setCaretColor(Color.white);
		zadani_L = new JLabel("L:");
		zadani_L.setOpaque(true);
		zadani_L.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_L.setForeground(Color.white);
		zadani_L.setBackground(Color.black);
		
		hodnota_rU = new JTextField();
		hodnota_rU.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_rU.setForeground(Color.white);
		hodnota_rU.setBackground(Color.black);
		hodnota_rU.setCaretColor(Color.white);
		zadani_rU = new JLabel("rU:");
		zadani_rU.setOpaque(true);
		zadani_rU.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_rU.setForeground(Color.white);
		zadani_rU.setBackground(Color.black);
		
		hodnota_rI = new JTextField();
		hodnota_rI.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_rI.setForeground(Color.white);
		hodnota_rI.setBackground(Color.black);
		hodnota_rI.setCaretColor(Color.white);
		zadani_rI = new JLabel("rI:");
		zadani_rI.setOpaque(true);
		zadani_rI.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_rI.setForeground(Color.white);
		zadani_rI.setBackground(Color.black);
		
		hodnota_rS = new JTextField();
		hodnota_rS.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_rS.setForeground(Color.white);
		hodnota_rS.setBackground(Color.black);
		hodnota_rS.setCaretColor(Color.white);
		zadani_rS = new JLabel("rS:");
		zadani_rS.setOpaque(true);
		zadani_rS.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_rS.setForeground(Color.white);
		zadani_rS.setBackground(Color.black);
		
		hodnota_P = new JTextField();
		hodnota_P.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_P.setForeground(Color.white);
		hodnota_P.setBackground(Color.black);
		hodnota_P.setCaretColor(Color.white);
		zadani_P = new JLabel("P:");
		zadani_P.setOpaque(true);
		zadani_P.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_P.setForeground(Color.white);
		zadani_P.setBackground(Color.black);
		
		/*-----------------------------------------------------------------*/
		
		hodnota_Xc = new JTextField();
		hodnota_Xc.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_Xc.setForeground(Color.white);
		hodnota_Xc.setBackground(Color.black);
		hodnota_Xc.setCaretColor(Color.white);
		zadani_Xc = new JLabel("Xc:");
		zadani_Xc.setOpaque(true);
		zadani_Xc.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_Xc.setForeground(Color.white);
		zadani_Xc.setBackground(Color.black);
		
		hodnota_Xl = new JTextField();
		hodnota_Xl.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_Xl.setForeground(Color.white);
		hodnota_Xl.setBackground(Color.black);
		hodnota_Xl.setCaretColor(Color.white);
		zadani_Xl = new JLabel("Xl:");
		zadani_Xl.setOpaque(true);
		zadani_Xl.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_Xl.setForeground(Color.white);
		zadani_Xl.setBackground(Color.black);
		
		hodnota_iZ = new JTextField();
		hodnota_iZ.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_iZ.setForeground(Color.white);
		hodnota_iZ.setBackground(Color.black);
		hodnota_iZ.setCaretColor(Color.white);
		zadani_iZ = new JLabel("iZ:");
		zadani_iZ.setOpaque(true);
		zadani_iZ.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_iZ.setForeground(Color.white);
		zadani_iZ.setBackground(Color.black);
		
		hodnota_iY = new JTextField();
		hodnota_iY.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_iY.setForeground(Color.white);
		hodnota_iY.setBackground(Color.black);
		hodnota_iY.setCaretColor(Color.white);
		zadani_iY = new JLabel("iY:");
		zadani_iY.setOpaque(true);
		zadani_iY.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_iY.setForeground(Color.white);
		zadani_iY.setBackground(Color.black);
		
		hodnota_iU = new JTextField();
		hodnota_iU.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_iU.setForeground(Color.white);
		hodnota_iU.setBackground(Color.black);
		hodnota_iU.setCaretColor(Color.white);
		zadani_iU = new JLabel("iU:");
		zadani_iU.setOpaque(true);
		zadani_iU.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_iU.setForeground(Color.white);
		zadani_iU.setBackground(Color.black);
		
		hodnota_iI = new JTextField();
		hodnota_iI.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_iI.setForeground(Color.white);
		hodnota_iI.setBackground(Color.black);
		hodnota_iI.setCaretColor(Color.white);
		zadani_iI = new JLabel("iI:");
		zadani_iI.setOpaque(true);
		zadani_iI.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_iI.setForeground(Color.white);
		zadani_iI.setBackground(Color.black);
		
		hodnota_iS = new JTextField();
		hodnota_iS.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_iS.setForeground(Color.white);
		hodnota_iS.setBackground(Color.black);
		hodnota_iS.setCaretColor(Color.white);
		zadani_iS = new JLabel("iS:");
		zadani_iS.setOpaque(true);
		zadani_iS.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_iS.setForeground(Color.white);
		zadani_iS.setBackground(Color.black);
		
		hodnota_Q = new JTextField();
		hodnota_Q.setFont(new Font("Consolas",Font.PLAIN,75));
		hodnota_Q.setForeground(Color.white);
		hodnota_Q.setBackground(Color.black);
		hodnota_Q.setCaretColor(Color.white);
		zadani_Q = new JLabel("Q:");
		zadani_Q.setOpaque(true);
		zadani_Q.setFont(new Font("Consolas",Font.PLAIN,75));
		zadani_Q.setForeground(Color.white);
		zadani_Q.setBackground(Color.black);
		
		frame.add(zadani_R);
		frame.add(hodnota_R);
		frame.add(zadani_f);
		frame.add(hodnota_f);
		frame.add(zadani_C);
		frame.add(hodnota_C);
		frame.add(zadani_L);
		frame.add(hodnota_L);
		frame.add(zadani_rU);
		frame.add(hodnota_rU);
		frame.add(zadani_iU);
		frame.add(hodnota_iU);
		frame.add(zadani_rI);
		frame.add(hodnota_rI);
		frame.add(zadani_iI);
		frame.add(hodnota_iI);
		frame.add(zadani_rS);
		frame.add(hodnota_rS);
		frame.add(zadani_Xc);
		frame.add(hodnota_Xc);
		frame.add(zadani_Xl);
		frame.add(hodnota_Xl);
		frame.add(zadani_Q);
		frame.add(hodnota_Q);
		frame.add(zadani_iS);
		frame.add(hodnota_iS);
		frame.add(zadani_P);
		frame.add(hodnota_P);
		frame.add(zadani_rZ);
		frame.add(hodnota_rZ);
		frame.add(zadani_iZ);
		frame.add(hodnota_iZ);
		frame.add(zadani_iY);
		frame.add(hodnota_iY);
		frame.add(zadani_rY);
		frame.add(hodnota_rY);
		frame.add(ulozit_zadani);
		frame.setSize(1920,1080);

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==ulozit_zadani) {
			hodnota_R.getText();
			R = Double.valueOf(hodnota_R.getText());
			hodnota_Xl.getText();
			Xl = Double.valueOf(hodnota_Xl.getText());
			hodnota_f.getText();
			f = Double.valueOf(hodnota_f.getText());
			hodnota_Xc.getText();
			Xc = Double.valueOf(hodnota_Xc.getText());
			hodnota_rZ.getText();
			rZ = Double.valueOf(hodnota_rZ.getText());
			hodnota_iZ.getText();
			iZ = Double.valueOf(hodnota_iZ.getText());
			hodnota_rY.getText();
			rY = Double.valueOf(hodnota_rY.getText());
			hodnota_iY.getText();
			iY = Double.valueOf(hodnota_iY.getText());
			hodnota_L.getText();
			L = Double.valueOf(hodnota_L.getText());
			hodnota_iU.getText();
			iU = Double.valueOf(hodnota_iU.getText());
			hodnota_C.getText();
			C = Double.valueOf(hodnota_C.getText());
			hodnota_iI.getText();
			iI = Double.valueOf(hodnota_iI.getText());
			hodnota_rU.getText();
			rU = Double.valueOf(hodnota_rU.getText());
			hodnota_Q.getText();
			Q = Double.valueOf(hodnota_Q.getText());
			hodnota_rI.getText();
			rI = Double.valueOf(hodnota_rI.getText());
			hodnota_iS.getText();
			iS = Double.valueOf(hodnota_iS.getText());
			hodnota_rS.getText();
			rS = Double.valueOf(hodnota_rS.getText());
			hodnota_P.getText();
			P = Double.valueOf(hodnota_P.getText());
			frame.dispose();
			new Vypocet();
			
		}

	}
}