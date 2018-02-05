package com.learning.designmode.decoratorPattern;

/**
 * ���ϵľ���ʵ��
 * @author Mr.Hu
 *
 */

public class Milk extends CondimentDecorator {

	Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "ţ��+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

}
