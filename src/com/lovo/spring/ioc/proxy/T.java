package com.lovo.spring.ioc.proxy;

import java.lang.reflect.Proxy;

public class T {
	
	public static void main(String[] args) {
		//创建玩家
		IPlay a=new PlayerA();
		//a.play();
		IPlay b=new PlayerB();
		//创建代理
//		IPlay proxy=new ProxyPlayer(b);//代练A
//		proxy.play();
		IPlay proxy=	(IPlay) Proxy.newProxyInstance(IPlay.class.getClassLoader(),new Class[]{IPlay.class}, new DryProxy(b));
		proxy.play2();
	}
}
