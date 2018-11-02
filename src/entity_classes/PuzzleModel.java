package entity_classes;

public class PuzzleModel {
	
	PuzzleBoard currentpuzzle;
	PuzzleBoard originalpuzzle;
	
	PuzzleModel(PuzzleBoard currentpuzzle, PuzzleBoard originalpuzzle){
		this.currentpuzzle = currentpuzzle;
		this.originalpuzzle = originalpuzzle;
	}
	

}
