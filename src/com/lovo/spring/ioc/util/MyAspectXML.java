package com.lovo.spring.ioc.util;

import org.aspectj.lang.JoinPoint;

public class MyAspectXML {

	public void myNotify(JoinPoint point) {
		String className = point.getSignature().getName();
		System.out.println("进入" + className + "之前的时间" + System.currentTimeMillis());
	}

	public void myAfterNotify(JoinPoint point) {
		String className = point.getSignature().getName();
		System.out.println("进入" + className + "之后的时间" + System.currentTimeMillis());
	}
}
