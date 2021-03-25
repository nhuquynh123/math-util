/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhuquynh.mathutil.test;

import com.nhuquynh.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class MathUtilityTest {
   
    @Test //bien ham nay thanh main(), Shift-F6 de chay
    //gọi ham getF() nhu thuong lệ, hay hon la tu dong so sanh gium
    //expected va actual coi co khop nhau ko?? co thay mau xanh
    //ko khop nhau thay mau do. Ta chi nhin mau ma ko can mat cong
    //so sanh hon nữa!!!!!!!
    public void testFactorialRighArgumentRunsWell(){
        long expected = 120; // em muon biet 5! co phai 120ko?
        int n = 5;
        long actual = MathUtility.getFactorial(n);//tinh thiet coi
        //va so sanh gium to luon
        assertEquals(expected, actual);//to chi thich den bao giao thong hoi
        
        // tui se test cac tinh huong con lai
        assertEquals(720, MathUtility.getFactorial(6));//6! co1 phai3 720?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //tinh huong: test case . nghe tester la nghe nghi ra cac test case, sau do thu nghiem
        
        //assertEquals(1, MathUtility.getFactorial(0));
        //ki vong sai , tinh dung ==> 1 mau do, ko khop nhau
        //ki vong dung , tinh sai ==> 1 mau do
        //ki vong 5! = 120, may tinh ra may, ham tinh ra may?
    }
        //ta test phan ngoai le - Exception
        //Exception la tinh huong bat thuong xay ra trong app, code khi thuc thi
        //aap chay. No ko phai la 1 value de co the so sanh
        //loi SQL trung key, sai khoa ngoai, null tren cot yeu cau khac null
        //deu la loi lien quan SQL nhung ko the noi tk nao bang tk nao
        //doi voi Exception, chi co the do no = cau hoi: May co xuat hien ko
        //ko dung assertEquals() so-sanh-coi-co-bang-nhau-hay-ko
        //trong thiet ke cua ham getFactorial() thi neu dua vao n<0 hoac n>2
        //thi ham nem ra, se new mot ngoai le
        //cu dua n vi pham, nhan ve ngoai le
        //vay neu co ngoai le xay ra khi n dua vao ca chon < 0 > 21
        //co nghia rang ham chay dung, neu co ngoai le ta lai an mung, vi chay
        //nhu thiet ke -> dung co ngoai le ta can no xuat hien -> mau xanh
        //se co test  case, tinh huong test: xem ngoai le co xuat hien ko, co->xanh
        //                                                          ko xh nhu du kien ->do
        
        @Test(expected = IllegalArgumentException.class)
        public void testFactorialGivenWrongArgumentThrowsException(){
          MathUtility.getFactorial(30); // phai xh Exception  
         MathUtility.getFactorial(-1); // phai xh Exception
         MathUtility.getFactorial(-10); // phai xh Exception
         MathUtility.getFactorial(21); // phai xh Exception
         MathUtility.getFactorial(40); // phai xh Exception
         //neu Exception nhu ki vong, thi phai xanh
         //vi mau xanh here ham y rang ham chay nhu thiet ke
         //nem ngoai le khi dua n ca chon
         
         //TA CAN KI THUAT DE BAT NGOAI LE, DUNG NGOAI LE CAN BAT XUAT HIEN
         //TA CO XANH
         
         
    }
    }
    
    

//quy uoc xanh: neu tat ca cac loi goi ham getFactorial()
//deu tra ra gia tri dung nhu ki vong, noi cach khac tat ca cac 
//ham assertEquals()deu so sanh khop expected vs .actual
//thi co mau xanh
//XANH: khi tat ca cac tinh huong test ham thi ham phai dung cho cac
//tinh huong test duoc dua ra
//da test thi phai dung cho cac tinh huong duoc dua ra
//ko choi tro : hau het cac ham deu dung, lau lau moi sai,...
