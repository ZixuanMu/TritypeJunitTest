package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriang() {
        //对于相同的输入，origional 的 triout == 4
        //而 mutant1 和 mutant2 的 triout == 2

        //分析：
        // TritypeMutantestOne 中，side1 == side2 则triOut = 2,
        // 但strout = 2时，判断是否是三角形却是side1 + side3 > side2

        // TritypeMutantestTwo 中, 对于0 < triout <=3,
        // 判断是否是三角形用的是 两边之和是否 >= 第三边

        Tritype tri = new Tritype();
        TritypeMutantOne tri1 = new TritypeMutantOne();
        TritypeMutantTwo tri2 = new TritypeMutantTwo();
        assertEquals(4, tri.Triang(2, 2, 4));
        assertEquals(2, tri1.Triang(2, 2, 4));
        assertEquals(2, tri2.Triang(2, 2, 4));
    }
}