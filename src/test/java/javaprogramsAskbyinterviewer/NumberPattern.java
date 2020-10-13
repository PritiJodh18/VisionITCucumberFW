package javaprogramsAskbyinterviewer;

public class NumberPattern {
	 public static void main(String args[])
	    {
	        int i, j, n=1;
	        for(i=0; i<5; i++)
	        {
	            for(j=0; j<=i; j++)
	            {
	                System.out.print(n+ " ");
	                n++;
	            }
	            System.out.println();
	        }
	    }
	/*
	 1
	 2 3
	 4 5 6
	 7 8 9 10
	 11 12 13 14 15
	 */
}
