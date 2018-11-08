package puzzle.controllers;

import junit.framework.TestCase;
import puzzle.entity_classes.PuzzleBoard;
import puzzle.entity_classes.PuzzleModel;
import puzzle.user_interface.PuzzleBoundary;

public class TestResetPuzzle extends TestCase{
	
	public void testReset() {
		
		PuzzleModel m = new PuzzleModel();
		m.setcurrentpuzzle(new PuzzleBoard(0));
		m.selecttile(13);
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		ResetPuzzle rp = new ResetPuzzle(m, app);
		
		rp.reset();
		
		assertEquals (" ", app.getlabelwintext());
	}

}
