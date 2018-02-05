package com.learning.designmode.decoratorPattern;

/**
 * ���ϵľ���ʵ��
 * @author Mr.Hu
 *
 */

public class Soy extends CondimentDecorator {
	
	Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "����+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}
