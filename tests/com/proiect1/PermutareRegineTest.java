package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PermutareRegineTest {
    @Test
    void testVerificareLista(){
        ArrayList<String> data=new ArrayList<>();
        data.add("*---");
        data.add("--*-");
        data.add("---*");
        data.add("-*--");
        PermutareRegine p=new PermutareRegine(data);
       p.back(0);
       // System.out.println(p.checkSolution(data));
    }

}