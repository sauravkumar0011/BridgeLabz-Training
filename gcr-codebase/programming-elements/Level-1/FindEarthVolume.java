import java.util.Scanner;

class FindEarthVolume{

  public static void main(String[] args)
 {

 //Calculating volume of earth
  double earthRadius = 6378;
  double SphereVolumeKm = (4/3) * Math.PI * Math.pow(earthRadius,3);        //In cubic Kilometer
  double SphereVolumeMile = SphereVolumeKm * 0.239913;                                //In cubic miles
  
  //Printing result
  System.out.println("The volume of earth in cubic kilometers is : " + SphereVolumeKm + "  and cubic miles is : " + SphereVolumeMile);
 }

}