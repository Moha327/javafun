
public class Basic{
public static void main(String[] args){ 
    
        for (int i = 1; i <= 255; i++) {
          System.out.println(i);
        }  
        for (int i = 1; i <= 255; i+=2) {
            System.out.println(i);
          } 
          var sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum = sum + i;
            System.out.println(sum);
          } 
        int[] myArray;
        myArray = new int[6];    // Initialization
        myArray[0] = 1;
        myArray[1] = 3;
        myArray[2] = 5;
        myArray[3] = 7;
        myArray[4] = 9;
        myArray[5] = 13;
        for (int i = 0; i < myArray.length; i++) {
           
            System.out.println(myArray[i]);
          }
        int[] myArray2;
        
        myArray2 = new int[3];    // Initialization
        myArray2[0] = -3;
        myArray2[1] = -5;
        myArray2[2] = -7;
        int Max = myArray[0];
        
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] > Max){
                Max = myArray2[i];
               
            }
            System.out.println(Max);  
          }
      }
    }
   