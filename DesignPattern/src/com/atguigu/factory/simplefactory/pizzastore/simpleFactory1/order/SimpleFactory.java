package com.atguigu.factory.simplefactory.pizzastore.simpleFactory1.order;

import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.simpleFactory1.pizza.Pizza;

//�򵥹�����
public class SimpleFactory {

	//����orderType ���ض�Ӧ��Pizza ����
	public Pizza createPizza(String orderType) {

		Pizza pizza = null;

		System.out.println("ʹ�ü򵥹���ģʽ");
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