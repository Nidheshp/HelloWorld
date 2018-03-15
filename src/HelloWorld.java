
public class HelloWorld {

	public static void main(String[] args) {
		
		  System.out.println("Hello World!");
		  System.out.println(method1());
		  System.out.println(Parameters(3,5));
		  int[]arrayOfInts = {10,9,56,25,14,38,27,90,46,73};
		  
		  for(int I = 0; I < 10; I++) {
			  System.out.println(arrayOfInts[I]);
		  }
		  
		  for(int I = 0; I < 10; I++) {
			  arrayOfInts[I]*=10;
			  System.out.println(arrayOfInts[I]);
		  }
	}
	public static String method1() {
		
		return "Hello World!";
		
		}
	public static int Parameters(int var1, int var2) {
		
		return var1+var2;
		
	}
	public static int Conditionals(int var3, int var4) {
		
		if(var3==0) {
			return var4;}
		if(var4==0) {
			return var3;}
		else {
		    return var3+var4;}
		}
				
	}
