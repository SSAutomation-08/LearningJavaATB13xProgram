package Task_11Jul25;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        benchmarkAdd("arrayList", arrayList);
        benchmarkAdd("linkedList", linkedList);

    }

    public static void benchmarkAdd (String name, List<Integer> list ){
        int size = 100000;
        long start = System.currentTimeMillis();
        System.out.println("Start : "+start);
        for (int i = 0; i<size; i++){
//            System.out.println("Inside loop");
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("End : "+end);
        long elapsedTime = (end - start);
        System.out.println(name + " Elapsed time : " + elapsedTime);
    }
}



