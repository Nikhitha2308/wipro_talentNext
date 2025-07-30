
// write a simple palindrome program in Java
// Program to check if a number is a palindrome
import java.util.Scanner;   
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        // Check if the number is a palindrome
        int originalNum = num;
        int reversedNum = 0;
        int i=0;
        int digit;
        int even_count = 0;
        int odd_count = 0;
        // int [] arr = new int[10];
        // int[] arr1 = new int[10];
        while (num > 0 ) {
            digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit
            // if (i == 2) {
            //     System.out.println("digit:"+ digit);
            // }
            // i++;
            if (digit%2 == 0) {
                even_count++;
                System.out.println("even digits are:"+ digit);
                
            } else {
                odd_count++;
                System.out.println("odd digits are:"+ digit);
                
            }
        }   
        //Print even and odd digits also
        
        System.out.println("even digit: " + even_count);
        System.out.println("odd digit: " + odd_count);
        // if (originalNum == reversedNum) {
        //     System.out.println(originalNum + " is a palindrome.");
        // } else {
        //     System.out.println(originalNum + " is not a palindrome.");
        // }
        // int sum= reversedNum + originalNum;
        // System.out.println("sum: " + sum);
        // Convert the reversed number to a string for comparison
        // Convert the original number to a string for comparison using inbuilt revese method
        // print second char using charAt method
        // String originalStr = String.valueOf(originalNum);
        // String reversedStr = new StringBuilder(originalStr).reverse().toString();
        // System.out.println("digit: " + originalStr.charAt(1));
        // if (originalStr.equals(reversedStr)) {
        //     System.out.println(originalNum + " is a palindrome.");
        // } else {
        //     System.out.println(originalNum + " is not a palindrome.");
        // }
        
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
public class TestAssertions {
   @Test
   public void testAssertions() {
      //test data
      String str1 = new String ("abc");
      String str2 = new String ("abc");
      String str3 = null;
      String str4 = "abc";
      String str5 = "abc";
		
      int val1 = 5;
      int val2 = 6;
      String[] expectedArray = {"one", "two", "three"};
      String[] resultArray =  {"one", "two", "three"};
      //Check that two objects are equal
      assertEquals(str1, str2);
      //Check that a condition is true
      assertTrue (val1 < val2);
      //Check that a condition is false
      assertFalse(val1 > val2);
      //Check that an object isn't null
      assertNotNull(str1);
      //Check that an object is null
      assertNull(str3);
      //Check if two object references point to the same object
      assertSame(str4,str5);
      //Check if two object references not point to the same object
      assertNotSame(str1,str3);
      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }
}