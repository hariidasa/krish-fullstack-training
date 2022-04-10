import java.util.*;

/**
 * @author Haritha Dasanayake
 * referencing  GeekforGeeks
 *
 */

public class DFS {
	 // A function used by DFS
    void DFSUtil(int v, boolean visited[],LinkedList<Integer> adjacencyList[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
 
        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adjacencyList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited,adjacencyList);
        }
    }
	 void DFS(int s, int noV, LinkedList<Integer> adjacencyList[])
	    {
	        // Mark all the vertices as
	        // not visited(set as
	        // false by default in java)
	        boolean visited[] = new boolean[noV];
	 
	        // Call the recursive helper
	        // function to print DFS
	        // traversal
	        DFSUtil(s, visited,adjacencyList);
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int noV,s;
		 LinkedList<Integer> adjLst[];
		 
		 Graph g = new Graph(6);
		 DFS dfs=new DFS();
	       
		 	g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(0, 3);
	        g.addEdge(2, 4);
	        g.addEdge(2, 5);
	        g.addEdge(3, 6);
	 
	        System.out.println(
	            "Following is Depth First Traversal "
	            + "(starting from vertex 0)");
	        
	        s=2;
	        noV=g.getNoV();
	        adjLst=g.getAdjacencyList();
	 
	        dfs.DFS(s,noV,adjLst);

	}

}
