package com.javaex.ex02;

public class Goods {
	//�ʵ�
	private String name;
	private int price;
	
	//������
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//�޼ҵ� - �ټ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//�޼ҵ� - �Ϲ� 
	public void showinfo() {
		System.out.println("��Ǿ��: "+name+", ����:"+price);
	}

}




