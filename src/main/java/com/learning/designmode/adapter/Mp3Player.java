package com.learning.designmode.adapter;

public class Mp3Player extends AdvanceMediaPlayer {
	
	@Override
	public void playMp3(String type, String filename) {
			System.out.println("���ŵ��� " + type + "���͵ģ�" + filename + "�ļ�");
	}
}
