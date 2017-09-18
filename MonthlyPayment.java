
public class MonthlyPayment
{
	public static void main (String[] args) 
	{
		double  p = Double.parseDouble(args[0]);
		double  y = Double.parseDouble(args[1]);
		double  r = Double.parseDouble(args[2]);
		monthlyPayment(p,y,r);
	}
	static void monthlyPayment(double p,double y,double r)
	{
		double  n = 12*y;
		double  rate = r/(12*100);
		double  payment = (p*rate)/(1-Math.pow(1+rate,-n));
		System.out.println(payment);
	}	     
}