package com.proiect1;

import java.util.ArrayList;
import java.util.Collections;

public class Combinare<K extends Comparable<K>> extends Permutare<K>{

    private ArrayList<K> data;
    private int m;

    public Combinare(ArrayList<K> data,int m){
        super( data);
        this.m=m;

        ArrayList<K> permutare= new ArrayList<>();

        for(int i=0;i<m;i++){
            permutare.add(null);
        }
        super.setPermutare(permutare);
    }

    protected boolean solutie(int k){
       return k==m-1;
    }
    protected boolean validate(int k){
        for(int i=0;i<k;i++){
            if(permutare.get(i).compareTo(permutare.get(i+1))>=0){
                return false;
            }
        }
        return true;
    }

}
