package graphImplementation;

public class Edge<T> {

	private T startVertex;
	private T endVertex;
	private int weight;

	public Edge(T startVertex, T endVertex, int weight) {
		this.endVertex = endVertex;
		this.weight = weight;
	}

	public T getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(T startVertex) {
		this.startVertex = startVertex;
	}

	public T getEndVertex() {
		return endVertex;
	}

	public void setEndVertex(T endVertex) {
		this.endVertex = endVertex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
