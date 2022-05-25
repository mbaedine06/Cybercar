

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuVente {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuVente window = new MenuVente();
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
	public MenuVente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-295, -6, 568, 394);
		lblNewLabel.setIcon(new ImageIcon("/Users/dinembae/Downloads/pexels-sourav-mishra-1231643.jpg"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU VENTE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(371, 37, 154, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Commande");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    frame.setVisible(false);
			commande.main(null);
			}
		});
		btnNewButton.setBounds(388, 116, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnVente = new JButton("Vente");
		btnVente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			Cybercarvente.main(null);
			}
		});
		btnVente.setBounds(388, 198, 117, 29);
		frame.getContentPane().add(btnVente);{
		}
		JButton btnRapport = new JButton("Rapport");
		btnRapport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRapport.setBounds(388, 239, 117, 29);
		frame.getContentPane().add(btnRapport);
		
		JButton btnFacture = new JButton("Facture");
		btnFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			facture.main(null);
			}
		});
		btnFacture.setBounds(388, 280, 117, 29);
		frame.getContentPane().add(btnFacture);
		
		JButton btnClients = new JButton("Client");
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			Clients.main(null);
			}
		});
		btnClients.setBounds(388, 157, 117, 29);
		frame.getContentPane().add(btnClients);
	}
}
