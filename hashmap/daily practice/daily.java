 import java.util.*;

  /*
public class daily{
    public static void possum(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                sum = sum + arr[i];

            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int arr[]={5, -2, 8, -1, 10, -7, 3};
        int sum =0;
        possum(arr,sum);

    }

}

*/

/* 

import java.util.*;
public class daily{   
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
            
        } 
    
        
    }
}


*/


public class daily{
    public static void main(String args []){
        String str = "PrOgramming";
        str = str.toLowerCase();
        int count =0;
        for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u'){
            count = count + 1;

        }
        }
        System.out.println(count);
    }
}


