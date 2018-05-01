package com.learning.designmode.observer.useJDK;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

	private int data;
	
	public void setData(int data) {
		this.data = data;
		setChanged();
		notifyObservers();
	}
	
	@Override
	public synchronized void addObserver(Observer arg0) {
		System.out.println("��ӽ���һ���۲���~ Ŀǰ�۲�����Ŀ : " + countObservers() );
		super.addObserver(arg0);
	}

	@Override
	protected synchronized void clearChanged() {
		System.out.println("�����Ѿ����ı��ˣ� ��������ȷ��");
		super.clearChanged();
	}

	@Override
	public synchronized void deleteObserver(Observer arg0) {
		System.out.println("ɾ����һ���۲���~ Ŀǰ�۲�����Ŀ : " + countObservers() );
		super.deleteObserver(arg0);
	}

	@Override
	public void notifyObservers() {
		System.out.println("��Ҫ֪ͨ������");
		super.notifyObservers(data);
	}

	@Override
	protected synchronized void setChanged() {
		System.out.println("�Ѿ������˸ı�");
		super.setChanged();
	}
	
}
