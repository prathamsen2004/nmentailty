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

    // MAXIMUM AVERAGE SUBARRAY //

    /* 

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

    */

    //  MAXIMUM AVERAGE SUBARRAY //

    /* 

    import java.util.*;
    public class slidingwindow{
        public static void main(String args[]){
            int arr[]= {1,12,-5,-6,50,3};
            int k=4;
            int windowSum = 0;
            for(int i=0;i<k;i++){
                windowSum = windowSum +arr[i];
            }
            int maxSum = windowSum;
            for(int i=k;i<arr.length;i++){
                windowSum = windowSum +arr[i] - arr[i-k];
                maxSum = Math.max(windowSum,maxSum);
            }
            double avg = (double) maxSum/k;
            System.out.println(avg);
        }
    }

    */

    // MINIMUM SUM OF SUBARRAY //

    /*

    import java.util.*;
    public class slidingwindow{
        public static void main (String args []){
            int arr []={4,2,1,7,8,1,2,8,1};
            int k = 3;
            int windowSum =0;
            for(int i=0;i<k;i++){
                windowSum = windowSum + arr[i];

            }
            int minSum = windowSum;
            for(int i=k;i<arr.length;i++){
                windowSum = windowSum + arr[i] - arr[i-k];
                minSum = Math.min(windowSum,minSum);
            }
            System.out.println(minSum);

     }
    }

    */

    // 🧩 Smallest Subarray with Sum ≥ K //

/* 

 import java.util.*;

public class slidingwindow {
    public static void main(String[] args) {

        int arr[] = {2, 3, 1, 2, 4, 3};
        int k = 7;

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            // Expand the window
            sum += arr[right];

            // Shrink the window while condition is satisfied
            while (sum >= k) {

                // Update minimum length
                minLength = Math.min(minLength, right - left + 1);

                // Remove left element
                sum -= arr[left];

                // Move left pointer
                left++;
            }
        }

        // If no valid subarray found
        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}

*/ 

import java.util.*;
public class slidingwindow{
    public static void main(String args []){
        int arr[]={2, 3, 1, 2, 4, 3};
        int k=4;
        int sum = 0;
        int left =0;
        int minLength = Integer.MAX_VALUE;
        
        for(int right=0;right<arr.length;right++){
            sum = sum + arr[right];
            while(sum >=k){
               minLength = Math.min(minLength,right-left+1);
                sum = sum - arr[left];

            }


        }
        if(minLength == Integer.MAX_VALUE){
            System.out.println(0);
        }else{
            System.out.println(minLength);
        }
    }
}