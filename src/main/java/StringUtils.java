import java.util.Scanner;

public class StringUtils {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a string");
       String userinput = scanner.nextLine();

       boolean isNumber = org.apache.commons.lang3.StringUtils.isNumeric(userinput);

       if(isNumber) {
           System.out.println(userinput + " is a number");

       }
       else {
           System.out.println(userinput + " is not a number");
       }

       String flip = org.apache.commons.lang3.StringUtils.swapCase(userinput);

       System.out.println("Flipped it is : " + flip);

       String reverse = org.apache.commons.lang3.StringUtils.reverse(userinput);

       System.out.println("Reverse that: " + reverse);


    }


}
