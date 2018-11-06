package puzzle.main;

import puzzle.entity_classes.PuzzleModel;
import puzzle.user_interface.PuzzleBoundary;

public class Main {
	
	public static void main (String args[]) {
		 PuzzleModel m = new PuzzleModel();
		 PuzzleBoundary app = new PuzzleBoundary(m);
		
		app.setVisible(true);
	}

}
