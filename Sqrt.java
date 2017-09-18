
public class Sqrt 
{
	public static void main (String[] args) 
	{
		double c =Double.parseDouble(args[0]); 
		double t = c;
		double epsilon = 1e-15;
		sqrt(c,t,epsilon);
	}
	static void sqrt(double c, double t, double e)
	{
		while(Math.abs(t-c/t)>e*t)
		{
			t=(c/t+t)/2;
		}
		System.out.println(t);
	}    
}