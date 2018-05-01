package com.learning.designmode.decoratorPattern;

/**
 * ���ϵľ���ʵ��
 * @author Mr.Hu
 *
 */

public class Whip extends CondimentDecorator {

	Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "����+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.65 + beverage.cost();
	}

}
