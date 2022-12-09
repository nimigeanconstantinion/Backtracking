package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BTProblema5Test {
    @Test
    void testP5(){

        BTProblema5 p5=new BTProblema5(3,17);
        ArrayList<Integer> solutie5=p5.solutieP5();
        System.out.println(solutie5);
        System.out.println("Avem "+solutie5.size()+" solutii");
    }

}