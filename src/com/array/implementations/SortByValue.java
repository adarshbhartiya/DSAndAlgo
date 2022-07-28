package com.array.implementations;
import java.util.*;
import java.util.stream.Collectors;

public class SortByValue {

    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",3);
        map.put("B",3);
        map.put("C",5);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        Map<String,Integer> newMap = new LinkedHashMap<>();
        list.forEach(x->newMap.put(x.getKey(),x.getValue()));

        newMap.forEach((k,v)-> System.out.println("Key:"+k+" "+"Value:"+v));




    }
}
