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

/* 



import java.util.*;
public class slidingwindow{
    public static void main(String args []){
        int arr[]={2, 3, 1, 2, 4, 3};
        int k=4;
        int sum = 0;
        int left =0;
        int minLength = Integer.MIN_VALUE;
        
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

*/

/* 

import java.util.*;
public class slidingwindow{
    public static void main(String args[]){
        int arr[] = {2, 3, 1, 2, 4, 3};
        int k=4;
        int sum = 0;
        int left=0;
        int minlength = Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            sum =sum +arr[right];
            while(sum>=k){
                minlength = Math.min(minlength,right-left+1);
                sum = sum -arr[left];
                
            }
        }
        if(minlength == Integer.MAX_VALUE){
            System.out.println(0);
        }else{
            System.out.println(minlength);
        }
    }
}

*/

/* 


import java.util.*;
public class slidingwindow{
    public static void main(String args[]){
        String s = "abcabcbb";
        int left =0;
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))) {
                  set.remove(s.charAt(left));
                
                 left++;


}           
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);
                  

        }
        System.out.println(maxlength);
    }
}

*/

/* 

import java.util.*;
public class slidingwindow{
    public static void main(String args[]){
        String s = "abcabcbb";
        int left =0;
        int maxlength =0;
        HashSet<Character> set = new HashSet<>();       
         for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);

        }
        System.out.println(maxlength);

    }
 }


 */

 /* 

 import java.util.*;
 public class slidingwindow{
    public static void main (String args []){
        String s = "abcabcbb";
        int left =0;
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right =0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(right));
                left++;

            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);
    }
 }

 */

 /* 

 import java.util.*;
 public class slidingwindow{
    public static void main (String args[]){
        int arr[]={2, 3, 1, 2, 4, 3};
        int target =4;
        int left =0;
        int sum =0;

        int minlength= Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            sum = sum + arr[right];
            while(sum>=target){
                
                minlength = Math.min(minlength,right-left+1);
                sum = sum -arr[left];
                
            }
            


        }
        if(minlength == Integer.MAX_VALUE){
            System.out.println(0);
        }
        else{
            System.out.println(minlength);
        }
        
        }
 }

 */
/* 

 import java.util.*;
 public class slidingwindow{
    public static void main(String args[]){
        int arr[] = {2, 3, 1, 2, 4, 3};
        int left =0;
        int sum =0;
        int target =4;
        int minlength = Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            sum = sum + arr[right];
            while(sum>=target){
               
                minlength = Math.min(minlength,right-left+1);
                 sum = sum - arr[left];

            }

        }
        if(minlength == Integer.MAX_VALUE){
            System.out.println(0);
        }
        else{
            System.out.println(minlength);
        }
    }
 }

 */

 /* 

 import java.util.*;

 public class slidingwindow{

    public static boolean CD(int arr[],int k){
        int distance =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                distance = i - map.get(arr[i]);
                if(distance<=k){
                    return true;
                }

            }
            map.put(arr[i],i);
            
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,1};
        int k=3;
       boolean ans = CD (arr, k);
       System.out.println(ans);

    }
 }


 */

/*

import java.util.*;

public class slidingwindow {

    public static int maxNumberOfBalloons(String text) {

        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }

        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2;
        int o = freq['o' - 'a'] / 2;
        int n = freq['n' - 'a'];

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }

    public static void main(String[] args) {

        String text = "nlaebolko";

        int ans = maxNumberOfBalloons(text);

        System.out.println(ans);
    }
}

*/

/* 


import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                result.add("Fizz");
            } 
            else if (i % 5 == 0) {
                result.add("Buzz");
            } 
            else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}

*/

import java.util.Scanner;
import java.util.Stack;

public class slidingwindow {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets string: ");
        String s = sc.nextLine();

        System.out.println(isValid(s));

        sc.close();
    }
}