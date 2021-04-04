package arrayList;

import java.util.ArrayList;

public class IntroArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here in this program we are creating the arrayList.
		ArrayList<Integer>al=new ArrayList<>();
		// Creating the arrayList and then printing it.
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(10);
		al.add(1, 3);
		al.add(20);
		al.add(20);
		al.add(20);
		al.add(10);
		al.add(1, 3);
		System.out.println(al);
//		// Now adding one List into another
//		ArrayList<Integer>sl=new ArrayList<>();
//		sl.add(100);
//		sl.add(200);
//		al.addAll(sl);
//		System.out.println(al);
//		ArrayList<String>s=new ArrayList<>();
//		s.add("Hello");
//		s.add("World");
//		al.addAll(s);
		
		
//		-----------------------------------------------------
		 // Now Using get and set in the List Interfaces
//		System.out.println(al.get(0));
		// get is used for the getting the Element at an index
		 
		
		//Using set in the List
//		al.set(0, 56);
//		System.out.println(al);
		
		// Using remove in the List Interface
//		al.remove(0);
//		System.out.println(al);

//		Using removeall in the List Interface
//		al.removeAll(al);
//		System.out.println(al);
		
//		Using size() for finding the size of the List Interface
//		System.out.println(al.size());
		
		// Checking for the element using contains
//		if(al.contains(120))
//		{
//			System.out.println("It have this Element");
//		}
//		else {
//			System.out.println("It does not have this Element");
//		}
		
		// Checking the List Interface is empty or not
//		System.out.println(al.isEmpty());
		
		System.out.println(al.lastIndexOf(20));
		System.out.println(al.indexOf(10));
	}

}
