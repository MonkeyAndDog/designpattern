package com.learning.designmode.decoratorPattern;

/**
 * ���ϵľ���ʵ��
 * @author Mr.Hu
 *
 */

public class Mocha extends CondimentDecorator {

	Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "Ħ��+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.6 + beverage.cost();
	}
	
}
