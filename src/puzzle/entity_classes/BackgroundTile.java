package puzzle.entity_classes;

public class BackgroundTile {
	
	int sizex;
	int sizey;
	boolean iswinningtile;
	
	BackgroundTile(int sizex, int sizey, boolean iswinningtile){
		this.sizex = sizex;
		this.sizey = sizey;
		this.iswinningtile = iswinningtile;
	}
	
	public boolean isThisTileWinner() {
		return this.iswinningtile;
	}
	
	public int getsizex() {
		return this.sizex;
	}
	
	public int getsizey() {
		return this.sizey;
	}
}
