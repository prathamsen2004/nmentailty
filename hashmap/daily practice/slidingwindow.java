// MAXIMUM SUM OF SUBARRAY //

/* 

import java.util.*;
public class slidingwindow{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,4,3,2};
        int k=4;
        int windowsum =0;
        for(int i=0;i<k;i++){
            windowsum = windowsum + arr[i];
        }
      int  maxsum = windowsum;
      for(int i=k;i<arr.length;i++){
        windowsum = windowsum +arr[i] - arr[i-k];
        maxsum = Math.max(maxsum,windowsum);
     
      }
          System.out.print(maxsum + " ");
     
    }
}

*/


// FIRST NEGATIVE ELEMENT IN SUB ARRAY //

/* 
import java.util.*;

 class slidingwindow {
    public static void main(String args []){
        int arr[]={1,2,-2,3,4,-4,5,-8};
        int k=4;
        for(int i=0;i<=arr.length-k;i++){
            boolean found = false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.print(arr[j] + " ");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print("0");
            }
        }
    }

 }


 */


 //  maximum average of subarray //

 /* 
 import java.util.*;
 public class slidingwindow{
    public static void main(String args[]){
        int nums [] ={1,12,-5,-6,50,3};
        int k=4;
        int windowsum = 0;
    
        for(int i = 0;i<k;i++){
            windowsum = windowsum + nums[i];
        }
            int maxsum = windowsum;
            for(int i=k;i<nums.length;i++){
                windowsum = windowsum + nums[i] - nums[i - k];
            maxsum = Math.max(maxsum, windowsum);


            }
            double maxAverage = (double) maxsum / k;

        System.out.println(maxAverage);


        }
       
        


        
    }
 

    */

    import java.util.*;
    public class slidingwindow{
        public static void main(String args []){
            int nums[] = {1,12,-5,-6,50,3};
            int k=4;
            int windowsum =0;
            for(int i=0;i<k;i++){
                windowsum = windowsum + nums[i];

            }
            int maxsum = windowsum;
            for(int i=k;i<nums.length;i++){
                windowsum = windowsum + nums[i] - nums[i-k];
                maxsum = Math.max(maxsum,windowsum);
            }
             
            double avg = (double) maxsum/k;
            System.out.println(avg);
        }
    }