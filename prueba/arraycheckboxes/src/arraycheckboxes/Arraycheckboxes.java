package arraycheckboxes;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Arraycheckboxes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arraycheckboxes window = new Arraycheckboxes();
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
	public Arraycheckboxes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox[][] checkBoxes=new JCheckBox[10][5];
		
		String[][] etiquetas= {
					{"coco","manzana","uva","fresa","coco"},
					{"manzana","uva","fresa","coco","manzana"},
					{"uva","fresa","coco","manzana","uva"},
					{"fresa","coco","manzana","uva","fresa"},
					{"coco","manzana","uva","fresa","coco"},
					{"manzana","uva","fresa","coco","manzana"},
					{"uva","fresa","coco","manzana","uva"},
					{"fresa","coco","manzana","uva","fresa"},
					{"coco","manzana","uva","fresa","coco"},
					{"manzana","uva","fresa","coco","manzana"}};
		
		for (int i=0;i<checkBoxes.length;i++) {
			for (int j=0;j<checkBoxes[i].length;j++) {
				checkBoxes[i][j]=new JCheckBox(etiquetas[i][j]);
			checkBoxes[i][j].setBounds(74+150*i, 57+20*j, 97, 23);
			frame.getContentPane().add(checkBoxes[i][j]);
			}
		}
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(346, 396, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cuantos=0;
				
				for (int i=0;i<checkBoxes.length;i++) {
					for (int j=0;j<checkBoxes[i].length;j++) {
						if (checkBoxes[i][j].isSelected()) {
							cuantos++;
						}
					}
				}
				lblNewLabel.setText(Integer.toString(cuantos));
			}
		});
		btnNewButton.setBounds(65, 392, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMarcarTodos = new JButton("Marcar todos");
		btnMarcarTodos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i=0;i<checkBoxes.length;i++) {
					for (int j=0;j<checkBoxes[i].length;j++) {
						checkBoxes[i][j].setSelected(true);
					}
				}
			}
		});
		btnMarcarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMarcarTodos.setBounds(489, 337, 89, 23);
		frame.getContentPane().add(btnMarcarTodos);
		
		JButton btnDesmarcarTodos = new JButton("Desmarcar todos");
		btnDesmarcarTodos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i=0;i<checkBoxes.length;i++) {
					for (int j=0;j<checkBoxes[i].length;j++) {
						checkBoxes[i][j].setSelected(false);
					}
				}
			}
		});
		btnDesmarcarTodos.setBounds(606, 337, 89, 23);
		frame.getContentPane().add(btnDesmarcarTodos);
		
		
		
		
		
		
		
//		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
//		chckbxNewCheckBox.setBounds(74, 57, 97, 23);
//		frame.getContentPane().add(chckbxNewCheckBox);
	}
}
