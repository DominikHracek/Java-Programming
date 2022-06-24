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
	JTextField vysledek_Xc;
	JTextField vysledek_Xl;
	JTextField vysledek_Q;
	JTextField vysledek_P;
	JTextField vysledek_Z;
	JTextField vysledek_Y;

	public Vypocet(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(7,2));
		frame.setTitle("Výsledky sériového obvodu");
		frame.setVisible(true);
		
		vysledek_R = new JTextField();
		vysledek_R.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_R.setForeground(Color.white);
		vysledek_R.setBackground(Color.black);
		vysledek_R.setCaretColor(Color.white);
		if(!vysledek_R.equals(null)){
			vysledek_R.setText("R: "+vysledek_R);
		}
		else if(!Zadani_seriovy_obvod.hodnota_R.equals(null)){
			vysledek_R.setText("R: "+Zadani_seriovy_obvod.R);
		}
		else{
			vysledek_R.setText("R: "+Zadani_seriovy_obvod.rZ+((Zadani_seriovy_obvod.iZ+Zadani_seriovy_obvod.Xc-Zadani_seriovy_obvod.Xl)+"j"));
		}
		
		vysledek_f = new JTextField();
		vysledek_f.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_f.setForeground(Color.white);
		vysledek_f.setBackground(Color.black);
		vysledek_f.setCaretColor(Color.white);
		if(!vysledek_f.equals(null)){
			vysledek_f.setText("f: "+vysledek_f);
		}
		else if(!Zadani_seriovy_obvod.hodnota_f.equals(null)){
			vysledek_f.setText("f: "+Zadani_seriovy_obvod.f);
		}
		else if((!Zadani_seriovy_obvod.hodnota_Xc.equals(null))&&(!Zadani_seriovy_obvod.hodnota_C.equals(null))){
			vysledek_f.setText("f: "+(1/(2*PI*Zadani_seriovy_obvod.Xc*Zadani_seriovy_obvod.C)));
		}
		else{
			vysledek_f.setText("f: "+(1/(2*PI*Zadani_seriovy_obvod.Xl*Zadani_seriovy_obvod.L)));
		}
		
		vysledek_Z = new JTextField();
		vysledek_Z.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Z.setForeground(Color.white);
		vysledek_Z.setBackground(Color.black);
		vysledek_Z.setCaretColor(Color.white);
		if(!vysledek_Z.equals(null)){
			vysledek_Z.setText("Z: "+vysledek_Z);
		}
		else if(!Zadani_seriovy_obvod.hodnota_rZ.equals(null)||!Zadani_seriovy_obvod.hodnota_iZ.equals(null)){
			vysledek_Z.setText("Z: "+Zadani_seriovy_obvod.rZ+" + "+(Zadani_seriovy_obvod.iZ+"j"));
		}
		else{
			vysledek_Z.setText("Z: "+Zadani_seriovy_obvod.R+" + "+((Zadani_seriovy_obvod.Xl+"j")+" - "+(Zadani_seriovy_obvod.Xc+"j")));
		}
		
		vysledek_Y = new JTextField();
		vysledek_Y.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Y.setForeground(Color.white);
		vysledek_Y.setBackground(Color.black);
		vysledek_Y.setCaretColor(Color.white);
		if(!vysledek_Y.equals(null)){
			vysledek_Y.setText("Y: "+vysledek_Y);
		}
		else if(!Zadani_seriovy_obvod.hodnota_rY.equals(null)||!Zadani_seriovy_obvod.hodnota_iY.equals(null)){
			vysledek_Y.setText("Y: "+Zadani_seriovy_obvod.rY+" + "+(Zadani_seriovy_obvod.iY+"j"));
		}
		else{
			vysledek_Y.setText("Y: "+(1/Double.valueOf(vysledek_Z.getText())));
		}
		
		vysledek_C = new JTextField();
		vysledek_C.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_C.setForeground(Color.white);
		vysledek_C.setBackground(Color.black);
		vysledek_C.setCaretColor(Color.white);
		if(!vysledek_C.equals(null)){
			vysledek_C.setText("C: "+vysledek_C);
		}
		else{
			vysledek_C.setText("C: "+(1/(2*PI*Double.valueOf(vysledek_Xc.getText())*Double.valueOf(vysledek_C.getText())*1000000)+"μF"));
		}
		
		vysledek_L = new JTextField();
		vysledek_L.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_L.setForeground(Color.white);
		vysledek_L.setBackground(Color.black);
		vysledek_L.setCaretColor(Color.white);
		if(!vysledek_L.equals(null)){
			vysledek_L.setText("L: "+vysledek_L);
		}
		else{
			vysledek_L.setText("L: "+(Double.valueOf(vysledek_Xl.getText())/(2*PI*Double.valueOf(vysledek_f.getText()))));
		}
		
		vysledek_U = new JTextField();
		vysledek_U.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_U.setForeground(Color.white);
		vysledek_U.setBackground(Color.black);
		vysledek_U.setCaretColor(Color.white);
		if(!vysledek_U.equals(null)){
			vysledek_U.setText("U: "+vysledek_U);
		}
		else if(!Zadani_seriovy_obvod.hodnota_rU.equals(null)||!Zadani_seriovy_obvod.hodnota_iU.equals(null)){
			vysledek_U.setText("U: "+Zadani_seriovy_obvod.rU+" + "+(Zadani_seriovy_obvod.iU+"j"));
		}
		else if(!Zadani_seriovy_obvod.hodnota_iZ.equals(null)&&(!Zadani_seriovy_obvod.hodnota_rI.equals(null)||!Zadani_seriovy_obvod.hodnota_iI.equals(null))) {
			vysledek_U.setText("U: "+((Zadani_seriovy_obvod.rZ+Zadani_seriovy_obvod.iZ)*(Zadani_seriovy_obvod.rI+Zadani_seriovy_obvod.iI)));
		}
		
		vysledek_I = new JTextField();
		vysledek_I.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_I.setForeground(Color.white);
		vysledek_I.setBackground(Color.black);
		vysledek_I.setCaretColor(Color.white);
		if(!vysledek_I.equals(null)) {
			vysledek_I.setText("I: "+vysledek_I);
		}
		else if(!vysledek_U.equals(null)&&!vysledek_Z.equals(null)) {
			vysledek_I.setText("I: "+((Zadani_seriovy_obvod.rU+Zadani_seriovy_obvod.iU)*(Zadani_seriovy_obvod.rZ+Zadani_seriovy_obvod.iZ)));
		}
		
		vysledek_S = new JTextField();
		vysledek_S.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_S.setForeground(Color.white);
		vysledek_S.setBackground(Color.black);
		vysledek_S.setCaretColor(Color.white);
		if(!vysledek_S.equals(null)) {
			vysledek_S.setText("S: "+vysledek_S);
		}
		else if (!Zadani_seriovy_obvod.rS.equals(null)||!Zadani_seriovy_obvod.iS.equals(null)) {
			vysledek_S.setText("S: "+(Zadani_seriovy_obvod.rS)+" + "+(Zadani_seriovy_obvod.iS+"j"));
		}
		else if (!vysledek_U.equals(null)&&!vysledek_I.equals(null)) {
			vysledek_S.setText("S: "+(Double.valueOf(vysledek_U.getText())+Double.valueOf(vysledek_I.getText())));
		}
		
		/*vysledek_P = new JTextField();
		vysledek_P.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_P.setForeground(Color.white);
		vysledek_P.setBackground(Color.black);
		vysledek_P.setCaretColor(Color.white);
		if(!vysledek_P.equals(null)) {
			vysledek_P.setText("S: "+vysledek_P);
		}*/
				
		vysledek_Xc = new JTextField();
		vysledek_Xc.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Xc.setForeground(Color.white);
		vysledek_Xc.setBackground(Color.black);
		vysledek_Xc.setCaretColor(Color.white);
		if(!vysledek_Xc.equals(null)) {
			vysledek_Xc.setText("Xc: "+vysledek_Xc);
		}
		else if(!Zadani_seriovy_obvod.Xc.equals(null)&&!Zadani_seriovy_obvod.f.equals(null)){
			vysledek_Xc.setText("Xc: "+(1/(2*PI*Zadani_seriovy_obvod.Xc*Zadani_seriovy_obvod.f)));
		}
		
		vysledek_Xl = new JTextField();
		vysledek_Xl.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Xl.setForeground(Color.white);
		vysledek_Xl.setBackground(Color.black);
		vysledek_Xl.setCaretColor(Color.white);
		vysledek_Xl.setText("Výsledek Xl: "+Zadani_seriovy_obvod.Xl+" j");
		
		vysledek_Q = new JTextField();
		vysledek_Q.setFont(new Font("Consolas",Font.PLAIN,35));
		vysledek_Q.setForeground(Color.white);
		vysledek_Q.setBackground(Color.black);
		vysledek_Q.setCaretColor(Color.white);
		vysledek_Q.setText("Výsledek Q: "+Zadani_seriovy_obvod.Q+" j");
		
		frame.add(vysledek_R);
		frame.add(vysledek_Xl);
		frame.add(vysledek_f);
		frame.add(vysledek_Xc);
		frame.add(vysledek_L);
		frame.add(vysledek_U);
		frame.add(vysledek_C);
		frame.add(vysledek_I);
		frame.add(vysledek_Q);
		frame.add(vysledek_I);
		frame.add(vysledek_S);
		frame.add(vysledek_P);
		frame.add(vysledek_Q);
		frame.add(vysledek_Z);
		frame.add(vysledek_Y);
		frame.setSize(1920,1080);
	}
	
}
