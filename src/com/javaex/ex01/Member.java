package com.javaex.ex01;

public class Member {
	//�ʵ�
	private String name;
	private String id;
	private int point;
	
	//������ 
	public Member() {
		
	}
	
	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	
	//�޼ҵ� - �ټ�
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	//�޼ҵ� - �Ϲ�
	public void showinfo() { 
		System.out.println("ȸ������: "+name+id+", "+point+"��");
	}

}
