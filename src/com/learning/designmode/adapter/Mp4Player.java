package com.learning.designmode.adapter;

public class Mp4Player extends AdvanceMediaPlayer {
	@Override 
	public void playMp4(String type, String filename) {
		System.out.println("���ŵ��� " + type + "���͵ģ�" + filename + "�ļ�");
	}
}
