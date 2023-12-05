package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
    @Test
    public void testTriang() {
        // 选择line 53 判断是否有边小于等 0 的 desision

        // test case 1: (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) = true
        // test case 1: (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) = false

        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, -1, -1));
        assertEquals(3, tri.Triang(3, 3, 3));
    }
}