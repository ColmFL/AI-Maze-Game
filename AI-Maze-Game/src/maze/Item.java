package maze;

import game.GameView;
import traversers.AStar;

public class Item {

	private Node node;
	
	public Item(Node node) {
		this.node = node;
	}
	
	public void activateItem(Node[][] maze, Node startNode, Node goal, GameView g) {
		
		if (node.getNodeType() == '?') {
			
			new AStar(maze, startNode, goal, g);
			System.out.println("AStar hint");
		}
		
	}
	
	
}
