// Creating a class named FindYoungestFriends indicating the purpose to find the youngest and tallest friend.
import java.util.Scanner;

class FindYoungestFriends {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking age input of three friends
        System.out.print("Enter Amar age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony age: ");
        int anthonyAge = input.nextInt();

        // Taking height input of three friends
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();
      
        // Finding the youngest friend based on age
        if (amarAge <= akbarAge && amarAge <= anthonyAge) 
            System.out.print("Amar is the youngest friend");
        else if (akbarAge <= amarAge && akbarAge <= anthonyAge) 
            System.out.print("Akbar is the youngest friend");
        else 
            System.out.print("Anthony is the youngest friend");
        
        
        // Finding the tallest friend based on height
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight)
            System.out.print("Amar is the tallest friend");
        else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) 
            System.out.print("Akbar is the tallest friend");
        else 
            System.out.print("Anthony is the tallest friend");
        
     }
}
