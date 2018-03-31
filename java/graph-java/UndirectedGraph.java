import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class UndirectedGraph{
	
	private Map<Integer, List<Integer>> points = new HashMap<Integer, List<Integer>>();
	private Integer graphSize;

	UndirectedGraph()
	{
		graphSize = 0;
	}

	public void insertPair(Integer key, Integer value)
	{
		if(points.containsKey(key))
		{
			List<Integer> temp = new ArrayList<Integer>(points.get(key));
			temp.add(value);
			points.put(key, temp);
		}
		else
		{
			points.put(key, Arrays.asList(value));
			increseSize();
		}

		if(points.containsKey(value))
		{
			List<Integer> temp = new ArrayList<Integer>(points.get(value));
			temp.add(key);
			points.put(value, temp);
		}
		else
		{
			points.put(value, Arrays.asList(key));
			increseSize();
		}
	}

	public List getValues(Integer key)
	{
		if(points.containsKey(key))
		{
			return points.get(key);
		}
		else
		{
			return null;
		}
	}

	private void increseSize()
	{
		graphSize += 1;
	}

	public Integer size()
	{
		return graphSize;
	}

	public void printConnections()
	{
		for(Integer key : points.keySet())
		{
			System.out.println(key + "\t-> " + points.get(key));
		}
	}
}
