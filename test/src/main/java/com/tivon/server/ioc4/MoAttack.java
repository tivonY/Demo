package com.tivon.server.ioc4;

public class MoAttack implements ActorArrangable {

	private GeLi geli;

	// ①实现接口方法
	public void injectGeli(GeLi geli) {
		this.geli = geli;
	}

	public void cityGateAsk() {
		geli.responseAsk("墨者革离");
	}

	public GeLi getGeli() {
		return geli;
	}

	public void setGeli(GeLi geli) {
		this.geli = geli;
	}

}
