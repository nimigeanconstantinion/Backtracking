package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class AnagrameTest {

    @Test
    void testAnagrama(){
        String test="icar";
        ArrayList<String> data=new ArrayList<>();
        for (int i=0;i<test.length();i++) {

            data.add(String.valueOf(test.charAt(i)));
        }
        Anagrame<String> anagrama=new Anagrame<String>(new ArrayList<>(data.stream().sorted().collect(Collectors.toList())));
        anagrama.back(0);
    }

}