import java.util.Arrays;

public class Main {
   public static void main(String[] args){
     String numbers="0123456789";
     final int number= numbers.length()/2;
     String[] parts={
             numbers.substring(0,number),
             numbers.substring(number),
     };
       System.out.println(Arrays.toString(parts));



    }
}