package graph;

public interface graph {

	/** Ajoute un vertex au graph */
	public void add_vertex (Vertex vertex){

	}
	/** Renvoie true si ce vertex est dans le graph, false sinon */
	public boolean exist_vertex (Vertex vertex){

	}

	/** Supprime un vertex du graph */
	public void delete_vertex (Vertex vertex){

	}

	/** Ajoute un edge entre 2 vertex */
	public void add_edge (Vertex v1, Vertex v2){

	}

	/** Renvoie true si un edge est dans le graph, false sinon */
	public boolean exist_edge (Edge edge){

	}

	/** Suppime un edge du graph */
	public void delete_edge (Edge edge){

	}

}