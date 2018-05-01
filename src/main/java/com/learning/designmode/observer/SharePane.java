package com.learning.designmode.observer;

public class SharePane implements DisplayInterface, ObserverInterface {
	
	private SubjectInterface subject;
	private int data;
	
	public SharePane(SubjectInterface subject) {
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void updata(int data) {
		this.data = data;
		display();
	}

	@Override
	public void display() {
		System.out.println("�ı���һ�Σ� �������ڲ�����֪ͨ�ˣ�");
		subject.removeObserver(this);
	}

}
