package Java;

public class Point2D {
	
	int P1;
	int P2;
	
	public Point2D(int x, int y) {
		
		P1=x;
		P2=y;
		System.out.println("P1 is "+ x + " P2 is " + y);
	}
	public String getDetails()
	{
	   return x & y;
	}

	
	/*
	 * public boolean isEqual () {
	 * 
	 * if(P1==P2) { return true; } else false; }
	 * 
	 */
}
