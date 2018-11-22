package org.ismek.flight;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlightProgram {

	private JFrame frmUcusTakip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightProgram window = new FlightProgram();
					window.frmUcusTakip.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FlightProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUcusTakip = new JFrame();
		frmUcusTakip.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
		});
		frmUcusTakip.setTitle("Ucus Takip");
		frmUcusTakip.setBounds(100, 100, 450, 300);
		frmUcusTakip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUcusTakip.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnUcusKayit = new JButton("Ucus Kayit");
		btnUcusKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UcusKayit ucusKayit = new UcusKayit();
				ucusKayit.setVisible(true);
			}
		});
		frmUcusTakip.getContentPane().add(btnUcusKayit);
		
		JButton btnYolcuKayit = new JButton("Yolcu Kayit");
		frmUcusTakip.getContentPane().add(btnYolcuKayit);
		
		JButton btnYolcuUcusKayit = new JButton("Yolcu - Ucus Kayit");
		frmUcusTakip.getContentPane().add(btnYolcuUcusKayit);
	}

}
