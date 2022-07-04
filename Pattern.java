class Pattern

   {
   public static void main(String args[])

   {

    //intilization
     int i,j; //i works for row and j for coloum

      i=1; //initilization1

         do //condition

        { //1st while loop open
          j=1; // initilization2

          do 
           { // 2nd while loop open

             System.out.printf(" " +j*i+ " ");
              j++; //updation for j

            } while(j<=5); //2nd while loop close

               System.out.println(" ");
     
               i++; 

            }while(i<=10);

}
}

     

 
 
  