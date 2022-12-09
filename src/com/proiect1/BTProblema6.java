package com.proiect1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BTProblema6 {
    private int m;
    private ArrayList<Integer> data;

    public BTProblema6(int m){
        this.m=m;
        this.data= new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
    }

    public void solutieP6(){
        Aranjament a=new Aranjament(data,m);
        a.back(0);

        ArrayList<ArrayList<Integer>> lista=(ArrayList<ArrayList<Integer>>) a.getSolutions();
        ArrayList<ArrayList<Integer>> lista5=lista.stream().filter(p->p.get(0)!=0).collect(Collectors.toCollection(ArrayList<ArrayList<Integer>>::new));
        System.out.println("Avem "+lista5.size()+" solutii");
        System.out.println(lista5);
        ArrayList<Integer> lista4= (ArrayList<Integer>) lista5.stream().filter(g->g.get(0)==4)
                .map(n->{
                    int m=1,rez=0;

                    ArrayList<Integer> sol=( ArrayList<Integer>)n;
                    for(int i=sol.size()-1;i>=0;i--){
                        rez=rez+sol.get(i)*m;
                        m=m*10;
                    }
                    return rez;
                }).sorted().collect(Collectors.toList());
        System.out.println(lista4);
        System.out.println("Avem "+lista4.size()+" numere");
    }
}
