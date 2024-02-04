import java.util.*;
 
public class Dijkstra {
    private int          distances[];
    private Set<Integer> visited;
    private Set<Integer> unvisited;
    private int          number_of_nodes;
    private int          adjacencyMatrix[][];
    
    //Constructor
    public Dijkstra(int number_of_nodes){
        this.number_of_nodes = number_of_nodes; 
        distances = new int[number_of_nodes];
        visited = new HashSet<Integer>();
        unvisited = new HashSet<Integer>();
        adjacencyMatrix = new int[number_of_nodes][number_of_nodes];
    }
    
    public void dijkstra_algorithm(int adjacency_matrix[][], int source) {
        int evaluationNode;
        for (int i = 0; i < number_of_nodes; i++)
            for (int j = 0; j < number_of_nodes; j++)
                adjacencyMatrix[i][j] = adjacency_matrix[i][j];
 
        for (int i = 0; i < number_of_nodes; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        unvisited.add(source);
        distances[source] = 0;
        while (!unvisited.isEmpty()) {
            evaluationNode = getNodeWithMinimumDistanceFromUnvisited();
            unvisited.remove(evaluationNode);
            visited.add(evaluationNode);
            evaluateNeighbours(evaluationNode);
        }
    }
    
    private int getNodeWithMinimumDistanceFromUnvisited() {
        int min;
        int node = 0;
 
        Iterator<Integer> iterator = unvisited.iterator();
        node = iterator.next();
        min = distances[node];
        for (int i = 0; i < distances.length; i++) {
            if (unvisited.contains(i)) {
                if (distances[i] <= min) {
                    min = distances[i];
                    node = i;
                }
            }
        }
        return node;
    }
 
    private void evaluateNeighbours(int evaluationNode) {
        int edgeDistance = -1;
        int newDistance = -1;
 
        for (int destinationNode = 0; destinationNode < number_of_nodes; destinationNode++) {
            if (!visited.contains(destinationNode)) {
                if (adjacencyMatrix[evaluationNode][destinationNode] != 0) {
                    edgeDistance = adjacencyMatrix[evaluationNode][destinationNode];
                    newDistance = distances[evaluationNode] + edgeDistance;
                    if (newDistance < distances[destinationNode]) {
                        distances[destinationNode] = newDistance;
                    }
                    unvisited.add(destinationNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        int adjacency_matrix[][];
       
        int number_of_vertices;
        int source = 0, destination = 0;
        Scanner scan = new Scanner(System.in);
        try {
        	number_of_vertices = 8; // Number of vertices in the graph 
        	//initialize weight for each edge
        	adjacency_matrix = new int[][]{
        		{0,	10,	0,	30,	0,	20,	0,	0},
    			{10,	0,	15,	0,	0,	0,	0,	0},
    			{0,	15,	0,	0,	5,	0,	0,	0},
    			{30,	0,	0,	0,	30,	10,	0,	0},
    			{0,	0,	5,	30,	0,	0,	0,	10},
    			{20,	0,	0,	10,	0,	0,	5,	0},
    			{0,	0,	0,	0,	0,	5,	0,	15},
    			{0,	0,	0,	0,	10,	0,	15,	0}};
        	
    		//input user start and end node
            System.out.println("Enter the source ");
            source = scan.nextInt();
            System.out.println("Enter the destination ");
            destination = scan.nextInt();
            
            //Call constructor 
            Dijkstra dijkstrasAlgorithm = new Dijkstra(number_of_vertices);
            dijkstrasAlgorithm.dijkstra_algorithm(adjacency_matrix, source);
 
            // Print the output
            System.out.println("The Shorted Path from " + source + " to " + destination + " is: ");
            for (int i = 0; i < dijkstrasAlgorithm.distances.length ; i++) {
                if (i == destination)
                    System.out.println(source + " to " + i + " is "
                            + dijkstrasAlgorithm.distances[i]);
            }
        } 
        
        catch (InputMismatchException inputMismatch) {
            System.out.println("Wrong Input Format");
        }
        
        scan.close();
    }
}

//edited by nfaz