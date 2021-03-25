/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhuquynh.mathutil.main;

import com.nhuquynh.mathutil.MathUtility;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("lst upload from Local to Github!!!");
//        System.out.println("Welcom to Github");

        //Test trâu bo, tuc la dung mat de nhin kq dung sai
        long expected = 120;//t kì vong ham tinh giai thua tra ve 120 khi t dua vao 5
        long actual;        //neu t dua vao 5
        int input = 5;      //dau vao 5
        actual = MathUtility.getFactorial(input);
        System.out.println("5!: Expected: " + expected + ";Actual: " + actual);
        //mot test case ,1 tinh huong xai ham, test ham, dung ham
        
        //case 2: 0! thì sao?
        expected = 1;
        input = 0;
        actual = MathUtility.getFactorial(input); //xem oi ra may
        System.out.println("0!: Expected: " + expected + ";Actual: " + actual);
        
        //case 3: 2! thì sao?
         expected = 2;
        input = 2;
        actual = MathUtility.getFactorial(input); //xem oi ra may
        System.out.println("2!: Expected: " + expected + ";Actual: " + actual);
        
        //case 4: -1! thì sao?
        //expected = ????; // ngoại lệ mà , ko so sanh dc, ko phai la value
        //ma no chi xuat hien thoi
        input = -1;
        actual = MathUtility.getFactorial(input);
        //ko in dc ngoai le, chi coi no co xuat hien hay ko???
        
        //CHUNG TA PHAI NHIN DE KET LUAN, NHIN NHIEU CASE
        //CHOI TRO CHOI THONG MINH - TEST AUTOMATION DUNG THU VIEN
    }
    
}
