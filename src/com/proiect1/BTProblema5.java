package com.proiect1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BTProblema5 {
    private ArrayList<Integer> data=new ArrayList<Integer>(List.of(0,1,2,3,4,5,6,7,8,9)) ;
    private int m;
    private int q;
    public BTProblema5(Integer m,Integer q){
        this.m=m;
        this.q=q;
    }

    public ArrayList<Integer> solutieP5(){
        Aranjament p=new Aranjament(data,m);
        p.back(0);
        return (ArrayList<Integer>) p.getSolutions().stream().filter(b->{
            ArrayList<Integer> c=(ArrayList<Integer>) b;
            return c.stream().reduce(0,(x,y)->x+y)==q&&c.get(0)!=0;
        }).map(a->{
            int k=1,rez=0;
            for(int i=((ArrayList<Integer>) a).size()-1;i>=0;i--){
                rez+=((ArrayList<Integer>) a).get(i)*k;
                k=k*10;
            }
            return rez;
        }).collect(Collectors.toCollection(ArrayList<Integer>::new));
    }




}
