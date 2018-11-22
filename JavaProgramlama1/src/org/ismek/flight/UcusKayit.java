package org.ismek.flight;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class UcusKayit extends JFrame {

	final static String URL = "jdbc:mysql://10.1.8.20/flight";
	final static String USERNAME = "ogrenci";
	final static String PASSWORD = "1234";
	
	private JPanel contentPane;
	private JComboBox cmbKalkis;
	private JComboBox cmbVaris;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UcusKayit frame = new UcusKayit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UcusKayit() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				EnumHavaAlani[] values = EnumHavaAlani.values();
				for (EnumHavaAlani enumHavaAlani : values) {
					cmbKalkis.addItem(enumHavaAlani);
					cmbVaris.addItem(enumHavaAlani);
				}
				
				ucusTablosunuDoldur();
			}
		});
		setTitle("Ucus Kayit");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 216, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbKalkis = new JComboBox();
		cmbKalkis.setBounds(85, 11, 86, 20);
		contentPane.add(cmbKalkis);
		
		JLabel lblKalk = new JLabel("Kalkis");
		lblKalk.setBounds(10, 14, 46, 14);
		contentPane.add(lblKalk);
		
		cmbVaris = new JComboBox();
		cmbVaris.setBounds(85, 42, 86, 20);
		contentPane.add(cmbVaris);
		
		JLabel lblVaris = new JLabel("Varis");
		lblVaris.setBounds(10, 45, 46, 14);
		contentPane.add(lblVaris);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ucusKaydet();
				ucusTablosunuDoldur();
			}
		});
		btnKaydet.setBounds(82, 73, 89, 23);
		contentPane.add(btnKaydet);
		
		panel = new JPanel();
		panel.setBounds(10, 119, 180, 251);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		table = new JTable();
		panel.add(table);
		
		scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		
		LongTextField longTextField = new LongTextField();
		longTextField.setBounds(10, 86, 46, 20);
		contentPane.add(longTextField);
	}
	
	private void ucusKaydet() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// STEP 4: Execute a query
			stmt = conn.createStatement();

			EnumHavaAlani kalkis = (EnumHavaAlani) cmbKalkis.getSelectedItem();
			EnumHavaAlani varis = (EnumHavaAlani) cmbVaris.getSelectedItem();
			String sql;
			sql = "insert into ucus (kalkis, varis) values ('" + kalkis
					+ "', '" + varis + "')";
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
	
	private void ucusTablosunuDoldur() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// STEP 4: Execute a query
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("select count(*) from ucus");
			result.next();
			Long count = result.getLong(1);
			if (count != null && count > 0) {
				ResultSet resultSet = stmt.executeQuery("select * from ucus");
				String[][] data = new String[count.intValue()][3];
				int satir = 0;
				while (resultSet.next()) {
					Long ucusId = resultSet.getLong(1);
					String kalkisYeri = resultSet.getString(2);
					String varisYeri = resultSet.getString(3);
					
					data[satir][0] = ucusId.toString();
					data[satir][1] = kalkisYeri;
					data[satir][2] = varisYeri;
					satir++;
				}
				
				String[] columnNames = {"ID", "KALKIS", "VARIS"};
				
				table.setModel(new DefaultTableModel(data, columnNames));
			} else {
				JOptionPane.showMessageDialog(null, "KAYIT BULUNAMADI");
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