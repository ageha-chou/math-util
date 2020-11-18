/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import fu.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Delwyn
 */
public class MathUtilityTest {
    
    //mình sẽ test các tình huống xài hàm getFactorial() ở đây
    //tình huống là tham số đưa vào: dương, âm. dương trong khoảng 0...20, ngoài khoảng
    //tình huống xài hàm, test hàm gọi là TEST CASES
    //thường ta có tình huống thành công và thất bại
    //thành công: đưa vào value hợp lệ 0...20
    //thất bại: đưa vào âm, > 20, bị ăn đòn
    //hàm phải bắt các tình huống này, và giờ ta test thử coi hàm xử lí đúng không
    
    @Test //biến hàm này thành public static void main()
    //quy tắc đặt tên hàm  cho việc test phần mềm: rất nhiều nguyên tắc khác nhau
    //nhưng nói chung tên hàm sẽ bao gồn ngữ nghĩa ke63t quả trả về, tình trạng test
    //không giống quy tắc đặt tên hàm khi viết app
    //mình đang viết code để test app
    
    //mình muốn test hàm trả về ngon nếu đưa tham số ngon
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        //tui muốn check coi có đúng là gọi hàm 5! thì ói về 120 hay không?
        //có XANH heng, ko ĐỎ heng
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
}

//MẶC ĐỊNH CODE TEST ĐỘC LẬP VS CODE CHÍNH
//ĐỘC LẬP VS QUÁ TRÌNH CLEAN AND BUILD, TỨC LÀ DÙ CODE BẠN XANH HAY ĐỎ
//MIỄN LÀ HK BỊ ERROR CÚ PHÁP
//BẠN LUÔN ĐÓNG GÓI (BUILD) RA ĐƯỢC FILE .JAR .WAR (CHẤP XANH ĐỎ)

//HỢP LOGIC THÌ MÀU XANH, TỨC LÀM HÀM CHUẨN THÌ MỚI NÊN RA ĐƯỢC .JAR .WAR
//VẬY TA CẦN CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUILD .JAR, .WAR
//CÁCH KHÁC: NẾU CODE TEST ĐANG MÀU ĐỎ THÌ PHẢI DISABLE NÚT BẤN CLEAN AND BUILD