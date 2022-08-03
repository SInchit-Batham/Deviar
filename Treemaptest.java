mport java.util.*;  
public class TreemapTest {  
   public static void main(String args[]) {  
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(10,"Sinchit");    
      map.put(12,"Ajay");    
      map.put(10,"Pawan");    
      map.put(6,"Rohit");    
      System.out.println("Enteries in the treeMap Before Calling the  remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      map.remove(12);      
      System.out.println("After Calling remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      }  
}  