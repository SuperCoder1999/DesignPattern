package com.atguigu.factory.simplefactory.pizzastore.simpleFactory1.order;

//�൱��һ���ͻ��ˣ���������
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ʹ�ü򵥹���ģʽ1  (��������Ʒ��.����ֱ����SimpleFactory�����,����Ӱ���ϲ�[PizzaStore��])
		new OrderPizza(new SimpleFactory());
		System.out.println("~~�˳�����~~");

	}

}
