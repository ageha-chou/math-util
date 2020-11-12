/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import fu.util.MathUtility;

/**
 *
 * @author Delwyn
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2. test hàm = mắt
        System.out.println("5!: " + MathUtility.getFactorial(5));
        //expeted: 120,     actual:120 -> Ok
        //tao hy vọng mày ói về 120 khi tao gọi mày hàm giai thừa ấy
        
        //và test bộ data khác, test case, tình huống khác
        System.out.println("0!: " + MathUtility.getFactorial(0));
        //expected: 1,  actual: 1 -> Ok
        
        System.out.println("-5!: " + MathUtility.getFactorial(-5));
        //e: ném về ngoại lệ IllegalArgumentExeption nếu giai thừa -5
    }
    
    //Code viết ra thì Dev phải test trước
        //có vài hình thức test code khác nhau
        //1. TDD, Test driven Development
            //Viết dàn kung của hàm getFactorial(int n)
            //sau đó dựng hàm test()
            //chạy thử coi xanh đỏ, đỏ nghĩa là lỗi, xanh nghĩa là ổn
            //cứ liên tục xanh đỏ như thế trong quá trình viết code
            //và sửa code, người ta gọi là lập trình hướng theo thỏa mãn
            //việc test, TDD
        //2. sout(hàm kèm data) để coi kết quả ra sao, có đúng như mình kì vọng không
            //nó phải trả về như thế hay không -> xem kết quả test = mắt
        //3. JOptionPane của bên JavaDesktop để popup kết quả lên màn hình,
            //vẫn xem = mắt
        //4. viết 1 trang web gọi hàm xử lý..., hap sức quá
    
    //ta chơi cách 1 và 2
}
