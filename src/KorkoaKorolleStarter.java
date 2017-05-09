import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class KorkoaKorolleStarter { 
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					
					frame.setListener();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**public static void main(String[] args) {
		
	double alkuPääoma = 5000;
	int sijoitusVuodet = 1;
	double vuotuinenKorko = .07; 
	double loppuPääoma = 0;
	
	 for (sijoitusVuodet=1; sijoitusVuodet<=20; sijoitusVuodet++) {
		 loppuPääoma = alkuPääoma*Math.pow(1 + vuotuinenKorko, loppuPääoma);
		 System.out.println(sijoitusVuodet +  "   " + loppuPääoma);
	 }
	}
	*/
}
