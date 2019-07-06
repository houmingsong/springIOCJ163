package com.lovo.spring.ioc.util;

import java.util.UUID;

public class GetUUID {
   /**
    * 获得UUID
    * @return
    */
	public static String createUUID(){
	String uuidStr=	UUID.randomUUID().toString();
	uuidStr=uuidStr.replaceAll("-","");
		return uuidStr;
	}
	
}
