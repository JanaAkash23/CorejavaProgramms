package Com.junitprogramm;

public class ArrayJunit {
	int arr[] = {22,24,25,30};
	
	public String arrbellow() {
		 for (int a : arr) {
	            if (a < 20) {
	                return "Value less than 20 found" ;
	            }
	}
	return " "	; 
}
}
