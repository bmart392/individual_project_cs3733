package user_interface;

import javax.swing.JPanel;

import entity_classes.PuzzleBoard;

public class PuzzleDrawingPanel extends JPanel{
	
	int tileheight;
	int tilewidth;
	int buffer;
	PuzzleBoard layout;
	
	public PuzzleDrawingPanel(PuzzleBoard layout){
		this.buffer = 10;
		this.tileheight = (this.getHeight() - (6*this.buffer))/5;
		this.tilewidth = (this.getWidth() - (5*this.buffer))/4;
		this.layout = layout;
	}


}
