package com.learning.designmode.decoratorPattern;

/**
 * װ���ߵ�����ϵ��Ǹ������------>Component��
 * 
 * ʹ�õ��ǿ���ʵ��
 * 
 * @author Mr.Hu 
 *
 */

public abstract class Beverage {
	
	protected String description;
	
	Beverage() {
		description = "��򵥵�������--->";
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();



}
