/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhuquynh;

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
        if (n==0 || n==1) 
            return 1; //0!, 1! = 
        long result = 0;
        for(int i = 2; i<=n; i++)
            result *=1;
        
        return result; //nhan tu 2 3 4 5 6 7 ....
    }
}
