package graph;
import java.util.ArrayList;

public class Board {

	private int[][] board;
	
	/**
	 * Constructs a board object with square sides and a flat plane of magnitude 1
	 * 
	 * @param sidelength sidelength of the board
	 */
	public Board (int sidelength)
	{
		board = new int[sidelength][sidelength];
		for(int i = 0; i < sidelength; i++)
		{
			for(int k = 0; k < sidelength; k++)
			{
				board[i][k] = 1;
			}
		}
	}
	
	/**
	 * Constructs board object
	 * 
	 * @param board a 2d array used to store board format
	 */
	public Board (int[][] board)
	{
		this.board = board;
	}
	/**
	 * Finds the distance between two nodes using the most direct route
	 * and assuming the nodes inbetween are on the same plane as the start
	 * point. This allows diagonal movement
	 * 
	 * @param x1 the x position of the first node
	 * @param y1 the y position of the first node
	 * @param x2 the x position of the second node
	 * @param y2 the y position of the second node
	 */
	public int directDistance (int x1, int y1, int x2, int y2)
	{
		int dx = Math.abs(x2-x1);
		int dy = Math.abs(y2-y1);
		
		if(dx > dy) return dx;
		else return dy;
	}
	
	/**
	 * Finds the optimal node to move to from node 1 to node 2. Finds the optimal h(n) value
	 * in the a* pathing  
	 * 
	 * @param x1 the x position of the first node
	 * @param y1 the y position of the first node
	 * @param x2 the x position of the second node
	 * @param y2 the y position of the second node
	 * @return
	 */
	public int[] (int x1, int y1, int x2, int y2)
	{
		int[] optimalPoint = new int[3];
		
		//calculates the distance it takes to get from first node to adjacent nodes and
		//adds that value to the direct distance calculation
		for(int i = x1-1; i < x1+2; i++)
		{
			for(int k = y1-1 ; k < y1+2; i++)
			{
				if(withinBounds(i,k) && i != x1 && k != y1)
				{
					 int dist = directDistance(i, k, x2, y2);
					 if(optimalPoint[2]==0 || dist < optimalPoint[2]){
						 
					 }
				}
			}
		}
		
		return ;
	}
	
	/**
	 * @param x
	 * @param y
	 * @return returns true if the coordinate is within the range the array (assumes square)
	 */
	public boolean withinBounds(int x, int y) {
		if (x > 0 && x < board.length && y > 0 && y < board[1].length) return true;
		else return false;
	}
}
