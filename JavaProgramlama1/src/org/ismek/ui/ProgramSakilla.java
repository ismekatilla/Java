package org.ismek.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ProgramSakilla {

	final static String URL = "jdbc:mysql://10.1.8.20/sakila";
	final static String USERNAME = "ogrenci";
	final static String PASSWORD = "1234";

	private JFrame frmAktrKayt;
	private JTextField txtAdi;
	private JTextField txtSoyadi;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramSakilla window = new ProgramSakilla();
					window.frmAktrKayt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProgramSakilla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAktrKayt = new JFrame();
		frmAktrKayt.setTitle("Aktor Kayit");
		frmAktrKayt.setBounds(100, 100, 564, 430);
		frmAktrKayt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAktrKayt.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 231, 114);
		frmAktrKayt.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnKaydet = new JButton("KAYDET");
		btnKaydet.setBounds(114, 70, 86, 20);
		panel.add(btnKaydet);
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aktorKaydet();
			}
		});
		btnKaydet.setFont(new Font("Times New Roman", Font.BOLD, 11));

		txtAdi = new JTextField();
		txtAdi.setBounds(114, 11, 86, 20);
		panel.add(txtAdi);
		txtAdi.setColumns(10);

		txtSoyadi = new JTextField();
		txtSoyadi.setBounds(114, 39, 86, 20);
		panel.add(txtSoyadi);
		txtSoyadi.setColumns(10);

		JLabel lblNewLabel = new JLabel("Akt\u00F6r Ad\u0131");
		lblNewLabel.setBounds(10, 11, 77, 20);
		panel.add(lblNewLabel);

		JLabel lblAktrSoyad = new JLabel("Akt\u00F6r Soyad");
		lblAktrSoyad.setBounds(10, 39, 77, 20);
		panel.add(lblAktrSoyad);

		table = new JTable();
		table.setAutoscrolls(true);
		table.setBounds(10, 136, 528, 244);
		frmAktrKayt.getContentPane().add(table);

		JButton btnTabloyuDoldur = new JButton("Tabloyu Doldur");
		btnTabloyuDoldur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabloyuDoldur();
			}
		});
		btnTabloyuDoldur.setBounds(299, 94, 138, 31);
		frmAktrKayt.getContentPane().add(btnTabloyuDoldur);
	}

	protected void tabloyuDoldur() {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			String sql;
			sql = "Select * from actor";
			ResultSet resultSet = stmt.executeQuery(sql);
			
			Vector data = new Vector<Vector<Actor>>();
			
			while (resultSet.next()) {
				Vector<Actor> actorVector = new Vector<Actor>();	
				Actor actor = new Actor();
				actor.setActorId(resultSet.getLong(1));
				actor.setFirstName(resultSet.getString(2));
				actor.setLastName(resultSet.getString(3));
				actor.setLastUpdate(resultSet.getDate(4));
				actorVector.add(actor);
				data.add(actorVector);
			}
			
			Vector columnNames = new Vector<String>();
			columnNames.add("ID");
			columnNames.add("ADI");
			columnNames.add("SOYADI");
			columnNames.add("GUNCELLEME TARİHİ");
			
			TableModel tableModel = new DefaultTableModel(data, columnNames);
			table.setModel(tableModel);
			resultSet.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
	}

	private void aktorKaydet() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// STEP 4: Execute a query
			stmt = conn.createStatement();

			String adi = txtAdi.getText();
			String soyadi = txtSoyadi.getText();
			String sql;
			sql = "insert into actor (first_name, last_name) values ('" + adi
					+ "', '" + soyadi + "')";
			int executeUpdate = stmt.executeUpdate(sql);
			if (executeUpdate > 0) {
				JOptionPane.showMessageDialog(null, "Kayıt başarılı");
			} else {
				JOptionPane.showMessageDialog(null, "Kayıt başarısız");
			}

			// STEP 5: Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
	}
}
