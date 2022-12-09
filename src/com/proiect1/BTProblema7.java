package com.proiect1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BTProblema7 {

    private ArrayList<Integer> data;
    private int m;

    public BTProblema7(int m) {
        this.m = m;
        this.data = new ArrayList<Integer>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    public void solution() {
        Aranjament ar = new Aranjament(data, m);

        ar.back(0);
        ArrayList<ArrayList<Integer>> lista = (ArrayList<ArrayList<Integer>>) ar.getSolutions();
        ArrayList<Integer> lista2 = (ArrayList<Integer>) lista.stream().filter(p -> p.get(0) != 0)
                .map(x -> {
                    int n = 1, rez = 0;
                    for (int i = x.size() - 1; i >= 0; i--) {
                        rez = rez + x.get(i) * n;
                        n = n * 10;
                    }
                    return rez;
                })
                .map(x->toBin2(x))
                .filter(x->zeroMore2(x))
                .collect(Collectors.toList());
        System.out.println(lista2);

    }
//vector de frecvente [1,2,3,4,0,0,1,0,0]
    public int[] toBin(int n) {

        int[] f= new int[10];
        int k = 1, ret = 0;
        while (n != 0) {
            int v = n %2;
            ret = v * k + ret;
            k = k * 10;
            n=n/2;


        }
        n=ret;
        int q=0;
        while (n != 0) {
            int v = n %10;
             f[v]++;
             n=n/10;


        }
        return f;


    }

    public int toBin2(int n){
        int k = 1, ret = 0;
        while (n != 0) {
            int v = n %2;
            ret = v * k + ret;
            k = k * 10;
            n=n/2;


        }
        return ret;
    }

    public boolean zeroMore2(int n){
        int k = 1, ret = 0,q=0;
        while (n != 0) {
            ret=n%10;
            if(ret==0){
                q++;
            }else q=0;
            if(q>2) return false;
            n=n/10;

        }
        return true;
    }
}
