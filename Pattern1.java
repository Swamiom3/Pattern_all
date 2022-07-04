class Pattern1

{

      public static void main( String args[])
      {

              int i,j ;

          for(i=1; i<=6 ; i++)

             {

                 for(j=1; j<=6; j++)
                      System.out.print("  ");
                 
                 

                 
                  for(j=1; j<=i; j++)
                       System.out.print(j+" ");

                  

                  
                 
               System.out.println();             

              }    




      }
}

/* output
\CLASS\1-07-22>java Pattern1
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4 5 6   */

 