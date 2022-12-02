package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProdusCartezianTest {

    @Test
    void testProdusCartezian(){
        ArrayList<Integer> m1=new ArrayList<>();
        m1.add(1);
        m1.add(2);
        ArrayList<Integer> m2=new ArrayList<>();
        m2.add(7);
        m2.add(8);
        m2.add(9);

        ProdusCartezian p=new ProdusCartezian(m1,m2);
        p.back(0);
        p.tipareste();


    }

}