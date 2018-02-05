package com.learning.designmode.decoratorPattern;

/**
 * ����ı�װ����ʵ��
 * @author Mr.Hu
 *
 */

public class DarkRoast extends Beverage {

	DarkRoast() {
		description = "�����--->";
	}
	
	@Override
	public double cost() {
		return 2.0;
	}

}
