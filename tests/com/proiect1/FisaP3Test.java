package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FisaP3Test {
    @Test
    void testSolutie(){
        ArrayList<String> flori=new ArrayList<>();

        flori.add("lalea");
        flori.add("liliac");
        flori.add("gerbera");
        flori.add("zambila");
        FisaP3 f=new FisaP3(flori,3);


        ArrayList<ArrayList<String>> sol=f.solutieP3();
        sol=(ArrayList) sol.stream().filter(p->{
            ArrayList<Character> o=new ArrayList<>();
            for (String sr:p
                 ) {
                if(o.size()>0&&o.contains(sr.charAt(0))) return false;
                o.add(sr.charAt(0));
            }
            return true;
        }).collect(Collectors.toList());
            sol.stream().map(p->{
                String z="{";
                for (String q:p
                     ) {
                    z=z+q+";";
                }
                z=z+"}";
                System.out.println(z);
                return z;
            }).collect(Collectors.toList());
    }

}