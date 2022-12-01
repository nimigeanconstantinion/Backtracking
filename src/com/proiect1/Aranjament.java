package com.proiect1;

import java.util.ArrayList;

public class Aranjament<K> extends  Permutare<K>{

    private ArrayList<K> data;
    private int m;

    public Aranjament(ArrayList<K> data,int m){
        super( data);

        ArrayList<K> permutare=new ArrayList<>();

        for(int i=0;i<m;i++){
            permutare.add(null);
        }
        super.setPermutare(permutare);
    }

    protected boolean solutie(int k){
       return k==m-1;
    }


}
