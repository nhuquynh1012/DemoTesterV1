
import com.pnnq.Service.HamMuService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Như Quỳnh
 */
public class HamMuTest {
    @Test
    public void testDuong1(){
        double x=2;
        int n=0;
        double expected = 1;
        double actual = HamMuService.Power(x, n);
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testDuong2(){
        double x=-2;
        int n=2;
        double expected = 4;
        double actual = HamMuService.Power(x, n);
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testDuong3(){
        double x=-2;
        int n=3;
        double expected = -8;
        double actual = HamMuService.Power(x, n);
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testDuong4(){
        double x=2;
        int n=-1;
        double expected = 0.5;
        double actual = HamMuService.Power(x, n);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDuong5(){
        double x=-2;
        int n=-1;
        double expected = -0.5;
        double actual = HamMuService.Power(x, n);
        Assertions.assertEquals(expected, actual);
    }
//    @Test
//    public void testOver(){
//        double x=999999;
//        int n=99999;
//        double expected = Math.pow(x, n);
//        double actual = HamMuService.Power(x, n);
//        Assertions.assertEquals(expected, actual);
//    }
}
