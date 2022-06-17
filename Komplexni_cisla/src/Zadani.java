import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Zadani extends JFrame implements ActionListener{

	JButton ulozit_zadani;
	JTextField hodnota_R;
	JTextField zadejte_rc;
	JTextField hodnota_f;
	JTextField hodnota_C;
	JTextField hodnota_L;
	JTextField hodnota_U;
	JTextField hodnota_I;
	JTextField hodnota_rS; 

	Zadani(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(15,2));
		
		ulozit_zadani = new JButton("Submit");
		ulozit_zadani.addActionListener(this);
		
		zadejte_rc = new JTextField();
		zadejte_rc.setPreferredSize(new Dimension(1920,1080));
		zadejte_rc.setFont(new Font("Consolas",Font.PLAIN,35));
		zadejte_rc.setForeground(Color.white);
		zadejte_rc.setBackground(Color.black);
		zadejte_rc.setCaretColor(Color.white);
		zadejte_rc.setText("Dolů zapište POUZE REÁLNÉ HODNOTY");
		zadejte_rc.setEditable(false);
		
		hodnota_R = new JTextField();
		hodnota_R.setPreferredSize(new Dimension(1920,1080));
		hodnota_R.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_R.setForeground(Color.white);
		hodnota_R.setBackground(Color.black);
		hodnota_R.setCaretColor(Color.white);
		hodnota_R.setText("hodnota R:");
		
		hodnota_f = new JTextField();
		hodnota_f.setPreferredSize(new Dimension(1920,1080));
		hodnota_f.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_f.setForeground(Color.white);
		hodnota_f.setBackground(Color.black);
		hodnota_f.setCaretColor(Color.white);
		hodnota_f.setText("hodnota f:");
		
		hodnota_C = new JTextField();
		hodnota_C.setPreferredSize(new Dimension(1920,1080));
		hodnota_C.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_C.setForeground(Color.white);
		hodnota_C.setBackground(Color.black);
		hodnota_C.setCaretColor(Color.white);
		hodnota_C.setText("hodnota C:");
		
		hodnota_L = new JTextField();
		hodnota_L.setPreferredSize(new Dimension(1920,1080));
		hodnota_L.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_L.setForeground(Color.white);
		hodnota_L.setBackground(Color.black);
		hodnota_L.setCaretColor(Color.white);
		hodnota_L.setText("hodnota L:");
		
		hodnota_U = new JTextField();
		hodnota_U.setPreferredSize(new Dimension(1920,1080));
		hodnota_U.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_U.setForeground(Color.white);
		hodnota_U.setBackground(Color.black);
		hodnota_U.setCaretColor(Color.white);
		hodnota_U.setText("hodnota U:");
		
		hodnota_I = new JTextField();
		hodnota_I.setPreferredSize(new Dimension(1920,1080));
		hodnota_I.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_I.setForeground(Color.white);
		hodnota_I.setBackground(Color.black);
		hodnota_I.setCaretColor(Color.white);
		hodnota_I.setText("hodnota I:");
		
		hodnota_rS = new JTextField();
		hodnota_rS.setPreferredSize(new Dimension(1920,1080));
		hodnota_rS.setFont(new Font("Consolas",Font.PLAIN,35));
		hodnota_rS.setForeground(Color.white);
		hodnota_rS.setBackground(Color.black);
		hodnota_rS.setCaretColor(Color.white);
		hodnota_rS.setText("hodnota S:");
		
		this.add(zadejte_rc);
		this.add(hodnota_R);
		this.add(hodnota_f);
		this.add(hodnota_L);
		this.add(hodnota_C);
		this.add(hodnota_U);
		this.add(hodnota_I);
		this.add(hodnota_rS);
		this.add(ulozit_zadani);
		this.pack();
		this.setVisible(true);

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==ulozit_zadani) {
			
			this.dispose();
			
		}

	}
}