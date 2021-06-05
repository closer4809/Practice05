package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();//겟셋을 사용하여 일반 메소드를 실행하는것은 가능
		Goods cup = new Goods("머그컵", 2000);// 디폴트 값을 주고 생성자를 부여하여야 가능
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showinfo();
		cup.showinfo();
		
	}

}


