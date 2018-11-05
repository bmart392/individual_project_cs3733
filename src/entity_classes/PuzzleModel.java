package entity_classes;

import java.util.LinkedList;

public class PuzzleModel {
	
	PuzzleBoard currentpuzzle;
	PuzzleBoard originalpuzzle;
	int nummoves;
	
	PuzzleModel(PuzzleBoard currentpuzzle, PuzzleBoard originalpuzzle){
		this.currentpuzzle = currentpuzzle;
		this.originalpuzzle = originalpuzzle;
		this.nummoves = 0;
	}
	
	public void reset() {
		this.currentpuzzle = this.originalpuzzle;
		this.nummoves = 0;
	}
	
	public boolean isatileselected() {
		return this.currentpuzzle.getselectedtile() != null;
	}
	
	public LinkedList<Integer> getcurrenttilelocation() {
		return this.currentpuzzle.gettilelocation();
		
	}
	
	public boolean ismoveillegal(LinkedList<Integer> possiblenewcords) {
		return this.currentpuzzle.ismoveillegal(possiblenewcords);
	}
	
	public boolean iswinningmove(LinkedList<Integer> possiblenewcords) {
		return this.currentpuzzle.iswinningmove(possiblenewcords);
	}
	
	public void setselectedtilelocation(LinkedList<Integer> newcords, LinkedList<Integer> oldcords) {
		this.currentpuzzle.setselectedtilelocation(newcords, oldcords);
	}
	
	public void increasemovecount() {
		this.nummoves++;
	}
	
	public void selecttile(int newtile){
		this.currentpuzzle.setselectedtile(newtile);
	}
}
