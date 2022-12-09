package com.proiect1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BTProblema1 {
    private int m;
    private ArrayList<Integer> data;

    public BTProblema1(int m){
        this.data=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        this.m=m;
    }

    public ArrayList<Integer> solutieP1(){
        Aranjament aranjament=new Aranjament(data,m);
        aranjament.back(0);
        return (ArrayList<Integer>) aranjament.getSolutions().stream().map(v->{
                        ArrayList<Integer> g=(ArrayList<Integer>) v;
                        int n=1;
                        int result=0;
                        for(int k=g.size()-1;k>=0;k--){
                            result+=g.get(k)*n;
                            n*=10;
                        }
                        return result;

        }).sorted().collect(Collectors.toCollection(ArrayList<Integer>::new));
    }

    public ArrayList<Integer> solutieP2(){
        Aranjament aranjament=new Aranjament(data,m);
        aranjament.back(0);
        return (ArrayList<Integer>) aranjament.getSolutions().stream().filter(f->{
            ArrayList<Integer> g=(ArrayList<Integer>) f;
           return g.stream().filter(h->h%2!=0).collect(Collectors.toList()).size()==3;
        }).map(v->{
            ArrayList<Integer> g=(ArrayList<Integer>) v;
            int n=1;
            int result=0;
            for(int k=g.size()-1;k>=0;k--){
                result+=g.get(k)*n;
                n*=10;
            }
            return result;

        }).sorted().collect(Collectors.toCollection(ArrayList<Integer>::new));
    }
}
