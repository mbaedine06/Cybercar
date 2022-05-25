import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Clients {

	private JFrame frame;
	private JTextField textenom;
	private JTextField texteprenom;
	private JTextField textetelephone;
	private JTextField texteadresse;
	private JTextField texteemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clients window = new Clients();
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
	public Clients() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textenom = new JTextField();
		textenom.setBackground(new Color(255, 255, 240));
		textenom.setBounds(341, 80, 155, 26);
		frame.getContentPane().add(textenom);
		textenom.setColumns(10);
		
		texteprenom = new JTextField();
		texteprenom.setBackground(new Color(255, 255, 240));
		texteprenom.setColumns(10);
		texteprenom.setBounds(341, 118, 155, 26);
		frame.getContentPane().add(texteprenom);
		
		textetelephone = new JTextField();
		textetelephone.setBackground(new Color(255, 255, 240));
		textetelephone.setColumns(10);
		textetelephone.setBounds(341, 156, 155, 26);
		frame.getContentPane().add(textetelephone);
		
		texteadresse = new JTextField();
		texteadresse.setBackground(new Color(255, 255, 240));
		texteadresse.setColumns(10);
		texteadresse.setBounds(341, 194, 155, 26);
		frame.getContentPane().add(texteadresse);
		
		texteemail = new JTextField();
		texteemail.setBackground(new Color(255, 255, 240));
		texteemail.setColumns(10);
		texteemail.setBounds(341, 232, 155, 26);
		frame.getContentPane().add(texteemail);
		
		JButton btnNewButton_1 = new JButton("\n\nMENU");
		btnNewButton_1.setForeground(new Color(30, 144, 255));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			MenuVente.main(null);
			}
	
		});
		btnNewButton_1.setBounds(258, 281, 61, 43);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(218, 112, 214));
		
		JButton btnSave = new JButton("Sauvegarder");
		btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			Connection connect; // connexion
			
			Statement st; // Requete
			
			ResultSet rS; // Stock les resultat de la requete
			
			try {
				String nom = textenom.getText(); //recupere ce qui est ecrit dans le champ
				String prenom = texteprenom.getText(); //recupere ce qui est ecrit dans le champ
				String telephone = textetelephone.getText(); //recupere ce qui est ecrit dans le champ
				String adresse = texteadresse.getText(); //recupere ce qui est ecrit dans le champ
				String email = texteemail.getText(); //recupere ce qui est ecrit dans le champ



				//Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Connection à la base de donnée
				connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/Cybercar", "root", "root");
				st = connect.createStatement();
				
				st.execute("INSERT INTO `clients`(`nom`,prénom,adresse,noTel,email) VALUES ('"+ nom +"','"+prenom+"','"+telephone+"','"+adresse+"','"+email+"')");//Envoyer une requete
				
				
				rS = st.executeQuery("SELECT * FROM clients"); // Pour recuperer les données de
				rS.next();
				System.out.println(rS.getString(2));
				
		}catch (Exception e1) {
					// TODO: handle exception
					System.out.println(e1);
				}
				
			
							
			}
		});
		btnSave.setBounds(362, 281, 117, 29);
		frame.getContentPane().add(btnSave);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(258, 85, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPrnom = new JLabel("Prénom");
		lblPrnom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPrnom.setBounds(258, 123, 61, 16);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblTlphone = new JLabel("Téléphone");
		lblTlphone.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTlphone.setBounds(258, 161, 82, 16);
		frame.getContentPane().add(lblTlphone);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAdresse.setBounds(258, 199, 61, 16);
		frame.getContentPane().add(lblAdresse);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmail.setBounds(258, 237, 61, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNewLabel_1 = new JLabel("Client");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(362, 6, 113, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/dinembae/eclipse-workspace/Cybercar Vente/IMGautomobil/IMG02.png"));
		lblNewLabel_2.setBounds(-11, -29, 268, 367);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(258, 0, 285, 338);
		frame.getContentPane().add(panel);
	}
}
