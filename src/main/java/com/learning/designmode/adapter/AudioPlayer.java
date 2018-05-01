package com.learning.designmode.adapter;

public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter adapter;
	
	@Override
	public void play(String type, String filename) {
		if(type.equalsIgnoreCase("vlc")){
			System.out.println("���ŵ��� " + type + "���͵ģ�" + filename + "�ļ�");
		} else if(type.equalsIgnoreCase("mp3") || type.equalsIgnoreCase("mp4")) {
			adapter = new MediaAdapter(type);
			adapter.play(type, filename);
		} else {
			System.out.println("���Ų���");
		}
	}

}
