import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageHOME {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageHOME window = new PageHOME();
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
	public PageHOME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCEUIL VENTE");
		lblNewLabel.setBounds(216, 112, 163, 25);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JButton menuvente = new JButton("MENU VENTE");
		menuvente.setBounds(237, 208, 117, 29);
		menuvente.setForeground(Color.GREEN);
		menuvente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			MenuVente.main(null);
			}
		});
		frame.getContentPane().add(menuvente);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-97, -11, 308, 402);
		lblNewLabel_2.setIcon(new ImageIcon("/Users/dinembae/eclipse-workspace/Cybercar Vente/IMGautomobil/ACCEUILVENTE01.png"));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(391, -11, 244, 402);
		lblNewLabel_1.setIcon(new ImageIcon("/Users/dinembae/eclipse-workspace/Cybercar Vente/IMGautomobil/ACCEUILVENTE1.jpg"));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton(" Polithique de confidentialité ");
		btnNewButton.setBounds(193, 362, 213, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton);
	}
}
