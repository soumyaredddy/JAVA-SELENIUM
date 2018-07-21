package Selenium_Web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Collections {

	public static   void main(String[] args) {
		// TODO Auto-generated method stub
        List a = new ArrayList();
        a.add("apple");
        a.add("pen");
        a.remove("pen");
        
        System.out.println(a.add(0));
        
        System.out.println(a.get(0));
     Set b = new HashSet();
     b.add(10);
     b.add(20);
     System.out.println(b.size());
//     System.out.println(b.get(1));
     Hashtable h = new Hashtable();
     h.put("name", "soumya");
     h.put("Zender", "Female");
     System.out.println(h.get(0));
//     
     
        	
	}

}
