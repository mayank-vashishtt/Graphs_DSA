import java.util.ArrayList;
import java.util.HashMap;

class graph1{


// edge to list and vice versa 

// dirrted graph and undirected graph 
// leaf node for the graph -- number of in edge is  0 

    // bfs on ewg 
    // multi source bfs  -- here sourcce will not be a point 
    // cycle -- cyclic graph and acyclic graph 
    // longest cyclic chain length in the graph or smallest ; condn -- outward edge for vertex on the max 1
    // shortest path in a grid with obstacle elimination 
    

    public int pathInDirectedGraph(int A, int[][] B){

// formation of adjency list 
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

        for(int i = 0; i <B.length ; i++){
            if(!map.containsKey(B[i][0])){
                map.put(B[i][0], new ArrayList<Integer>());
            }
            map.get(B[i][0]).add(B[i][1]);
        }

// we made a visted array 
        ArrayList<Integer> VisitedArray = new ArrayList<Integer>();
        for(int i = 0; i <= A; i++){
            VisitedArray.add(-1);
        }



    }





    public static void main(String[] args) {
        
    }





    
}