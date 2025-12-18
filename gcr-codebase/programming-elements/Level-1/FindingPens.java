import java.util.Scanner;

class FindingPens{

  public static void main(String[] args)
 {

//Calcuting remaining and non-distributed pens
  totalPens = 14;
  totalStudents = 3;
 penPerStudent = totalPens/totalStudents;
 remainingPen = totalPens%totalStudents;

  //Printing result
  System.out.println("The Pen Per Student is : " + penPerStudent + " and the remaining pen not distributed is : " + remainingPen);
 }

}