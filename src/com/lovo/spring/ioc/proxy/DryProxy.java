package com.lovo.spring.ioc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理指令的组装
 * 
 * @author Administrator
 *
 */
public class DryProxy implements InvocationHandler {
	private Object obj;

	// 被代理者
	public DryProxy(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("调用方法之前");
		// 指令：调用被代理者的方法
		obj = arg1.invoke(obj, arg2); // obj调用方法后的返回值
		System.out.println("调用方法之后");
		return obj;
	}

}
