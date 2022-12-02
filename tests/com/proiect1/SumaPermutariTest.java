package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SumaPermutariTest {

    @Test
    void testSumaPermutari(){
        ArrayList<Integer> data=new ArrayList<>();
        data.add(1);
        data.add(3);
        data.add(5);
        SumaPermutari sp=new SumaPermutari(data);
        sp.back(0);
        sp.sumaPerm();

    }

}