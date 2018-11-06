package user_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.MoveTile;
import controllers.ResetPuzzle;
import entity_classes.PuzzleModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PuzzleBoundary extends JFrame {

	private JPanel contentPane;
	PuzzleModel model;
	PuzzleDrawingPanel drawingpanel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzleBoundary frame = new PuzzleBoundary(new PuzzleModel());
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
	public PuzzleBoundary(PuzzleModel model) {
		setResizable(false);   // make sure can't resize
		this.model = model;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		this.drawingpanel = new PuzzleDrawingPanel(model.getcurrentlayout());
		
		JLabel lblCurrentMoves = new JLabel("Current Moves");
		lblCurrentMoves.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ResetPuzzle(model, PuzzleBoundary.this).reset();
			}
		});
		
		JButton button = new JButton("Up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MoveTile(model, PuzzleBoundary.this).move(button);
			}
		});
		
		JButton btnLeft = new JButton("Left");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MoveTile(model, PuzzleBoundary.this).move(btnLeft);
			}
		});
		
		JButton btnRight = new JButton("Right");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MoveTile(model, PuzzleBoundary.this).move(btnRight);
			}
		});
		
		JButton btnDown = new JButton("Down");
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MoveTile(model, PuzzleBoundary.this).move(btnDown);
			}
		});
		
		JLabel label = new JLabel("0");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnLeft, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
											.addComponent(btnRight))
										.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
											.addComponent(lblCurrentMoves)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(64)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDown)
							.addGap(55))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurrentMoves, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGap(90)
					.addComponent(btnReset)
					.addGap(37)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLeft)
						.addComponent(btnRight))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDown)
					.addGap(222))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public PuzzleDrawingPanel getPuzzleDrawingPanel() {
		return this.drawingpanel;
	}
}
