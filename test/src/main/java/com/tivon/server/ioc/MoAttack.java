package com.tivon.server.ioc;

public class MoAttack {
	public void cityGateAsk() {
		// ①演员直接侵入剧本
		LiuDeHua ldh = new LiuDeHua();
		ldh.responseAsk("墨者革离！");
		
//        //①引入革离角色接口  
//       GeLi geli = new LiuDeHua();   
//        //②通过接口开展剧情  
//       geli.responseAsk("墨者革离！");  
	}
}
