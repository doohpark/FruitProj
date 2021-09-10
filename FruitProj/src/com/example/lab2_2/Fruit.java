package com.example.lab2_2;

	public class Fruit implements Comparable<Fruit>{
		int no;
		String name;
		int price;
		
		public Fruit(int no, String name, int price) {
			// TODO Auto-generated constructor stub
			super();
			this.no=no;
			this.name=name;
	        this.price=price;
		}

		@Override
		public int compareTo(Fruit o) {
			return name.compareTo(o.name);
		}

		@Override
		public String toString() {
			return "Student [no = " + no + ", name = " + name + ", price = " + price + "]";
		}
	}