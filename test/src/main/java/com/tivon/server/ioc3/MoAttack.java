package com.tivon.server.ioc3;

public class MoAttack {
	private GeLi geli;

	public MoAttack() {
		// TODO Auto-generated constructor stub
	}
	
	// ①注入革离的具体扮演者
	public MoAttack(GeLi geli) {
		this.geli = geli;
	}

	public void cityGateAsk() {
		geli.responseAsk("墨者革离！");
	}

	public void setGeli(GeLi geli2) {
		this.geli = geli2;
	}
}
