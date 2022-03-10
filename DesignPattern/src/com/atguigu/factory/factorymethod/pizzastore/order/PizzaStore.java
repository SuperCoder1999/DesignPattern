package com.atguigu.factory.factorymethod.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//创建北京口味的各种Pizza
			new BJOrderPizza(); //会触发,父类构造器
		} else {
			//创建伦敦口味的各种Pizza
			new LDOrderPizza(); //会触发,父类构造器
		}
		// TODO Auto-generated method stub
	}

}
