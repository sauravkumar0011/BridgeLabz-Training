import java.util.Scanner;

class ReturnLength
{
    //Method to find string length 
    public static int findLength(String text)
    {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("DemostarteStringIndexOutOfBoundsException is : " + e.getMessage());
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Take input using next()
        System.out.print("Enter a string: ");
        String str = sc.next();

        int l1 = findLength(str);
        int l2 = str.length();

        //Display results
        System.out.println("Length : " + l1);
        System.out.println("Length : " + l2);

        sc.close();
    }
}
