package com.javaex.ex10;

public class Book {
    //생성자
    int bookNo;
	String title;
	String author;
	
	int stateCode;
	//생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	//메소드-겟셋
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
	//메소드 - 일반


	public void displayBookInfo() {
		System.out.println(bookNo +" 책 제목:"+ title + ", 작가:"+author+" , 대여유무:"+stateCode);
	}
	
	
	
	
	
}
