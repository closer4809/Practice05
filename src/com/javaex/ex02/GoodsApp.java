package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();//�ټ��� ����Ͽ� �Ϲ� �޼ҵ带 �����ϴ°��� ����
		Goods cup = new Goods("�ӱ���", 2000);// ����Ʈ ���� �ְ� �����ڸ� �ο��Ͽ��� ����
		
		camera.setName("����");
		camera.setPrice(400000);
		
		camera.showinfo();
		cup.showinfo();
		
	}

}


