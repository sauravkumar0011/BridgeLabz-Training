/*
 School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/


import java.util.*;

public class AttendenceSystem{
	
	public static int checkStudentPresence(boolean[] arr, Scanner sc){
		int present = 0;
		
		for(int i=0;i<10;i++)
		{
			System.out.print("\nEnter Attendence of " + (i+1) + " Student : " + "Present or Absent? --> ");
			String attendence = sc.nextLine();
			if(attendence.equals("Present"))
			arr[i] = true;
		    else
		    arr[i] = false;
		}
		
		for(int i=0;i<10;i++)
		{
			if(arr[i] == true)
				present++;
		}
		
		return present;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[10];
		
		int present = checkStudentPresence(arr, sc);
		
		System.out.println("\t---------------------------------------------");
		System.out.println("\tTotal number of present student is :\t" + present);
		System.out.println("\tTotal number of absent student is  :\t" + (10-present));
		System.out.println("\t---------------------------------------------");
	}
}