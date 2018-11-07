package puzzle.controllers;

import puzzle.entity_classes.PuzzleModel;
import puzzle.user_interface.PuzzleBoundary;

public class ResetPuzzle {
	
	PuzzleModel model;
	PuzzleBoundary boundary;
	
	public ResetPuzzle(PuzzleModel model, PuzzleBoundary boundary){
		this.model = model;
		this. boundary = boundary;
	}

	public void reset() {
		this.model.reset();
		this.boundary.repaint();
	}

}
