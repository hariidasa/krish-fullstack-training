import java.util.LinkedList;

/**
 * @author Haritha Dasanayake
 * referencing  GeekforGeeks
 *
 */

public class Graph {
	private int noV; //number of vertices
	private LinkedList<Integer> adjacencyList[];
	
	public Graph(int noV) {
		super();
		this.noV = noV;
		this.adjacencyList = new LinkedList[noV];
        for (int i=0; i<noV; ++i)
        	adjacencyList[i] = new LinkedList();
    
	}
	
	//Method for add edges to the graph
	void addEdge(int noV,int w)
    {
		adjacencyList[noV].add(w);
    }

	public int getNoV() {
		return noV;
	}

	public LinkedList<Integer>[] getAdjacencyList() {
		return adjacencyList;
	}
	
	
}
