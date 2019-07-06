package com.lovo.spring.ioc.proxy;

public class PlayerB implements IPlay {

	
	public void play() {
		
    System.out.println("B玩家的级别为白银");
	}

	@Override
	public void play2() {
		 System.out.println("B玩家的级别为白银22");
		
	}

}
