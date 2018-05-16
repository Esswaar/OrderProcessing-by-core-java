package com.ver;

public class TestArgs {
/*public static void process(int[] i) {
	for(int j : i) {
		System.out.println(j);
		
	}
}*/
	/*public static void process(String[] i) {
		for(String j : i) {
			System.out.println(j);
			
		}
	}*/
	/*public static void process(Object[] obj) {
		for(Object j : obj) {
			System.out.println(j);
			
		}
	}*/
	public static void process(int... i) {
		for(int j : i) {
			System.out.println(j);
			
		}
	}
	public static void process(String... i) {
		for(String j:i) {
			System.out.println(j);
		}
	}
	public static void process(Item... items) {
		for(Item item:items) {
			System.out.println(item.toString());
		}
	}
public static void main(String[] args) {
//	process(new int[] {0});
//	process(new String[] {"eswar","reddy"});
	process(1,2,3,4);
	process("eswar","reddy","vennapusa");
	//process(null,new Item(101,"eswar",100),new Item(201, "reddy", 200));
}
}
