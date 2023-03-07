import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class firstP {

	private JFrame frame;
	private JTextField a;
	private JTextField b;
	private JTextField c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstP window = new firstP();
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
	public firstP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter first no.");
		lblNewLabel.setBounds(10, 30, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		a = new JTextField();
		a.setBounds(159, 27, 86, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setBounds(159, 67, 86, 20);
		frame.getContentPane().add(b);
		b.setColumns(10);
		
		c = new JTextField();
		c.setBounds(159, 121, 86, 20);
		frame.getContentPane().add(c);
		c.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter second no.");
		lblNewLabel_1.setBounds(10, 70, 91, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ans is");
		lblNewLabel_2.setBounds(10, 124, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x, y,sum;
				String x1,x2;
				x1= a.getText();
				x=Integer.parseInt(x1);
				y=Integer.parseInt(b.getText());
				sum=x+y;
				c.setText(String.valueOf(sum));
		
				
			}
		});
		btnNewButton.setBounds(34, 174, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sub");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x, y,sum;
				String x1,x2;
				x1= a.getText();
				x=Integer.parseInt(x1);
				y=Integer.parseInt(b.getText());
				sum=x-y;
				c.setText(String.valueOf(sum));
			}
		});
		btnNewButton_1.setBounds(219, 174, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setText("");
				a.setText("");
				b.setText("");
			}
		});
		btnNewButton_2.setBounds(34, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(219, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
