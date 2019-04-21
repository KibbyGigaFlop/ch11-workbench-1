public class ExceptionTest{   

   /**
   This program will output B, D, and E since the variable it's trying to parse
   is not an integer and rather, a string, so it will throw the catch the
   number format exception and handling it with the custom error code
   "B" and a sentence specifying the exception. The 'finally' feature will
   execute any other error messages specified in the exception handling process,
   which will print out 'D'. It then proceeds with the code as normal and prints
   "E" at the end as that's the last statement before the program ends.
   */


   public static void main(String[] args) {
   
      int number;
      String str;
      
      try{
         str = "xyz";
         number = Integer.parseInt(str);
         System.out.println("A");
      }catch (NumberFormatException e){
         System.out.println("B" + "\nThis is a NumberFormatException");
      
      }catch (IllegalArgumentException e){
      
         System.out.println("C");
      
      }finally{
      
      System.out.println("D");
      
      }
      
      System.out.println("E");
   
   }
   
}