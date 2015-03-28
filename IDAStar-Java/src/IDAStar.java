import java.util.LinkedList;

public class IDAStar {
	public static void IDAStar(Node node) {
		double max = node.heuristic;
		while(true) {
			System.out.println("==========Iteracija==========");
			Result result = Search(node, 0, max, 0);
			if (result.type == 1) {
				//System.out.println(node);
				return;
			}
			else if (result.type == 2) {
				double min = (Double) result.result1;
				if (min == Double.MAX_VALUE) {
					System.out.println("Not found");
					return;
				}
			}
			max = (Double) result.result1;
			System.out.println("=============================");
		}
	}
	
	public static Result Search(Node node, double g, double max, int sysout_level) {
		Result result;
		double f = node.heuristic + g;
		
		for (int i=0; i<sysout_level; i++) {
			System.out.print("-");
		}
		System.out.println(node);
		
		if (f>max) {
			result = new Result();
			result.type = 2;
			result.result1 = new Double(f);
			return result;
		}
		
		if (node.heuristic == 0) {
			result = new Result();
			result.type = 1;
			//result.result1 = new Double(f);
			System.out.println("FOUND - use stack to reverse the order :)");
			System.out.println(String.format("Total time: %.0f minutes", g));
			System.out.println("Cities:");
			System.out.println(node);
			return result;
		}
		
		double min = Double.MAX_VALUE;
		for (Edge e : node.adjacencies) {
			Result result1 = Search(e.node, g + e.cost, max, sysout_level+1);
			if (result1.type == 1) {
				System.out.println(node);
				return result1;
			}
			else if (result1.type == 2) {
				double newMin = (Double) result1.result1;
				if (newMin < min) {
					min = newMin;
				}
			}
		}
		
		result = new Result();
		result.type = 2;
		result.result1 = new Double(min);
		return result;
	}
}


//1 - found
//2 - else
class Result
{
	public int type;
	public Object result1;
	public Object result2;
}

class Node{
 public final String description;
 public final double heuristic;
 public LinkedList<Edge> adjacencies;
 public Node parent;

 public Node(String description, double heuristic){
         this.description = description;
         this.heuristic = heuristic;
         adjacencies = new LinkedList<Edge>();
 }
 
 public void addEdge(Node node, double cost) {
 	adjacencies.add(new Edge(node, cost));
 }
 public String toString(){
         return description;
 }
}

class Edge{
 public final double cost;
 public final Node node;

 public Edge(Node node, double costVal){
         this.node = node;
         cost = costVal;
 }
}