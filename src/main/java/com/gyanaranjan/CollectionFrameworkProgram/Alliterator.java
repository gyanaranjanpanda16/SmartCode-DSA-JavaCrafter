package com.gyanaranjan.CollectionFrameworkProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Alliterator {
    public static void main(String[] args) {
      List objects = new ArrayList<>();
      objects.add("b");
      objects.add("d");
      objects.add("e");
      objects.add("w");
//      Iterator ite = objects.iterator();
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }
//        for(Object l :objects){
//            System.out.println(l);
//        }
//        System.out.println(objects);
//        iterator works only one direction .
//        list-iterator works on bidirectional.
        ArrayList list1 = new ArrayList();
        ListIterator list = objects.listIterator(objects.size());
        while(list.hasPrevious()){
          list1.add(list.previous());
        }
        for(Object obj : list1){
            System.out.print(obj);
        }
        }

    }

