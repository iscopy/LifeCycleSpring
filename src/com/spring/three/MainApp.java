package com.spring.three;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * ��Ҫע��һ���� AbstractApplicationContext ����
		 * �����Ĺر� hook �� registerShutdownHook() ������
		 * ����ȷ�������رգ����ҵ�����ص� destroy ������
		 * */
		//���ó�ʼ���ص�
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("initdestroy");
		obj.getMessage();
		
		//�������ٻص�
		context.registerShutdownHook();
		
	}

}
