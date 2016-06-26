/**
 * 
 */
package test1;

/**
 * @author yutao
 *
 */
public class Helloa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
        for(i=0;i<3;i++)
        {
//        	System.out.print("  ");
        	for(int k=2;k>i;k--)
    		{
    			System.out.print(" ");
    		}
        	for(int j=0;j<2*i+1;j++)
        	{   
        		
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
