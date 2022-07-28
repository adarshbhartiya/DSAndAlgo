package com.tree;
import java.security.cert.Certificate;
import java.util.*;

public class VerticalTree {



    public void verticalOrder(Node root,int hd,TreeMap<Integer,Vector<Node>> map)
    {
        if(root == null)
            return;
        if(!map.containsKey(hd))
        {
          Vector<Node> list = new Vector<>();
          list.add(root);
          map.put(hd,list);
        }
        else
        {
           map.get(hd).add(root);
        }
        verticalOrder(root.getLeft(),hd-1,map);
        verticalOrder(root.getRight(),hd+1,map);
    }

    public void printVerticalTree(Node root)
    {
       TreeMap<Integer,Vector<Node>> map = new TreeMap<>();
       int hd = 0;

       verticalOrder(root,hd,map);
       map.forEach((k,v) -> {
            v.stream().forEach(val -> System.out.print(val.getData()+ " "));
            System.out.println();
       });
    }
}
