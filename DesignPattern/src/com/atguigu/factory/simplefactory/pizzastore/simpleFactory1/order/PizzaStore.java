package com.atguigu.factory.simplefactory.pizzastore.simpleFactory1.order;

//相当于一个客户端，发出订购
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//使用简单工厂模式1  (如果添加新品种.可以直接在SimpleFactory中添加,不会影响上层[PizzaStore类])
		new OrderPizza(new SimpleFactory());
		System.out.println("~~退出程序~~");

	}

}
