package com.proiect1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BTProblema9 {
    private ArrayList<Integer> data;
    private int n;

    public BTProblema9(int n){
        this.data=new ArrayList<>(List.of(0,2,4,6,8));
        this.n=n;
    }

    public void solutionP9(){
        Aranjament ar=new Aranjament(data,n);
        ar.back(0);
        ArrayList<ArrayList<Integer>> lista=(ArrayList<ArrayList<Integer>>) ar.getSolutions();
        ArrayList<Integer> lista2= lista.stream()
                .filter(x->x.get(0)!=0)
                .map(x->{
                    int k=1,rez=0;
                    for(int i=x.size()-1;i>=0;i--){
                        rez=rez+x.get(i)*k;
                        k=k*10;
                    }
                    return rez;
                })
                .collect(Collectors.toCollection(ArrayList<Integer>::new));
        System.out.println(lista2);
    }

}
