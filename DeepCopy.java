package com.ver;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Branch branch = new Branch("mechanical", "electrical", "civil");
		Item item = new Item(101, "eswar", 200, branch);
		Item itemShallowCopy = (Item)item.clone(); 
		//Deep copy will create new reference and store the details
		//It is used to share the same properties of different objects 
		//Deep copy is independent on other objects
		//System.out.println(item.equals(itemShallowCopy)); 
		//Does it show same values or different values
		/*System.out.println(item.toString());
		System.out.println(itemShallowCopy.toString());*/
		//In deep copy, if you try change one object it will not make any changes in other object
		item.branch.branch1 = "elec";
		System.out.println(item.branch.branch1);
		System.out.println(itemShallowCopy.branch.branch1);

	}

}
