package com.atguigu.factory.simplefactory.pizzastore.simpleFactory1_static.order;

//相当于一个客户端，发出订购
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//使用简单工厂模式1_static.让createPizza变成静态方法,调用更方便
		new OrderPizza2();
		System.out.println("~~退出程序~~");
	}

}
