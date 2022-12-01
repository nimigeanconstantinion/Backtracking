package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AranjamentTest {
    @Test
    void testAranjament(){
        ArrayList<Integer> data=new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);

        Aranjament aranjament=new Aranjament(data,2);

        aranjament.back(0);

    }

}