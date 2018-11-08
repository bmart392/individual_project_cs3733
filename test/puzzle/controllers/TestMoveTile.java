package puzzle.controllers;

import javax.swing.JButton;

import junit.framework.TestCase;
import puzzle.entity_classes.PuzzleBoard;
import puzzle.entity_classes.PuzzleModel;
import puzzle.user_interface.PuzzleBoundary;

public class TestMoveTile extends TestCase{
	
	public void testMoveNoSelectedTile() {
		
		PuzzleModel m = new PuzzleModel();		
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		MoveTile mt = new MoveTile(m, app);
		
		JButton btn = new JButton();
				
		// Test when no tile is selected
		assertFalse (mt.move(btn));
	}
	
	public void testMoveLeft() {
		
		PuzzleModel m = new PuzzleModel();		
		m.selecttile(17);
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		MoveTile mt = new MoveTile(m, app);
		
		JButton btn = new JButton();
				
		// Test a move left
		btn.setText("LEFT");
		assertTrue (mt.move(btn));		
	}
	
	public void testMoveRight() {
		
		PuzzleModel m = new PuzzleModel();		
		m.selecttile(17);
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		MoveTile mt = new MoveTile(m, app);
		
		JButton btn = new JButton();
				
		// Test a move right
		btn.setText("RIGHT");
		assertTrue (mt.move(btn));
	}
	
	public void testMoveDown() {
		
		PuzzleModel m = new PuzzleModel();		
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		MoveTile mt = new MoveTile(m, app);
		
		JButton btn = new JButton();
		
		m.setcurrentpuzzle(new PuzzleBoard(0));
		m.selecttile(12);
		
		// Test a move down
		btn.setText("DOWN");
		assertTrue (mt.move(btn));
	}
		
	public void testMoveUp() {
			
		PuzzleModel m = new PuzzleModel();	
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		MoveTile mt = new MoveTile(m, app);
			
		JButton btn = new JButton();
			
		m.setcurrentpuzzle(new PuzzleBoard(0));
		m.selecttile(12);
		
		// Test a move up
		btn.setText("DOWN");
		mt.move(btn);
		btn.setText("UP");
		assertTrue (mt.move(btn));
	}
	
public void testMoveWin() {
		
		PuzzleModel m = new PuzzleModel();		
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		MoveTile mt = new MoveTile(m, app);
		
		JButton btn = new JButton();
		
		m.setcurrentpuzzle(new PuzzleBoard(0));
		m.selecttile(17);
		
		// Test a move down
		btn.setText("DOWN");
		mt.move(btn);
		assertEquals ("Congrats! You won!", app.getlabelwintext());
	}
	
	public void testMoveIllegal() {
		
		PuzzleModel m = new PuzzleModel();		
		m.selecttile(17);
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		MoveTile mt = new MoveTile(m, app);
			
		JButton btn = new JButton();
			
		m.setcurrentpuzzle(new PuzzleBoard(0));		
		
		m.selecttile(13);
				
		// Test with illegal move
		btn.setText("LEFT");
		assertFalse (mt.move(btn));	
	}
	
	
	
	
	

}
