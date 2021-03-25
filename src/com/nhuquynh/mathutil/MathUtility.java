/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhuquynh.mathutil;

/**
 *
 * @author HP
 */
public class MathUtility {
    
    //day la class mo phong lai class Math, chua ham xai chung
    //ham xai chung, khong luu lai dieu gi -> static
    public  static final double PI = 3.1415;
    
    //ham tinh n!
    //n! tang rat nhanh ve gia tri
    //21! tran kieu long, hon 18 so 0
    //bai nay ta tinh tu 0..20!. Âm khong tinh duoc, 0! = 1! = 1
    public static long getFactorial(int n){
        if(n<0 || n>20)
        throw new IllegalArgumentException("n must be between 0..20");
        
        //song sot duoc den day thi n=0,1,..20
        //sua code, sua ham giai thua cho gon, dung de quy
        if (n==0 || n==1) 
            return 1; //0! = 1! = 1 tinh luon cho nhanh 
        return n * getFactorial(n-1);
        //n! = n* (n-1)!
        //de quy, vong lai chinh minh voi mot quy mo khac 
        //recursion, lam kheo neu khong no di mai mai 
        //stackoverflow.com
        
//        long result = 1; // xanh local va server // gia no = 
//        for(int i = 2; i<=n; i++)
//            result *=i;
//        
//        return result; //nhan tu 2 3 4 5 6 7 ....
    }
}
