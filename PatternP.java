class PatternP

     {

       public static void main(String[]args)

         { int k=0;
  
            for(int i=1; i<=3; i++)

              {

                  for(int j=1; j<=3; j++){

                    if(i==j)
                      System.out.print(++k*k+" ");

                    else 
                      System.out.print(++k+ " ");
                       }
                       
                      System.out.println();

              }

         }

    }