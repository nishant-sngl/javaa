package ds.graph;

public class Graph2 {

	static class Graph{
		int d;
		int g[][];
		
		public Graph(int d) {
			// TODO Auto-generated constructor stub
			this.d = d;
			g= new int[d][d];
			for(int i = 0; i < d ; i++){
				for(int j=0;j<d;j++){
					g[i][j]=0;
				}
			}
		}
	}
	
	/***
	 * Graph implementation by 2d Matrix
	 * @param args
	 */
	public static void main(String[] args) {
		int v=5;
		Graph g = new Graph(v);
		addEdge(g, 0, 1);
        addEdge(g, 0, 4);
        addEdge(g, 1, 2);
        addEdge(g, 1, 3);
        addEdge(g, 1, 4);
        addEdge(g, 2, 3);
        addEdge(g, 3, 4);
        
        printGraph(g);
	}
	
    static void printGraph(Graph graph)
    {       
        for(int x = 0; x < graph.d; x++)
        {
            for(int y=0;y<graph.d;y++){
                System.out.print(graph.g[x][y] + " ");
            }
            System.out.println();
        }
    }
	
	private static void addEdge(Graph gf, int x, int y){
		 gf.g[x][y]=1;
		 gf.g[y][x]=1;
	}
}
