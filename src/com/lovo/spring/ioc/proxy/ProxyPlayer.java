package com.lovo.spring.ioc.proxy;

public class ProxyPlayer implements IPlay {
	private IPlay player;
	public ProxyPlayer(IPlay player){
		this.player=player;
	}
	/**
	 * 代练玩
	 */
	public void play() {
		System.out.println("开始代练");
		//玩家
		player.play();
		System.out.println("代练后玩家变为：铂金级别");
      
	}
	@Override
	public void play2() {
		// TODO Auto-generated method stub
		
	}

}
