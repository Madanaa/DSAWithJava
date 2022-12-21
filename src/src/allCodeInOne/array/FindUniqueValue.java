package allCodeInOne.array;

import java.util.HashMap;

public class FindUniqueValue {
    public static void main(String[] args) {
        int array[] = {12,1,1,12,3,3,5};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < args.length;i++) {
            System.out.println(hashMap.put(array[i],i ));
        }
      //  System.out.println(hashMap.keySet());
    }
}
