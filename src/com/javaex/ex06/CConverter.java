package com.javaex.ex06;

public class CConverter {
    
    public static double rate = 1118.70;
    
    
    // 1´Þ·¯ = 1118.700¿ø
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
         double result = won/rate;
         return result;
    }
    	

    
    public static double toKWR(double dollar){
         double result = dollar * rate;
         return result;
    }
    

}
