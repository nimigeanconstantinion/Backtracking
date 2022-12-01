package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CombinareTest {

    @Test
    void combinareTEst(){
    ArrayList<Integer> data=new ArrayList<>();
    data.add(1);
    data.add(2);
    data.add(3);
        Combinare cb=new Combinare(data,2);
        cb.back(0);
    }
}