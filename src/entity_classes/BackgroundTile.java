package entity_classes;

public class BackgroundTile {
	
	String id;
	int sizex;
	int sizey;
	boolean winningtile;
	boolean selectedtile;
	
	BackgroundTile(String id, int sizex, int sizey, boolean winningtile, boolean selectedtile){
		this.id = id;
		this.sizex = sizex;
		this.sizey = sizey;
		this.winningtile = winningtile;
		this.selectedtile = selectedtile;
	}
	
	

}
