package com.atguigu.factory.factorymethod.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//����������ζ�ĸ���Pizza
			new BJOrderPizza(); //�ᴥ��,���๹����
		} else {
			//�����׶ؿ�ζ�ĸ���Pizza
			new LDOrderPizza(); //�ᴥ��,���๹����
		}
		// TODO Auto-generated method stub
	}

}
