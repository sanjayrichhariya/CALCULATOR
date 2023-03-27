

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fristwork extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fristwork frame = new fristwork();
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
	public fristwork() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labela = new JLabel("A");
		labela.setFont(new Font("Tahoma", Font.BOLD, 17));
		labela.setBounds(124, 41, 22, 28);
		contentPane.add(labela);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setBounds(142, 10, 123, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		tfa = new JTextField();
		tfa.setBounds(169, 49, 96, 19);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel heading = new JLabel("B");
		heading.setFont(new Font("Tahoma", Font.BOLD, 16));
		heading.setBounds(124, 97, 45, 13);
		contentPane.add(heading);
		
		tfb = new JTextField();
		tfb.setBounds(169, 96, 96, 19);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		tfr = new JTextField();
		tfr.setBounds(169, 132, 96, 19);
		contentPane.add(tfr);
		tfr.setColumns(10);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1+var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		add.setFont(new Font("Tahoma", Font.BOLD, 14));
		add.setForeground(new Color(255, 0, 0));
		add.setBounds(10, 197, 72, 21);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1-var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		sub.setForeground(Color.RED);
		sub.setFont(new Font("Tahoma", Font.BOLD, 14));
		sub.setBounds(86, 197, 72, 21);
		contentPane.add(sub);
		
		JButton mul = new JButton("MULT");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1*var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		mul.setForeground(Color.RED);
		mul.setFont(new Font("Tahoma", Font.BOLD, 14));
		mul.setBounds(168, 197, 72, 21);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				float var1=Float.valueOf(data1);
				float var2=Float.valueOf(data2);
				float res=var1/var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		div.setForeground(Color.RED);
		div.setFont(new Font("Tahoma", Font.BOLD, 14));
		div.setBounds(250, 197, 72, 21);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1%var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		rem.setForeground(Color.RED);
		rem.setFont(new Font("Tahoma", Font.BOLD, 14));
		rem.setBounds(335, 197, 72, 21);
		contentPane.add(rem);
		
		JLabel labelres = new JLabel("Result");
		labelres.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelres.setBounds(97, 132, 72, 22);
		contentPane.add(labelres);
	}
}
