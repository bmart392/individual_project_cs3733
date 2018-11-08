package puzzle.entity_classes;

import java.util.LinkedList;

public class PuzzleModel {
	
	PuzzleBoard currentpuzzle;
	int nummoves;
	
	public PuzzleModel(){
		this.currentpuzzle = new PuzzleBoard();
		this.nummoves = 0;
	}
	
	//==================== GETTERS ====================

	// Returns the number of moves played in the game so far
	public int getnummoves() {
		return nummoves;
	}
	
	// Returns the current puzzle configuration as a PuzzleBoard object
	public PuzzleBoard getcurrentlayout() {
		return this.currentpuzzle;
	}
	
	//==================== SETTERS ====================

	// Increases the number of moves in the current game
	public void increasemovecount() {
		this.nummoves++;
	}
	
	//==================== DATA MANIPULATION ====================
	
	// Resets the current puzzle configuration to the starting configuration
	// and resets the number of moves to zero
	public void resetpuzzle() {
		this.currentpuzzle.resettiles();
		this.nummoves = 0;
	}
	
	// Checks if a tile has been selected and returns true if a tile is selected
	public boolean isatileselected() {
		return this.currentpuzzle.getselectedtile() != null;
	}
	
	//  Returns the current coordinates of the selected tile as a LinkedList of integers
	public LinkedList<Integer> getcurrenttilelocation() { 
		return this.currentpuzzle.gettilelocation(); 
		}
	
	// Checks to see if a move is legal and returns true if the move is not legal
	public boolean ismoveillegal(LinkedList<Integer> possiblenewcords, LinkedList<Integer> oldcords ) {
		return this.currentpuzzle.ismoveillegal(possiblenewcords, oldcords);
	}
	
	public boolean iswinningmove(LinkedList<Integer> possiblenewcords) {
		return this.currentpuzzle.iswinningmove(possiblenewcords);
	}
	
	public void setselectedtilelocation(LinkedList<Integer> newcords, LinkedList<Integer> oldcords) {
		this.currentpuzzle.setselectedtilelocation(newcords, oldcords);
	}
	
	public void selecttile(int newtile){
		this.currentpuzzle.setselectedtile(newtile);
	}
	
}
