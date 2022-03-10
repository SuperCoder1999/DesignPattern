package com.atguigu.factory.simplefactory.pizzastore.simpleFactory1_static.order;

import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1_static.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1_static.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1_static.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1_static.pizza.Pizza;

//�򵥹�����
public class SimpleFactory {
	
	//�򵥹���ģʽ2 Ҳ�� ��̬����ģʽ
	public static Pizza createPizza2(String orderType) {

		Pizza pizza = null;

		System.out.println("ʹ�ü򵥹���ģʽ2");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" ϣ������ ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" �������� ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("��������");
		}
		
		return pizza;
	}

}
