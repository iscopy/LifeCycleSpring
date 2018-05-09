package com.spring.three;

public class HelloWorld {
	
	private String message;

	public void getMessage() {
		System.out.println("This is Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//初始化回调
	public void init(){
		System.out.println("Bean 初始化回调 init（）");
	}
	
	//销毁回调
	public void destroy(){
		System.out.println("Bean 销毁回调  destroy（）");
	}
	
	

}
