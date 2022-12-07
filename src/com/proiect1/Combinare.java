package com.proiect1;

import java.util.ArrayList;
import java.util.Collections;

public class Combinare<K extends Comparable<K>> extends Permutare<K>{

    private ArrayList<K> data;
    private ArrayList<ArrayList<K>> solutions;
    private int m;

    public Combinare(ArrayList<K> data,int m){
        super( data);
        this.m=m;

        ArrayList<K> permutare= new ArrayList<>();

        for(int i=0;i<m;i++){
            permutare.add(null);
        }

        super.setPermutare(permutare);
        solutions=new ArrayList<>();
    }

    protected boolean solutie(int k){
        if(k==m-1){
            ArrayList<K> pm=new ArrayList<>();
            pm=(ArrayList<K>) permutare.clone();
            this.solutions.add(pm);
            return true;
        }
       return false;
    }

    protected boolean validate(int k){
        for(int i=0;i<k;i++){
            if(permutare.get(i).compareTo(permutare.get(i+1))>=0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<ArrayList<K>> getSolutions(){
        return solutions;
    }
}
