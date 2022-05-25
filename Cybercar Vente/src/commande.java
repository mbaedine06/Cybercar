import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;

public class commande {

	private JFrame frame;
	private JTextField texterefcommande;
	private JTextField textedatecommande;
	private JTextField textepays;
	private JTextField texteville;
	private JTextField textenomcomplet;
	private JTextField texteemail;
	private JTextField textecodepostal;
	private JTextField texteadresse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					commande window = new commande();
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
	public commande() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Commande ");
		lblNewLabel_1.setBounds(438, 6, 148, 32);
		lblNewLabel_1.setFont(new Font("Muna", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-19, -13, 281, 436);
		lblNewLabel.setIcon(new ImageIcon("/Users/dinembae/eclipse-workspace/Cybercar Vente/IMGautomobil/Acceuil vente.png"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Référence commande");
		lblNewLabel_2.setBounds(274, 78, 134, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date commande");
		lblNewLabel_3.setBounds(274, 106, 119, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Model Véhicul");
		lblNewLabel_4.setBounds(274, 282, 118, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Validation");
		lblNewLabel_6.setBounds(274, 307, 118, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Pays");
		lblNewLabel_5.setBounds(274, 161, 44, 24);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Code postal");
		lblNewLabel_7.setBounds(274, 220, 93, 24);
		frame.getContentPane().add(lblNewLabel_7);
		
		texterefcommande = new JTextField();
		texterefcommande.setBounds(410, 78, 215, 24);
		frame.getContentPane().add(texterefcommande);
		texterefcommande.setColumns(10);
		
		textedatecommande = new JTextField();
		textedatecommande.setBounds(410, 106, 215, 24);
		textedatecommande.setColumns(10);
		frame.getContentPane().add(textedatecommande);
		
		textepays = new JTextField();
		textepays.setBounds(410, 161, 215, 24);
		frame.getContentPane().add(textepays);
		textepays.setColumns(10);
		
		texteville = new JTextField();
		texteville.setBounds(410, 247, 215, 24);
		frame.getContentPane().add(texteville);
		texteville.setColumns(10);
		
		JComboBox textemodelvehicul = new JComboBox();
		textemodelvehicul.setModel(new DefaultComboBoxModel(new String[] {"Aucun model", "Abarth", "Alfa Romeo", "Alpine", "Aston Martin", "Audi", "Bentley", "BMW", "Bollore", "BRP", "Bugatti", "Cadillac", "Caterham", "Chevrolet", "Chrysler", "Citroën", "Cupra", "Dacia sandéro", "Daihatsu", "DeVinci", "Dodge", "DS", "F. Ferrari", "Fiat", "Fisker", "Ford", "G M C", "Gordon Murray AutoMT", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Lamborghini", "Lancia", "Peugeot"}));
		textemodelvehicul.setBounds(410, 283, 215, 24);
		frame.getContentPane().add(textemodelvehicul);
		
		JComboBox<?> textevalidation = new JComboBox();
		textevalidation.setModel(new DefaultComboBoxModel(new String[] {"Aucune validation", "Disponible", "Indisponible"}));
		textevalidation.setBounds(410, 308, 215, 32);
		frame.getContentPane().add(textevalidation);
		
		JButton btnSave = new JButton("Sauvegarder");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String modVeh [] = {"Aucun model", "Abarth", "Alfa Romeo", "Alpine", "Aston Martin", "Audi", "Bentley", "BMW", "Bollore", "BRP", "Bugatti", "Cadillac", "Caterham", "Chevrolet", "Chrysler", "Citroën", "Cupra", "Dacia sandéro", "Daihatsu", "DeVinci", "Dodge", "DS", "F. Ferrari", "Fiat", "Fisker", "Ford", "G M C", "Gordon Murray AutoMT", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Lamborghini", "Lancia", "Peugeot"};
				String textV [] = {"Aucune validation", "Disponible", "Indisponible"};
				
			
				
		 Connection connect; // connexion
				
				Statement st; // Requete
				
				ResultSet rS; // Stock les resultat de la requete
				
				try {
				    String Nom_complet = textenomcomplet.getText();                        //recupere ce qui est ecrit dans le champ
					String Ref_commande = texterefcommande.getText();                      //recupere ce qui est ecrit dans le champ
					String Date_commande = textedatecommande.getText();                    //recupere ce qui est ecrit dans le champ
					String Email = texteemail.getText();                                   //recupere ce qui est ecrit dans le champ
					String Pays = textepays.getText();                                     //recupere ce qui est ecrit dans le champ
					String Adresse = texteadresse.getText();                               //recupere ce qui est ecrit dans le champ
					String Code_postal = textecodepostal.getText();                        //recupere ce qui est ecrit dans le champ
					String Ville = texteville.getText();                                   //recupere ce qui est ecrit dans le champ
					String Model_vehicul = modVeh[textemodelvehicul.getSelectedIndex()];   //recupere ce qui est ecrit dans le champ
					String Texte_validation = textV[textevalidation.getSelectedIndex()];   //recupere ce qui est ecrit dans le champ



					//Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Connection à la base de donnée
					connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/Cybercar", "root", "root");
					st = connect.createStatement();
					
					st.execute("INSERT INTO `commande`(`nom_complet`,référence_commande,date_commande,email,pays,adresse,code_postal,ville,model_véhicul,validation) VALUES ('"+Nom_complet+"','"+Ref_commande+"','"+Date_commande+"','"+Email+"','"+Pays+"','"+Adresse+"','"+Code_postal+"','"+Ville+"','"+Model_vehicul+"','"+Texte_validation+"')");//Envoyer une requete
					
					
					rS = st.executeQuery("SELECT * FROM commande"); // Pour recuperer les données de
					rS.next();
					System.out.println(rS.getString(2));
				
			}catch (Exception e1) {
						// TODO: handle exception
						System.out.println(e1);
			}
			}
			});		
		JButton btnNewButton_1 = new JButton("\n\nMENU");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			MenuVente.main(null);
			}
		});
		btnNewButton_1.setBounds(263, 374, 61, 49);
		frame.getContentPane().add(btnNewButton_1);
		btnSave.setBounds(451, 361, 135, 24);
		frame.getContentPane().add(btnSave);
		
		textenomcomplet = new JTextField();
		textenomcomplet.setColumns(10);
		textenomcomplet.setBounds(410, 50, 215, 26);
		frame.getContentPane().add(textenomcomplet);
		
		JLabel lblNewLabel_8 = new JLabel("Nom complet");
		lblNewLabel_8.setBounds(274, 52, 93, 26);
		frame.getContentPane().add(lblNewLabel_8);
		
		texteemail = new JTextField();
		texteemail.setColumns(10);
		texteemail.setBounds(410, 134, 215, 24);
		frame.getContentPane().add(texteemail);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email");
		lblNewLabel_3_1.setBounds(274, 134, 119, 24);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textecodepostal = new JTextField();
		textecodepostal.setColumns(10);
		textecodepostal.setBounds(410, 220, 215, 24);
		frame.getContentPane().add(textecodepostal);
		
		JLabel lblNewLabel_7_1 = new JLabel("Ville");
		lblNewLabel_7_1.setBounds(274, 246, 93, 24);
		frame.getContentPane().add(lblNewLabel_7_1);
		
		texteadresse = new JTextField();
		texteadresse.setColumns(10);
		texteadresse.setBounds(410, 188, 215, 32);
		frame.getContentPane().add(texteadresse);
		
		JLabel lblNewLabel_7_2 = new JLabel("Adresse");
		lblNewLabel_7_2.setBounds(274, 197, 93, 24);
		frame.getContentPane().add(lblNewLabel_7_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(256, -13, 395, 436);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
			
		}
}
	
	
