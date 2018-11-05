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
		
		
			// check if there is currently a tile selected
			if (!this.model.isatileselected()) {
				return;
			}
			// get current position of tile
			LinkedList<Integer> currenttileposition = this.model.getcurrenttilelocation();
			
			// generate new position of tile based on old one and direction
			LinkedList<Integer> newcords = this.calcnewtilelocation(Direction.DOWN, currenttileposition);
			

			// Check to see if this move wins
			if(this.model.iswinningmove(newcords)) {
				// Fill in with proper winning code later
				return;
			}
			
			// check if new position is valid (i.e. goes off the board or tries to be in the location of another tile)
			if(this.model.ismoveillegal(newcords)) {
				return;
			}
			
			// set the new location of the tile to be the new position
			this.model.setselectedtilelocation(newcords, currenttileposition);
			
			// increase the move count
			this.model.increasemovecount();
			
			// refresh the screen
			
		}
	
	public LinkedList<Integer> calcnewtilelocation(Direction givendirection, LinkedList<Integer> oldcords){
		LinkedList<Integer> newcords = new LinkedList<Integer>();
		
		switch(givendirection) {
		case DOWN:
			for (int i = 0; i < oldcords.size(); i++) {
				newcords.add(oldcords.get(i)+4);
			}
			break;
		case LEFT:
			for (int i = 0; i < oldcords.size(); i++) {
				newcords.add(oldcords.get(i)-1);
			}
			break;
		case RIGHT:
			for (int i = 0; i < oldcords.size(); i++) {
				newcords.add(oldcords.get(i)+1);
			}
			break;
		case UP:
			for (int i = 0; i < oldcords.size(); i++) {
				newcords.add(oldcords.get(i)-4);
			}
			break;
		}
		
		return newcords;
	}
		

}
