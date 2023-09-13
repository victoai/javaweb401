package acorn;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
       
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3); 
         

        // Integer 형 배열로 변환
        Integer[] intArray = arrayList.toArray(new Integer[arrayList.size()]);

        // 변환된 배열 출력
        System.out.println("배열 내용: " + Arrays.toString(intArray));
    }
}
