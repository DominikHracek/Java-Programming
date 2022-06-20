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
	static JTextField hodnota_rZ;
	static JTextField hodnota_iZ;
	static JTextField hodnota_iY;
	static JTextField hodnota_rY;
	static double C;
	static double f;

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
		hodnota_R.setText("R:");
		
		hodnota_rZ = new JTextField();
		hodnota_rZ.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rZ.setForeground(Color.white);
		hodnota_rZ.setBackground(Color.black);
		hodnota_rZ.setCaretColor(Color.white);
		hodnota_rZ.setText("rZ:");
		
		hodnota_rY = new JTextField();
		hodnota_rY.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rY.setForeground(Color.white);
		hodnota_rY.setBackground(Color.black);
		hodnota_rY.setCaretColor(Color.white);
		hodnota_rY.setText("rY:");
		
		hodnota_f = new JTextField();
		hodnota_f.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_f.setForeground(Color.white);
		hodnota_f.setBackground(Color.black);
		hodnota_f.setCaretColor(Color.white);
		hodnota_f.setText("f:");
		
		hodnota_C = new JTextField();
		hodnota_C.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_C.setForeground(Color.white);
		hodnota_C.setBackground(Color.black);
		hodnota_C.setCaretColor(Color.white);
		hodnota_C.setText("C: v mikrofaradech");
		
		hodnota_L = new JTextField();
		hodnota_L.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_L.setForeground(Color.white);
		hodnota_L.setBackground(Color.black);
		hodnota_L.setCaretColor(Color.white);
		hodnota_L.setText("L:");
		
		hodnota_rU = new JTextField();
		hodnota_rU.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rU.setForeground(Color.white);
		hodnota_rU.setBackground(Color.black);
		hodnota_rU.setCaretColor(Color.white);
		hodnota_rU.setText("rU:");
		
		hodnota_rI = new JTextField();
		hodnota_rI.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rI.setForeground(Color.white);
		hodnota_rI.setBackground(Color.black);
		hodnota_rI.setCaretColor(Color.white);
		hodnota_rI.setText("rI:");
		
		hodnota_rS = new JTextField();
		hodnota_rS.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rS.setForeground(Color.white);
		hodnota_rS.setBackground(Color.black);
		hodnota_rS.setCaretColor(Color.white);
		hodnota_rS.setText("rS:");
		
		hodnota_P = new JTextField();
		hodnota_P.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_P.setForeground(Color.white);
		hodnota_P.setBackground(Color.black);
		hodnota_P.setCaretColor(Color.white);
		hodnota_P.setText("P:");
		
		/*-----------------------------------------------------------------*/
		
		hodnota_XC = new JTextField();
		hodnota_XC.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_XC.setForeground(Color.white);
		hodnota_XC.setBackground(Color.black);
		hodnota_XC.setCaretColor(Color.white);
		hodnota_XC.setText("XC:");
		
		hodnota_XL = new JTextField();
		hodnota_XL.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_XL.setForeground(Color.white);
		hodnota_XL.setBackground(Color.black);
		hodnota_XL.setCaretColor(Color.white);
		hodnota_XL.setText("XL:");
		
		hodnota_iZ = new JTextField();
		hodnota_iZ.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iZ.setForeground(Color.white);
		hodnota_iZ.setBackground(Color.black);
		hodnota_iZ.setCaretColor(Color.white);
		hodnota_iZ.setText("iZ:");
		
		hodnota_iY = new JTextField();
		hodnota_iY.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iY.setForeground(Color.white);
		hodnota_iY.setBackground(Color.black);
		hodnota_iY.setCaretColor(Color.white);
		hodnota_iY.setText("iY:");
		
		hodnota_iU = new JTextField();
		hodnota_iU.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iU.setForeground(Color.white);
		hodnota_iU.setBackground(Color.black);
		hodnota_iU.setCaretColor(Color.white);
		hodnota_iU.setText("iU:");
		
		hodnota_iI = new JTextField();
		hodnota_iI.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iI.setForeground(Color.white);
		hodnota_iI.setBackground(Color.black);
		hodnota_iI.setCaretColor(Color.white);
		hodnota_iI.setText("iI:");
		
		hodnota_iS = new JTextField();
		hodnota_iS.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_iS.setForeground(Color.white);
		hodnota_iS.setBackground(Color.black);
		hodnota_iS.setCaretColor(Color.white);
		hodnota_iS.setText("iS:");
		
		hodnota_Q = new JTextField();
		hodnota_Q.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_Q.setForeground(Color.white);
		hodnota_Q.setBackground(Color.black);
		hodnota_Q.setCaretColor(Color.white);
		hodnota_Q.setText("Q:");
		
		frame.add(hodnota_R);
		frame.add(hodnota_XL);
		frame.add(hodnota_f);
		frame.add(hodnota_XC);
		frame.add(hodnota_rZ);
		frame.add(hodnota_iZ);
		frame.add(hodnota_rY);
		frame.add(hodnota_iY);
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
			
			hodnota_R.getText();
			hodnota_XL.getText();
			hodnota_f.getText();
			hodnota_XC.getText();
			hodnota_rZ.getText();
			hodnota_iZ.getText();
			hodnota_rY.getText();
			hodnota_iY.getText();
			hodnota_L.getText();
			hodnota_iU.getText();
			hodnota_C.getText();
			hodnota_iI.getText();
			hodnota_rU.getText();
			hodnota_Q.getText();
			hodnota_rI.getText();
			hodnota_iS.getText();
			hodnota_rS.getText();
			hodnota_P.getText();
			C = Double.parseDouble(hodnota_C.getText());
			f = Double.parseDouble(hodnota_f.getText());
			frame.dispose();
			new Vypocet();
			
		}

	}
}