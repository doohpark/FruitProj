package com.example.lab2_2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      List<Fruit> al = new ArrayList<Fruit>();
      System.out.println("Student List (orderd by name)");
      Fruit s1 = new Fruit(100,"Kiwi",2300);
      al.add(s1);
      Fruit s2 = new Fruit(101,"Apple",600);
      al.add(s2);
      Fruit s3 = new Fruit(102,"Banana",800);
      al.add(s3);
      Fruit s4 = new Fruit(103,"Peach",1200);
      al.add(s4);
      Fruit s5 = new Fruit(104,"Melon",15000);
      al.add(s5);
      Fruit s6 = new Fruit(105,"Watermelon",12000);
      al.add(s6);
      Fruit s7 = new Fruit(106,"Strawberry",6000);
      al.add(s7);
      Fruit s8 = new Fruit(107,"Mango",8000);
      al.add(s8);
      Fruit s9 = new Fruit(108,"Dragonfruit",9000);
      al.add(s9);
      Fruit s10 = new Fruit(109,"Blueberry",6700);
      al.add(s10);
      
      Collections.sort(al);
      for(Fruit s : al) {
         System.out.println(s.toString());
      }
      System.out.println("Student List (reverse ordered by name)");
 		
 		Collections.sort(al, Collections.reverseOrder());
 		for(int i=0; i<al.size(); i++) {
 			System.out.println(al.get(i).toString());
 		}
}
}

}
