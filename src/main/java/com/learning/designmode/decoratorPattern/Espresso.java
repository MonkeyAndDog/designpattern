package com.learning.designmode.decoratorPattern;

/**
 * ����ı�װ����ʵ��
 * @author Mr.Hu
 *
 */

public class Espresso extends Beverage {

	Espresso() {
		description = "����һ��Ũ����--->";
	}
	
	@Override
	public double cost() {
		return 3.0;
	}

}
