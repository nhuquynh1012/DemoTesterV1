
import com.pnnq.Service.NguyenToService;
import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Như Quỳnh
 */
public class NguyenToTest {
    @BeforeAll
    public static void BeforeAll(){
        System.out.println("BeforeAll");
    }
    @AfterAll
    public static void AfterAll(){
        System.out.println("AfterAll");
    }
    @BeforeEach
    public void BeforeEach(){
        System.out.println("BeforeEach");
    }
    @AfterEach
    public void AfterEach(){
        System.out.println("AfterEach");
    }
    
//    @Test
//    @DisplayName("Kiem tra so nguyen to chan")
//    public void testEvenNumber(){
//        int n= 2;
//        boolean excepted = true;
//        boolean actual = NguyenToService.isNguyenTo(n);
//        Assertions.assertEquals(excepted, actual);
//    }
//    
//    @Test
//    @DisplayName("Kiem tra so nguyen to chan")
//    public void testEvenNumber2(){
//        int n= 4;
//        boolean actual = NguyenToService.isNguyenTo(n);//mong muon la sai vi 4 k phai snt nhung do code sai(sai ngay cho i<Math.sqrt(n) phai them dau = thi moi dung) nen van tra ra true
//        Assertions.assertFalse( actual,"Cai thuat toan bi sai!!!!!");
//    }
//    
//    @Test
//    @DisplayName("Khiem tra so nguyen to le")
//    public void testOddNumber(){
//        int n= 5;
//        boolean actual = NguyenToService.isNguyenTo(n);
//        Assertions.assertTrue(actual);
//    }
//    
//    @Test
//    public void testException(){
//        Assertions.assertThrows(ArithmeticException.class,()->{
//            NguyenToService.isNguyenTo(-5);
//        });
//    }
    
    @Test 
    public void testTimeOut(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), ()->{
            NguyenToService.isNguyenTo(113);
        });
    }
}
