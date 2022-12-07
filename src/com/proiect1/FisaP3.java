package com.proiect1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FisaP3 {

    protected ArrayList<String> flori;
    protected int m;
    public FisaP3(ArrayList<String> flori,int m){
        this.flori=(ArrayList<String>) flori.stream().sorted().collect(Collectors.toList());
        this.m=m;
    }

    public ArrayList<ArrayList<String>> solutieP3(){
//        Aranjament<String> ar=new Aranjament<>(flori,m);
//        ar.back(0);
//        return ar.getSolutions().stream().map(g->g.stream().sorted().collect(Collectors.toCollection(ArrayList<String>::new))).filter(p->{
//            ArrayList<String> a=new ArrayList<>();
//            for(int i=0;i<3;i++){
//                if(i>0&&a.contains(String.valueOf(p.get(i).charAt(0)))){
//                    return false;
//                }
//                    a.add(String.valueOf(p.get(i).charAt(0)));
//
//            }
////            for(int j=0;j<p.size();j++){
////                System.out.println(p.get(j));
////            }
////            System.out.println("Adevarat");
//
//            return true;
//        }).collect(Collectors.toSet());
//
        Combinare cb=new Combinare(flori,m);
        cb.back(0);
        System.out.println("********************************************");
        System.out.println(cb.getSolutions().size());
        return cb.getSolutions();
    }
}
