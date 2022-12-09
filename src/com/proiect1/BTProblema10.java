package com.proiect1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BTProblema10 {

    private ArrayList<Integer> data,target;
    private ArrayList<ArrayList<Integer>> solutie;

    private int n;

    public BTProblema10(){
        this.data=new ArrayList<>(List.of(3,5,7));
        this.target=new ArrayList<>(List.of(0,1,2,3,4));
        this.solutie=new ArrayList<>();
        for(int i=0;i<5;i++){
            solutie.add(null);
        }
        this.n=0;
    }


    public void afiseaza(){
        n++;
        System.out.println("----------------"+n+"--------------------");
        System.out.println(solutie.stream().map(p->p.get(1)).reduce(0,(i,val)->i*10+val));

    }

    private boolean validate(int k){
        for(int i=0;i<k;i++){
            if(isEqual(solutie.get(i),solutie.get(k))) return false;
        }
        return true;
    }


    private boolean isEqual(ArrayList<Integer> a,ArrayList<Integer>b){

            return a.get(0)==b.get(0);


    }
    public void back(int k){
            for(int i=0;i<3;i++){
               solutie.set(k,new ArrayList<Integer>(List.of(k,data.get(i))));
               if(validate(k)){
                    if(k==4){
                        afiseaza();
                    }else back(k+1);
               }
            }
    }
}
