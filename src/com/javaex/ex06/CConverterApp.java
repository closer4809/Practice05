package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        System.out.print("�鸸���� ");
        System.out.print(CConverter.toDoller(1000000));
        System.out.println("�޷��Դϴ�.");
        
        
        System.out.print("��޷���");
        System.out.print(CConverter.toKWR(100)); 
        System.out.println("�Դϴ�.");
        //100������ �޷��� ����ϱ�

        
        //100�޷��� ������ ����ϱ�
        
    }

}
