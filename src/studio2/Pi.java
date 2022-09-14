package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10000000;
		int countIn = 0;
		for (int i=1; i<=count; i++)
		{
			double x=Math.random()*2-1;
			double y= Math.random()*2-1;
			if (x*x+y*y<=1) {
				countIn++;
				
			}
			
		}
		System.out.println((double)countIn/count*4);
	}

}
