import java.util.ArrayList;

public class Model {
	
	protected Square[][] grid = new Square[3][3];
	

	Model() {  
	}
	
	public void Update(){
		
	}
	
	
	private class Square{
		
		protected int[][] square = new int[3][3];
		
		Square(int[][] input) {
			this.square = input;
		}
		
		
	}
	
}
