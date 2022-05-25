import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class facture {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facture window = new facture();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public facture() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 602, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 301, 384);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(396, 91, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(396, 141, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(396, 191, 130, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(396, 237, 130, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(396, 275, 130, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(396, 313, 130, 26);
		frame.getContentPane().add(textField_5);
		
		JButton btnSave = new JButton("Afficher les valeur");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
         /*
				try {
				    PreparedStatement pst =null;
				    ResultSet rst=(ResultSet) pst;

				    Connection con=(Connection)    DriverManager.getConnection("jdbc:mysql://localhost:8889/Cybercar", "root", "root");
				    String sql="\"SELECT * FROM commande\"";
				    pst=(PreparedStatement) con.prepareStatement(sql);
				    pst.setString(1,search_f.getText());
				    rst=pst.executeQuery();
				   while (rst.next()){String add1=rst.getString("raqm_iqar");
				    jTextArea2.append(add1 + "\n");
				    System.out.format("%s",add1);
				    }

				} catch (Exception e) {
				}
					}
					
				*/
			
			}
			
		   
		});
		btnSave.setBounds(409, 351, 117, 29);
		frame.getContentPane().add(btnSave);
	}
}
