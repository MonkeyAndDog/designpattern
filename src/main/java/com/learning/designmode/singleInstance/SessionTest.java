package com.learning.designmode.singleInstance;

import static org.junit.Assert.*;

import org.junit.Test;

public class SessionTest {

	@Test
	public void test() {
//		Session s1;
		Session s1 = Session.getInstance();
		Session s2 = Session.getInstance();
		if(s1 == s2) {
			System.out.println("����һ���Ự");
		} else {
			System.out.println("�ⲻ��һ���Ự");
		}
	}

}
