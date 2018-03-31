class Go{
	public static void main(String[] args)
	{
		UndirectedGraph ug1 = new UndirectedGraph();
	//	UndirectedGraph ug2 = new UnderectedGraph();
		DirectedGraph dg1 = new DirectedGraph();
		DirectedGraph dg2 = new DirectedGraph();

		System.out.println("[!] Making undirected graph with connected edges:");
		System.out.println("\t (1,2) (1,2) (1,3) (1,4) (2,1) (4,2) (3,8) (8,10)");

		ug1.insertPair(1,2);
		ug1.insertPair(1,3);
		ug1.insertPair(1,4);
		ug1.insertPair(4,2);
		ug1.insertPair(8,10);
		ug1.insertPair(2,1);
		ug1.insertPair(1,2);
		ug1.insertPair(3,8);

		System.out.println("Viewe of structure:");
		ug1.printConnections();
		System.out.println("Graph's verices ammount: " + ug1.size()+"\n");

		System.out.println("[!] Making directed graph with connected edges:");
		System.out.println("\t (1,2) (1,2) (1,3) (1,4) (2,1) (4,2) (3,8) (8,10)");

		dg1.insertPair(1,2);
		dg1.insertPair(1,3);
		dg1.insertPair(1,4);
		dg1.insertPair(4,2);
		dg1.insertPair(8,10);
		dg1.insertPair(2,1);
		dg1.insertPair(1,2);
		dg1.insertPair(3,8);

		System.out.println("Viewe of structure:");
		dg1.printConnections();
		System.out.println("Graph's verices ammount: " + dg1.size()+"\n");
	}
}
