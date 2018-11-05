package controllers;

import entity_classes.PuzzleModel;
import user_interface.PuzzleBoundary;

public class SelectTile {
	
	PuzzleModel model;
	PuzzleBoundary boundary;
	
	SelectTile(PuzzleModel model, PuzzleBoundary boundary){
		this.model = model;
		this. boundary = boundary;
	}

	public void select() {
		
		int thistile = 0;
		
		this.model.selecttile(thistile);
	}

}
