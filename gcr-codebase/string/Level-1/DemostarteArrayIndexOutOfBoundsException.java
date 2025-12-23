import java.util.*;

class DemostarteArrayIndexOutOfBoundsException
{
     public void generateException(String[] names)
    {
          System.out.println(names[10]);
    }

    public void demonstrateException(String[] names)
    {
        try {
            System.out.println(names[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is : " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException : " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine();


        String[] names = new String[size];

        // Take user input
        System.out.println("Enter names:");
        for(int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        DemostarteArrayIndexOutOfBoundsException obj = new DemostarteArrayIndexOutOfBoundsException();

        try {
            obj.generateException(names);
        }
        catch (ArrayIndexOutOfBoundsException e) {
             obj.demonstrateException(names);
            System.out.println("ArrayIndexOutOfBoundsException is : " + e.getMessage());
        }

        sc.close();
    }
}
