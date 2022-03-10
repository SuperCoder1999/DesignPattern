package com.atguigu.factory.simplefactory.pizzastore.traditional.order;

//相当于一个客户端，发出订购
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//传统方式 (如果添加新品种.需要在OrderPizza中添加.)
		/*
		1.和老师分析的缺点不一样:这里并不需要修改其他地方的代码.所以也不算太麻烦.
		2. 我觉得,应该是:创建Pizza类 与 执行Pizza方法不应该放在一起.(单一职责)
		 */
		//new OrderPizza();
	}

}
