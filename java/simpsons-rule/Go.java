class Go extends Simpson
{
	Go(int n, Integer a, int b)
	{
		super(n,a,b);
	}

	@Override
	Double function(Double x)
	{
		return Math.pow(x,Math.PI)*Math.exp(-x);
	}

	public static void main(String[] args)
	{
		Go c = new Go(2000,0,200);
		Go d = new Go(9000,0,200);
		System.out.println(c.calculate() + "\n" + d.calculate());
		
	}
}
