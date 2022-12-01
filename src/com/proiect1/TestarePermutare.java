package com.proiect1;

import java.util.ArrayList;

public class TestarePermutare {

    private ArrayList<Masina> data;

    public TestarePermutare(){
        this.data=new ArrayList<>();
    }

    public ArrayList<Masina> addMasina(Masina m){
        if(!data.contains(m)){
            data.add(m);
        }
        return data;
    }



}
