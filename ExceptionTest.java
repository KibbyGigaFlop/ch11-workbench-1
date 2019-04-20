public class ExceptionTest{   

   /**
   This program will output B and D since the variable it's trying to parse
   is not an integer and rather, a string, so it will throw the catch the
   number format exception and handling it with the custom error code
   "B" and a sentence specifying the exception.
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
      
      }
      
      System.out.println("D");
   
   }
   
}