package controllers;

import java.util.LinkedList;

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
			if (!this.model.isatileselected()) {
				break;
			}
			// get current position of tile
			LinkedList<Integer> currenttileposition = this.model.getcurrenttilelocation();
			
			// generate new position of tile based on old one and direction
			this.calcnewtilelocation(Direction.DOWN, currenttileposition);
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
	
	public LinkedList<Integer> calcnewtilelocation(Direction givendirection, LinkedList<Integer> oldcords){
		LinkedList<Integer> newcords = new LinkedList<Integer>();
		LinkedList<Integer> possiblecords = new LinkedList<Integer>();
		
		switch(givendirection) {
		case DOWN:
			
			for (int i = 0; i < oldcords.size(); i++) {
				possiblecords.add(oldcords.get(i)+4);
			}
			
			if(this.model.ismoveillegal(possiblecords)) {
				break;
			}
			
			// check to see if move is legal
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
		
		return newcords;
	}
		

}
