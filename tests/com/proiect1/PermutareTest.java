package com.proiect1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PermutareTest {

    @Test
    void testPerm(){

//        ArrayList<Masina> masini=new ArrayList<>();
//        masini.add(new Masina(1234,"Bla bla",2002));
//        masini.add(new Masina(3456,"New Car",2000));
//        masini.add(new Masina(988778,"Toyota",1998));
//
//        Permutare<Masina> permutare=new Permutare<>(masini);
//
//
//        permutare.back(0);
        ArrayList<Integer> multime=new ArrayList<Integer>();
        multime.add(1);
        multime.add(3);
        multime.add(5);
        MyPermutare<Integer> permutare=new MyPermutare<>(multime);

        permutare.back(0);
    }

    @Test
    void testPermutare6(){
        int a=8;
        int b=12;
        ArrayList<Integer> multime=new ArrayList<>();
        for(int i=0;i<(b-a)+1;i++){
            multime.add(a+i);
        }
        MyPermutare<Integer> permutare=new MyPermutare<Integer>(multime);
        permutare.back(0);
    }

    @Test
    void testPermutari1(){
        int n=6;
        ArrayList<Integer> multime=new ArrayList<>();
        for(int i=n;i>0;i--){
            multime.add(i);
        }
        System.out.println(multime);
        MyPermutare<Integer> permutare=new MyPermutare<Integer>(multime);
        permutare.back(0);
    }

    @Test
    void testAseazaRegine(){
        AseazaRegine m=new AseazaRegine(4);
        System.out.println(m.toString());
        m.back(0);
    }
}