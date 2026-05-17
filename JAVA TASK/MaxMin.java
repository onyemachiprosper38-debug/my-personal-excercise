public class MaxMin {

    public static int MinMax(int[] array) {

if (array == null || array.length == 0 )return 0;


        

        int max = array[0];
        int min = array[0];
 

for (int count = 1; count < array.length; count++){
  } 
 if (array[count] > max) max = array[count];
    if (array[count] < min) min = array[count];

   
 } 
public static void main(String[] args){
 int[] numbers = {2, 5, 7, 9, 20};

   
        
System.out.println(max - min);

  }

 }

