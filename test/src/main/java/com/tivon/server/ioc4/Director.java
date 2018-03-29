package com.tivon.server.ioc4;

public class Director {

	public void direct() {
		GeLi geli = new LiuDeHua();
		MoAttack moAttack = new MoAttack();
		moAttack.injectGeli(geli);
		moAttack.cityGateAsk();
	}

}
