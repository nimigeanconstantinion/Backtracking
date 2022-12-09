package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BTProblema1Test {

    @Test
    void testSolutie(){

        BTProblema1 p=new BTProblema1(3);
        ArrayList<Integer> solutie=p.solutieP1();
        System.out.println(solutie);
    }
    @Test
    void testSolutie2(){

        BTProblema1 p=new BTProblema1(3);
        ArrayList<Integer> solutie=p.solutieP2();
        System.out.println(solutie);
    }

    @Test
    void testSolutie3(){

        BTProblema1 p=new BTProblema1(3);
        ArrayList<Integer> solutie=p.solutieP2();
        System.out.println(solutie.size());
    }
}