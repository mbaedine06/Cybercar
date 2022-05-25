import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;

public class Cybercarvente {

	private JFrame frame;
	private JTextField textenom;
	private JTextField texteprenom;
	private JTextField texteadresse;
	private JTextField texteville;
	private JTextField textetelephone;
	private JTextField texteemail;
	private JTextField textecodepost;
	private JTextField texterefvente;
	private JTextField texteprix;
	private JTextField textedatevente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cybercarvente window = new Cybercarvente();
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
	public Cybercarvente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 692, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textenom = new JTextField();
		textenom.setBounds(426, 89, 228, 20);
		frame.getContentPane().add(textenom);
		textenom.setColumns(10);
		
		texteprenom = new JTextField();
		texteprenom.setBounds(426, 121, 228, 20);
		texteprenom.setColumns(10);
		frame.getContentPane().add(texteprenom);
		texteprenom.setColumns(10);
		
		texteadresse = new JTextField();
		texteadresse.setBounds(426, 153, 228, 20);
		texteadresse.setColumns(10);
		frame.getContentPane().add(texteadresse);
		
		texteville = new JTextField();
		texteville.setBounds(426, 185, 228, 20);
		texteville.setColumns(10);
		frame.getContentPane().add(texteville);
		
		textetelephone = new JTextField();
		textetelephone.setBounds(426, 217, 228, 20);
		textetelephone.setColumns(10);
		frame.getContentPane().add(textetelephone);
		
		textecodepost = new JTextField();
		textecodepost.setBounds(426, 281, 228, 20);
		textecodepost.setColumns(10);
		frame.getContentPane().add(textecodepost);
		
		texteemail = new JTextField();
		texteemail.setBounds(426, 249, 228, 20);
		texteemail.setColumns(10);
		frame.getContentPane().add(texteemail);
		
		texterefvente = new JTextField();
		texterefvente.setBounds(426, 313, 228, 20);
		texterefvente.setColumns(10);
		frame.getContentPane().add(texterefvente);
		
		texteprix = new JTextField();
		texteprix.setBounds(426, 407, 228, 23);
		texteprix.setColumns(10);
		frame.getContentPane().add(texteprix);
		
		JButton btnSave = new JButton("Enregistrer");
		btnSave.setBounds(482, 442, 117, 29);
		frame.getContentPane().add(btnSave);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Connection connect; // connexion
		
				Statement st; // Requete
				
				ResultSet rS; // Stock les resultat de la requete
				
				try {
					String nom = textenom.getText();         //recupere ce qui est ecrit dans le champ
					String prenom = texteprenom.getText();   //recupere ce qui est ecrit dans le champ
					String telephone = texteville.getText(); //recupere ce qui est ecrit dans le champ
					String email = textetelephone.getText(); //recupere ce qui est ecrit dans le champ
					String codepost = textetelephone.getText(); //recupere ce qui est ecrit dans le champ
					String refvente = textetelephone.getText(); //recupere ce qui est ecrit dans le champ
					String datevente = textetelephone.getText(); //recupere ce qui est ecrit dans le champ
					String ajoutevoiture = textetelephone.getSelectedText(); //recupere ce qui est ecrit dans le champ
					String prix = texteprix.getText(); //recupere ce qui est ecrit dans le champ
					 
					


					//Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Connection à la base de donnée
					connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/Cybercar", "root", "root");
					st = connect.createStatement();
					
					st.execute("INSERT INTO `vente`(`nom`,prenom,noTel,email,code_postal,référence_voiture,date_vente,prix,ajouter_voiture) VALUES ('"+ nom +"','"+prenom+"','"+telephone+"','"+email+"','"+codepost+"','"+refvente+"','"+datevente+"','"+ajoutevoiture+"','"+prix+"')");//Envoyer une requete
					
				
					
					
					
					rS = st.executeQuery("SELECT * FROM clients"); // Pour recuperer les données de
					rS.next();
					System.out.println(rS.getString(2));
					
					
				}catch (Exception e1) {
					// TODO: handle exception
					System.out.println(e1);
				}
				
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(6, 187, 61, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("VENTE");
		lblNewLabel_2.setBounds(491, 6, 84, 60);
		lblNewLabel_2.setFont(new Font("Muna", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_7 = new JLabel("Nom");
		lblNewLabel_7.setBounds(295, 90, 48, 16);
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Prénom");
		lblNewLabel_8.setBounds(295, 122, 61, 16);
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Adresse");
		lblNewLabel_8_1.setBounds(295, 154, 61, 16);
		lblNewLabel_8_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Téléphone");
		lblNewLabel_8_2.setBounds(295, 220, 70, 16);
		frame.getContentPane().add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("Email");
		lblNewLabel_8_3.setBounds(295, 248, 61, 16);
		lblNewLabel_8_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_3_1 = new JLabel("Référence Vente");
		lblNewLabel_8_3_1.setBounds(295, 317, 119, 16);
		frame.getContentPane().add(lblNewLabel_8_3_1);
		
		JLabel lblNewLabel_8_3_1_1 = new JLabel("Date de vente");
		lblNewLabel_8_3_1_1.setBounds(295, 351, 93, 16);
		frame.getContentPane().add(lblNewLabel_8_3_1_1);
		
		JLabel lblNewLabel_8_3_1_1_1 = new JLabel("Ajouter une voiture");
		lblNewLabel_8_3_1_1_1.setBounds(295, 379, 130, 16);
		frame.getContentPane().add(lblNewLabel_8_3_1_1_1);
		
		JLabel lblNewLabel_8_3_1_1_2 = new JLabel("Prix");
		lblNewLabel_8_3_1_1_2.setBounds(295, 407, 119, 16);
		frame.getContentPane().add(lblNewLabel_8_3_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Ville");
		lblNewLabel.setBounds(295, 187, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textedatevente = new JTextField();
		textedatevente.setBounds(426, 345, 228, 20);
		textedatevente.setColumns(10);
		frame.getContentPane().add(textedatevente);
		
		JLabel Codepost = new JLabel("Code Postal");
		Codepost.setBounds(295, 283, 93, 16);
		frame.getContentPane().add(Codepost);
		
		JComboBox texteajoutevoiture = new JComboBox();
		texteajoutevoiture.setModel(new DefaultComboBoxModel(new String[] {"Aucun model", "Abarth", "Alfa Romeo", "Alpine", "Aston Martin", "Audi", "Bentley", "BMW", "Bollore", "BRP", "Bugatti", "Cadillac", "Caterham", "Chevrolet", "Chrysler", "Citroën", "Cupra", "Dacia sandéro", "Daihatsu", "DeVinci", "Dodge", "DS", "F. Ferrari", "Fiat", "Fisker", "Ford", "G M C", "Gordon Murray AutoMT", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Lamborghini", "Lancia", "Peugeot"}));
		texteajoutevoiture.setBounds(426, 373, 228, 29);
		frame.getContentPane().add(texteajoutevoiture);
		
		JButton btnNewButton_1 = new JButton("\n\nMENU");
		btnNewButton_1.setBounds(304, 432, 61, 49);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			MenuVente.main(null);
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setBackground(new Color(218, 112, 214));
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/dinembae/eclipse-workspace/Cybercar Vente/IMGautomobil/IMG01.png"));
		lblNewLabel_1.setBounds(-17, -25, 309, 511);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(289, 0, 397, 486);
		frame.getContentPane().add(panel);
		
		
		
	}
}
