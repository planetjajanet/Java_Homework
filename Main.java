package javaAssignment_PartA;

import java.util.*;

class Main {

     public static void main(String[] args) {
          
          try{
          //scan in the number of elements in array
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array: ");
          int arraysize = sc.nextInt();
         // System.out.println(arraysize);
          
          int[] elemArray = new int[arraysize];
          
          //scan in each element
          System.out.println("Enter the elements in the array: ");
          for(int i=0; i<arraysize; i++){
            int elem = sc.nextInt();
            elemArray[i]=elem;
            //System.out.println(elemArray[i]);
          }
          System.out.println("Enter the index of the array element you want to access: ");
          int indexnum = sc.nextInt();
          //System.out.println(indexnum);
          
          System.out.println("The array element at index "+ indexnum + " = " + elemArray[indexnum]);
          System.out.println("The array element successfully accessed");
          
          }
          catch (ArrayIndexOutOfBoundsException ignore){
            System.out.println("IndexOutOfRangeException");
          }
     }

}