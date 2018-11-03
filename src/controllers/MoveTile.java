package controllers;

import entity_classes.PuzzleModel;
import user_interface.PuzzleBoundary;

enum Direction{
	
	UP,DOWN,LEFT,RIGHT
	
}




public class MoveTile {
	
	PuzzleModel model;
	PuzzleBoundary boundary;
	
	MoveTile(PuzzleModel model, PuzzleBoundary boundary){
		this.model = model;
		this. boundary = boundary;
	}
	
	public void move(String thebuttonpressed) {
		
		switch(Direction.valueOf(thebuttonpressed))
		{
		
		case DOWN:
			break;
			
		case LEFT:
			break;
			
		case RIGHT:
			break;
			
		case UP:
			break;
			
		default:
			break;
		
		}
		
		
		
	}

}
