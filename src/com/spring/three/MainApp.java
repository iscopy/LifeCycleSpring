package com.spring.three;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * 需要注册一个在 AbstractApplicationContext 类中
		 * 声明的关闭 hook 的 registerShutdownHook() 方法。
		 * 它将确保正常关闭，并且调用相关的 destroy 方法。
		 * */
		//调用初始化回调
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("initdestroy");
		obj.getMessage();
		
		//调用销毁回调
		context.registerShutdownHook();
		
	}

}
