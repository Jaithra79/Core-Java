
public class Ternary {

    public static void main(String a[])
    {

      // odd or even num
      
      int n = 5;  // if int = 4 then result will be 10
      int result = 0;

      // if (n%2==0)  
      // result = 10;
      // else
      // result = 20;

      // ?: ternary operator

      result = n%2==0 ? 10: 20;

      System.out.println(result);
    }
    
}
