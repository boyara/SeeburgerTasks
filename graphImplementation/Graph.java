package graphImplementation;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<T> {

	private HashMap<T, ArrayList<Edge<T>>> connectionsList;

	private ArrayList<T> vertexList;

	public Graph() {
		
		connectionsList = new HashMap<T, ArrayList<Edge<T>>>();
		vertexList = new ArrayList<T>();
	}

	public void addVertex(T vertex, ArrayList<Edge<T>> connectedVertices) {

		connectionsList.put(vertex, connectedVertices);
		vertexList.add(vertex);
		
		for(Edge<T> vertexConnectedToAddedVertex : connectedVertices ) {
			ArrayList<Edge<T>> correspondingConnectedList = connectionsList.get(vertexConnectedToAddedVertex.getEndVertex())
		}
		
	}

}
