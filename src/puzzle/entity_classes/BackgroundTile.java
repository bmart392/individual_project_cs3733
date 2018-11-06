package puzzle.entity_classes;

public class BackgroundTile {
	
	String id;
	int sizex;
	int sizey;
	boolean iswinningtile;
	
	BackgroundTile(String id, int sizex, int sizey, boolean iswinningtile){
		this.id = id;
		this.sizex = sizex;
		this.sizey = sizey;
		this.iswinningtile = iswinningtile;
	}
	
	BackgroundTile(int sizex, int sizey, boolean iswinningtile){
		this.id = null;
		this.sizex = sizex;
		this.sizey = sizey;
		this.iswinningtile = iswinningtile;
	}
	
	public boolean gettilestatus() {
		return this.iswinningtile;
	}
	
	public int getsizex() {
		return this.sizex;
	}
	
	public int getsizey() {
		return this.sizey;
	}
}
