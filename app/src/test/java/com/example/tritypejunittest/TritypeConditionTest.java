package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    // 选择line 53 判断是否有边小于等 0 的 desision

    // Sides1 <= 0: test case 1 : true; test case 2 : false
    // Sides2 <= 0: test case 1 : true; test case 2 : false
    // Sides3 <= 0: test case 1 : true; test case 2 : false
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, -1, -1));
        assertEquals(3, tri.Triang(3, 3, 3));
    }

}