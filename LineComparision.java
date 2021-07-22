package sample;

public class LineComparision {
	
	 public double Lenoftheline(int x1, int y1, int x2, int y2) {
	    	double lenoftheline = (Math.pow(x2-x1, 2) + Math.pow(y2-y1,  2));
	    	lenoftheline=Math.sqrt(lenoftheline);
	    	return lenoftheline;
	    
	    }

	    public static void main(String args[]) {
	    	LineComparision A = new LineComparision();
	    	double lineFirst = A.Lenoftheline(4,5,4,5);
	    	double lineSecond = A.Lenoftheline(4,3,3,5);
	    	lineFirst = Math.floor(lineFirst);
	    	lineSecond = Math.floor(lineSecond);
	    			
	    	if(lineFirst == lineSecond )
	    		System.out.println(lineFirst + "equal to " + lineFirst);
	    	else
	    		System.out.println(lineFirst + "equal to " + lineFirst);
	    }

}
