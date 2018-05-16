package com.ver;

public class Item implements Cloneable {
	private int id;
	private String name;
	private int quantity;
	Branch branch = null;
	public Item(int id, String name, int quantity, Branch branch) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.branch = branch;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name is  " + name + " id is    " + id +" quantity is " +  quantity + " Branch is " + branch;
		
	}
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
*/	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Item items = (Item) super.clone();
		items.branch = (Branch)branch.clone();
		return items;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Item item = (Item)obj;
		if(item != null ) {
			if(this.id == item.id && this.name == item.name && this.quantity == item.quantity);
			return true;
		}
		return false;
	}
}
