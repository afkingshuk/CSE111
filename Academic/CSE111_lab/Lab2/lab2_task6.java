import java.util.*;

public class lab2_task6
{
  public static void main(String[] args)
  {
     Scanner scanf = new Scanner(System.in);
     int[] array = new int[5];
     int arraySize = array.length;
     int[] flag= new int[10];
     
     for(int i=0; i<arraySize; i++)
     {
       array[i] = scanf.nextInt();
       switch(array[i])
       {
         case 0: flag[0]++;
         break;
         case 1: flag[1]++;
         break;
         case 2: flag[2]++;
         break;
         case 3: flag[3]++;
         break;
         case 4: flag[4]++;
         break;
         case 5: flag[5]++;
         break;
         case 6: flag[6]++;
         break;
         case 7: flag[7]++;
         break;
         case 8: flag[8]++;
         break;
         case 9: flag[9]++;
         break;         
       }
     }
     
     for(int i=0; i<=9; i++)
     {
     System.out.printf("%d is %d \n",i, flag[i]);        
     }
  }
}