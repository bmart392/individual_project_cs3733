package puzzle.entity_classes;

import java.util.LinkedList;

public class PuzzleModel {
	
	PuzzleBoard currentpuzzle;
	PuzzleBoard originalpuzzle;
	int nummoves;
	
	public PuzzleModel(){
		this.currentpuzzle = new PuzzleBoard(0);
		this.originalpuzzle = new PuzzleBoard(0);
		this.nummoves = 0;
	}
	/*public PuzzleModel(PuzzleBoard currentpuzzle){
		this.currentpuzzle = currentpuzzle;
		this.originalpuzzle = this.currentpuzzle;
		this.nummoves = 0;
	}*/
	
	public void resetpuzzle() {
		//this.currentpuzzle = new PuzzleBoard(0);
		//this.currentpuzzle.settiles(this.originalpuzzle.gettiles()); ;
		//this.currentpuzzle = new PuzzleBoard(0);//this.originalpuzzle;
		this.currentpuzzle.resettiles();
		this.nummoves = 0;
	}
	
	public int getnummoves() {
		return nummoves;
	}
	
	public boolean isatileselected() {
		return this.currentpuzzle.getselectedtile() != null;
	}
	
	public LinkedList<Integer> getcurrenttilelocation() {
		return this.currentpuzzle.gettilelocation();
		
	}
	
	public boolean ismoveillegal(LinkedList<Integer> possiblenewcords, LinkedList<Integer> oldcords ) {
		return this.currentpuzzle.ismoveillegal(possiblenewcords, oldcords);
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
	
	public PuzzleBoard getcurrentlayout() {
		return this.currentpuzzle;
	}
}
