package com.learning.designmode.singleInstance;

import static java.lang.System.out;

public class Session {
	
	private static Session session = null;
	
	static {
		session = new Session();
		System.out.println("��̬�����ע��");
	}
	
	private Session() {
		out.println("������һ���Ự");
	}

	public static Session getInstance(){
//		return session = new Session();
		return session;
	}
	
	public void init() {
		System.out.println("init()");
	}
}
