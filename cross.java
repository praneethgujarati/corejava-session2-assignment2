class cross
{
   public static void main(String args[])
   {
     int n;//Declaring variable n of int type
     System.out.println("Enter the no.of rows to display *:");//This prompts the user to enter the no.of rows for which the pattern should be displayed.
     n=Integer.parseInt(System.console().readLine());
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(i==j || i+j==n-1)
            {
               System.out.print("*");//This is to print * in respective positions
            }
            else
               System.out.print("_");//This is to print blank spaces in respective positions
        }
          System.out.println("");//This is to print blank spaces in new line to get the desired pattern


       }
       
   }
}