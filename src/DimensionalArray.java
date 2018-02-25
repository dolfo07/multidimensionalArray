/**
 *
 * @author Alex Grullon
 * 
 */

/*
  This application will tell you the number of passengers allowed based on the trip cost
    This is a small program that I created to test my Dimensional Array knowledge; it is not fancy at all. 
*/
import java.util.Scanner;
public class DimensionalArray {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        double[][] trip = new double[2][3];//[2]equals two rows & [3] equals 3 columns
        for(int i = 0; i<2; i++){
            System.out.println("Enter The Trip Cost");
            trip[i][0] = in.nextDouble();
            
            //The if..else if statements will determine the number of passenger per flight cost
            double passenger=0;
            if(trip[i][0] < 99){
            passenger = 1;
            }else if(trip[i][0] >100 && trip[i][0] <499){
            passenger = 2;
            }else if(trip[i][0] >=500 && trip[i][0] <999){
            passenger = 4;
            }else if(trip[i][0] >1000 && trip[i][0] <5000){
                passenger = 8;
            }
            
             trip[i][1] = trip[i][0] + passenger;
             System.out.println("The Trip cost is : "+trip[i][0]+
                "\tand the number of passenger allowed is : "+passenger);
             System.out.println("");//I added this line to insert some space between each array output.
       }
    }
    
}
