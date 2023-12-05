package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    // 选择line 53 判断是否有边小于等 0 的 desision

    // 满足decision coverage和 condition coverage
    // test case 1 和 2、3、4 相比，只改变一个condition，而decision改变，满足indepent affection
    @Test
    public void testTriang() {
        // 选择line 53 判断是否有边小于等 0 的 desision
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(3, 3, 3));
        assertEquals(4, tri.Triang(-1, 3, 3));
        assertEquals(4, tri.Triang(3, -1, 3));
        assertEquals(4, tri.Triang(3, 3, -1));
    }
}