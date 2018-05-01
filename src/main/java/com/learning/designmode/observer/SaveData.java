package com.learning.designmode.observer;

public class SaveData implements ObserverInterface, DisplayInterface {

	private int data;
	private SubjectInterface subject;
	
	public SaveData(SubjectInterface subject) {
		data = 1;
		this.subject = subject;
		subject.addObserver(this);
		display();
	}
	
	@Override
	public void display() {
		System.out.println("�������ݴ���ģ�飬 �ұ�֪ͨ�����˸ı䣬 �ı�������� �� " + data);
	}

	@Override
	public void updata(int data) {
		this.data = data;
		display();
	}

}
