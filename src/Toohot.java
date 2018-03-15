
public class Toohot {

	public static void main(String[] args) {
	
	System.out.println(toohot(75,false));
	System.out.println(toohot(55,false));
	System.out.println(toohot(95,true));	
	System.out.println(toohot(97,false));	
}
	public static boolean toohot(int temperature, boolean IsSummer) {
		
		
		if (temperature >= 60 && temperature <= 90 && IsSummer == false){
			return true;
			}
		else if (temperature >= 60 && temperature <= 100 && IsSummer == true) {
			return true;
		}
		return false;
	}
	
}