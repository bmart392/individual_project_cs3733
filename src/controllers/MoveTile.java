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
			// check if there is currently a tile selected
			currenttileposition = this.model.getcurrenttilelocation();// get current position of tile
			// generate new position of tile based on old one and direction
			// chcek if new position is valid (i.e. goes off the board or tries to be in the location of another tile)
			// set the new location of the tile to be the new position
			// increase the move count
			// refresh the screen
			break;
			
		case LEFT:
			// check if there is currently a tile selected
			// get current position of tile
			// generate new position of tile based on old one and direction
			// chcek if new position is valid (i.e. goes off the board or tries to be in the location of another tile)
			// set the new location of the tile to be the new position
			// increase the move count
			// refresh the screen			
			break;
			
		case RIGHT:
			// check if there is currently a tile selected
			// get current position of tile
			// generate new position of tile based on old one and direction
			// chcek if new position is valid (i.e. goes off the board or tries to be in the location of another tile)
			// set the new location of the tile to be the new position
			// increase the move count
			// refresh the screen			
			break;
			
		case UP:
			// check if there is currently a tile selected
			// get current position of tile
			// generate new position of tile based on old one and direction
			// chcek if new position is valid (i.e. goes off the board or tries to be in the location of another tile)
			// set the new location of the tile to be the new position
			// increase the move count
			// refresh the screen			
			break;
			
		default:
			break;
		
		}
		
		
		
	}

}
