package sample;

public class Generics<T> {
	
	T x;
	T y;
	T z;
	Generics(T x, T y, T z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	 @SuppressWarnings("unchecked")
	public <t extends Comparable<T>> T max() {
	      T max = x; 
	      
	      if(((Comparable<T>) y).compareTo(max) > 0) {
	         max = y; 
	      }
	      
	      if(((Comparable<T>) z).compareTo(max) > 0) {
	         max = z;                
	      }
	      return max; 
	   }
	   
	   public static void main(String args[]) {
		   Generics<Integer> intvar = new Generics<Integer>(12,20,30);
		   System.out.println("\nMaximum of given integer values are: "+intvar.max());
		   
		   Generics<Double> floatvar = new Generics<Double>(20.6,35.3,97.5);
		   System.out.println("\nMaximum of given float values are: "+floatvar.max());
		   
		   Generics<String> strvar = new Generics<String>("Apple","Peach","Banana");
		   System.out.println("\nMaximum of given string values are: "+strvar.max());  
	   }

}
