
public class Assignment_2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short i,j,k;
		boolean flag=false;
     for(i=1;i<=5;i++)
     {
    	 for(j=1;j<=i;j++)
    	 {
    		 if(j==5)
    			 flag=true;
    		 System.out.print(j);
    	 }
    	 System.out.println("\n");
     }
     i--;
     while(flag==true)
     {
    	 i--;
    	 for(k=1;k<=i;k++)
    		 System.out.print(k);
     
     System.out.println("\n");
	
if(i==1)
	flag=false;
}
	}
}
