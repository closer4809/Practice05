package com.javaex.ex10;

public class Book {
    //������
    int bookNo;
	String title;
	String author;
	
	int stateCode;
	//������
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	//�޼ҵ�-�ټ�
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	//�޼ҵ� - �Ϲ�


	public void displayBookInfo() {
		System.out.println(bookNo +" å ����:"+ title + ", �۰�:"+author+" , �뿩����:"+stateCode);
	}
	
	
	
	
	
}
