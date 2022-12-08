package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FisaP1Test {
    @Test
    void testP1(){
        int n=4;
//
//        FisaP1 p1=new FisaP1(n);
//        p1.Solutie();

        ArrayList<Integer> a=new ArrayList<>();
        a.add(7);
        a.add(8);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        ArrayList<ArrayList<Integer>> c=new ArrayList<>();
        c.add(a);
        c.add(b);

 //       System.out.println(c.stream().map(i->i.stream().reduce(0,(z,x)->z+x)).filter(l->l>33).collect(Collectors.toList()).size());
        Fisa p1=new Fisa(4);
        p1.solutieP1();
    }

    @Test
    void testSolutieP2(){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(7);
        a.add(8);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        ArrayList<ArrayList<Integer>> c=new ArrayList<>();
        c.add(a);
        c.add(b);

        //       System.out.println(c.stream().map(i->i.stream().reduce(0,(z,x)->z+x)).filter(l->l>33).collect(Collectors.toList()).size());
        Fisa p1=new Fisa(4);
        p1.solutieP2();
    }

}