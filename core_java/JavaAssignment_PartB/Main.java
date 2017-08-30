package javaAssignment_PartB;

import java.io.*;

class Main {

     public static void main(String[] args) throws IOException {
       //initialize first position
       int position_x = 0;
       int position_y = 0;
       
       System.out.println("Where do you want Optimus Prime to move? Enter 'U', 'R', 'D', 'L' for 'Up', 'Right', 'Down', 'Left'");
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = br.readLine();
       
       for (int i=0; i<input.length(); i++){
         char c = input.charAt(i);
         
        //if input is more than 10 letters, print this error message
        if (input.length() > 10){
           System.out.println("I won't be able to make it that far");
           break;
         }
         
         //according to which direction, add or subtract to either x-axis or y-axis
         else if(c == 'U' || c == 'u' ){
           position_y= position_y + 1;
         }
         
         else if (c == 'R' || c == 'r'){
           position_x= position_x + 1;
         }
         
         else if (c == 'D' || c == 'd'){
           position_y= position_y - 1;
         }
         
         else if (c == 'L' || c == 'l'){
           position_x= position_x - 1;
         }
         //if input is not any of the above letters, print this error message
         else {
         System.out.println("You've entered an invalid direction");
         break;
       }
       }
      
       System.out.println("The final position is: " + position_x + " " + position_y);
    }
}




