package com.learning.designmode.decoratorPattern;

/**
 * װ���ߵĹ�ͬ�ӿ�
 * @author Mr.Hu
 *
 */

public abstract class CondimentDecorator extends Beverage{
	
	/**
	 * ���汻װ�ε��������
	 */
	protected Beverage beverage;
	
	/**
	 * ��ȡ���������
	 */
	public abstract String getDescription();
}
