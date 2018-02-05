package com.learning.designmode.decoratorPattern;

/**
 * ����ı�װ����ʵ��
 * @author Mr.Hu
 *
 */

public class HouseBlend extends Beverage {
	
	HouseBlend() {
		description = "�ڿ���-->";
	}
	
	@Override
	public double cost() {
		return 1.0;
	}

}
