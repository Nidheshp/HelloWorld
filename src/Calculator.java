
public class Calculator {

	public static void main(String[] args)
	{
		int a=4, b=2, c=8, d;
		if(b>=a && b>=c)
		{
			d=a;
			a=b;
			b=d;
		}
		else
			if(c>=a && c>=b)
			{
				d=a;
				a=c;
				c=d;
			}
		if(b*c==a)
		{
			System.out.println(b+"*"+c+"="+a);
			System.out.println(a+"/"+b+"="+c);
			System.out.println(a+"/"+c+"="+b);
		}
		if(b+c==a)
		{
			System.out.println(b+"+"+c+"="+a);
			System.out.println(a+"-"+b+"="+c);
			System.out.println(a+"-"+c+"="+b);
			
		}
		if(b/c==a)
		{
			System.out.println(b+"/"+c+"="+a);
			System.out.println(a+"*"+b+"="+c);
			System.out.println(c+"/"+a+"="+b);
	}
	}
}
