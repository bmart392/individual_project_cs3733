package puzzle.controllers;

import java.util.LinkedList;

import javax.swing.JButton;

import puzzle.entity_classes.PuzzleModel;
import puzzle.user_interface.PuzzleBoundary;

enum Direction{
	
	UP,DOWN,LEFT,RIGHT
	
}

public class MoveTile {
	
	PuzzleModel model;
	PuzzleBoundary boundary;
	
	public MoveTile(PuzzleModel model, PuzzleBoundary boundary){
		this.model = model;
		this. boundary = boundary;
	}
	
	public void move(JButton buttonpressed) {
			
			// check if there is currently a tile selected
			if (!this.model.isatileselected()) { return; }			
			
			// Get the direction the tile needs to move
			Direction indicateddirection = Direction.valueOf(buttonpressed.getText());
		
			// get current position of tile
			LinkedList<Integer> currenttileposition = this.model.getcurrenttilelocation();
			
			// generate new position of tile based on old one and direction
			LinkedList<Integer> newcords = this.calcnewtilelocation(indicateddirection, currenttileposition);
			

			// Check to see if this move wins
			if(this.model.iswinningmove(newcords)) {
				
				this.boundary.setwinlabel("Congrats! You won!");
				
			} else {
				
				// check if new position is valid (i.e. goes off the board or tries to be in the location of another tile)
				if(this.model.ismoveillegal(newcords, currenttileposition)) { return; }
			}
			
			// set the new location of the tile to be the new position
			this.model.setselectedtilelocation(newcords, currenttileposition);
			
			// increase the move count
			this.model.increasemovecount();
			
			// refresh the screen
			this.boundary.setcurrentmoves();
			this.boundary.repaint();
			
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
