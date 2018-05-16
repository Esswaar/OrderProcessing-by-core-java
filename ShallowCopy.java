package com.ver;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Branch branch = new Branch("mechanical", "electrical", "civil");
		Item item = new Item(101, "eswar", 200, branch);
		Item itemShallowCopy = (Item)item.clone(); 
		//Shallow copy will reference the existing object in the memory
		//It is used to share the same properties of different objects
		//Instead of creating new objects, it will used to store into 
		System.out.println(item.equals(itemShallowCopy));
		//print methods 
		//Does it show same values or different values
		/*System.out.println(item.toString());
		System.out.println(itemShallowCopy.toString());*/
		//In shallow copy, if you try change one object it will make changes in other object
		item.branch.branch1 = "elec";
		System.out.println(item.branch.branch1);
		System.out.println(itemShallowCopy.branch.branch1);
		
	}

}
