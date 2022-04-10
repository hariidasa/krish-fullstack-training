import java.util.*;

/**
 * @author Haritha Dasanayake
 * referencing  GeekforGeeks
 *
 */
public class BFS {
	void BFS(int s,int noV, LinkedList<Integer> adjacencyList[])
	    {
	        // Mark all the vertices as not visited(By default
	        // set as false)
	        boolean visited[] = new boolean[noV];
	 
	        // Create a queue for BFS
	        LinkedList<Integer> queue = new LinkedList<Integer>();
	 
	        // Mark the current node as visited and enqueue it
	        visited[s]=true;
	        queue.add(s);
	 
	        while (queue.size() != 0)
	        {
	            // Dequeue a vertex from queue and print it
	            s = queue.poll();
	            System.out.print(s+" ");
	 
	            // Get all adjacent vertices of the dequeued vertex s
	            // If a adjacent has not been visited, then mark it
	            // visited and enqueue it
	            Iterator<Integer> i = adjacencyList[s].listIterator();
	            while (i.hasNext())
	            {
	                int n = i.next();
	                if (!visited[n])
	                {
	                    visited[n] = true;
	                    queue.add(n);
	                }
	            }
	        }
	    }
	 
	 //Main method
	 public static void main(String []args) {
		 
		 int noV,s;
		 LinkedList<Integer> adjLst[];
		 Graph g = new Graph(7);
		 BFS bfs=new BFS();
		 
		  
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(0, 3);
	        g.addEdge(3, 4);
	        g.addEdge(3, 5);
	        g.addEdge(2, 6);
	        
	        
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 0)");
	        
	        s=0;
	        noV=g.getNoV();
	        adjLst=g.getAdjacencyList();
	 
	        bfs.BFS(s,noV,adjLst);
	 }
	 
}