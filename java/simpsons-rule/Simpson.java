abstract class Simpson
{
	private Integer n;
	private Integer a;
	private Integer b;
	private Double h;

	Simpson(Integer n, Integer a, Integer b)
	{
		if(n % 2 != 0)
		{
			throw new IllegalArgumentException("n must be divisible by 2.");
		}
		this.n = n;
		this.a = a;
		this.b = b;
		this.h = (b-a)/(2.0*n);
	}

	public void setLowerIntegralBound(Integer a)
	{
		this.a = a;
		this.h = (b-this.a)/(2.0*n);
	}

	public void setUpperIntegralBound(Integer b)
	{
		this.b = b;
		this.h = (this.b-a)/(2.0*n);
	}

	public void setAmountOfCompartments(Integer n)
	{
		if(n % 2 != 0)
		{
			throw new IllegalArgumentException("n bust be divisible by 2.");
		}
		this.n = n;
		this.h = (b-a)/(2.0*this.n);
	}

	abstract Double function(Double x);

	public double calculate()
	{
		Double result = 0.0;

		for(int i = 1; i<=n;i++)
		{
			result += 4*function(a +(2*i-1)*h);
			result += 2*function(a +(2*i-2)*h);
		}

		result = (h/3.0)*(function(a*1.0) + result + function(a+2*n*h));
	//	System.out.println(result);
		return result;
	}
}
