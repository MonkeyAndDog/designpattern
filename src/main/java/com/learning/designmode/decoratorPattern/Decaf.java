package com.learning.designmode.decoratorPattern;

/**
 * ����ı�װ����ʵ��
 * @author Mr.Hu
 *
 */

public class Decaf extends Beverage {

	Decaf() {
		description = "����һ��û�п�����Ŀ���--->";
	}
	
	@Override
	public double cost() {
		return 6.0;
	}

}
