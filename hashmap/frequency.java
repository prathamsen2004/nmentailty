import java.util.*;
public class frequency{
    public static void main(String args[]){
        int arr[]={1,2,4,32,1,1,2,4,2,1,23,4,5,4,3,2,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num,count+1);
            }
            else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }

}
