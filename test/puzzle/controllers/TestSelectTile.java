package puzzle.controllers;

import java.awt.event.MouseEvent;

import junit.framework.TestCase;
import puzzle.entity_classes.PuzzleModel;
import puzzle.user_interface.PuzzleBoundary;

public class TestSelectTile extends TestCase{
	
	public void testMouseClicked() {
		
		PuzzleModel m = new PuzzleModel();		
		PuzzleBoundary app = new PuzzleBoundary(m);
		
		SelectTile st = new SelectTile(m, app);
		
		MouseEvent e = new MouseEvent(app, 40, 40, 40, 40, 40, 40, false);
		
		st.mouseClicked(e);
		
		assertTrue (m.isatileselected());
		
	}

}
