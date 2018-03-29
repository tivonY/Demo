package com.tivon.server.ioc3;

public class Director {

	public void direct() {
//		// ①指定角色的扮演者
//		GeLi geli = new LiuDeHua();
//
//		// ②注入具体扮演者到剧本中
//		MoAttack moAttack = new MoAttack(geli);
//		moAttack.cityGateAsk();
		
		
       GeLi geli = new LiuDeHua();  
       MoAttack moAttack = new MoAttack();  
  
        //①调用属性Setter方法注入  
       moAttack.setGeli(geli);   
       moAttack.cityGateAsk();  
	}

}
