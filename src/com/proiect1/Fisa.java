package com.proiect1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fisa {

    private int n;
    private List sl;
    private ArrayList<Integer> numere;
    private Set<Integer> ts;
    public Fisa(int n){
        this.n=n;
        numere=new ArrayList<>();
        for (int i=0;i<=n;i++){
            this.numere.add(i);
        }
    }

    public void solutieP1(){
         sl=new ArrayList();
        for(int i=2;i<n;i++){
            Aranjament ar=new Aranjament(numere,i);
            ar.back(0);

            ArrayList<ArrayList<Integer>> s=new ArrayList<>();
            s=ar.getSolutions();

            sl.addAll(s.stream().filter(f->f.stream().reduce(0,(a, b)->a+b)==n).collect(Collectors.toList()));

        }
        ts=new HashSet<>();
        ts=  (Set<Integer>) sl.stream().map(s->{
            ArrayList<Integer> v=(ArrayList<Integer>) s;
            int k=1;
            int rez=0;
            for(int i=v.size()-1;i>=0;i--){
                rez+=v.get(i)*k;
                k=k*10;
            }
            return rez;
        }).collect(Collectors.toSet());
        System.out.println(ts);

    }

    public void solutieP2(){
     solutieP1();
        System.out.println(ts.stream().map(j->{
          int p=1,x=j;
          while(x!=0){
              p=p*x%10;
              x=x/10;
          }
            return p;
       }).max(Integer::compare).get());;
    }




}
