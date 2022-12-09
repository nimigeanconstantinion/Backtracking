package com.proiect1;

import java.util.ArrayList;
import java.util.HashMap;

public class ProdusCartezian2<K>{
    protected ArrayList<K> multime1;
    protected ArrayList<K> multime2;
    protected ArrayList<K> produs;
    protected ArrayList<ArrayList<K>> solutie;


    public ProdusCartezian2(ArrayList<K> multime1,ArrayList<K> multime2){
        this.multime1=multime1;
        this.multime2=multime2;
        this.solutie=new ArrayList<>();
        produs=new ArrayList<>();
        produs.add(null);
        produs.add(null);
    }

    protected boolean valid(int k){

        if(k==0&&!multime1.contains(produs.get(k))){
            return false;
        }
        return true;
    }

    protected boolean solutie(int k){
        return k==1;
    }

    protected void tipareste(){
        System.out.println("{"+produs.get(0)+","+produs.get(1)+"}");
        this.solutie.add(produs);
    }


    public void back(int k){
        int n_m=k==0? multime1.size():multime2.size();

        for(int j=0;j<n_m;j++){


            if(k==0){
                produs.set(k,multime1.get(j));
            }else{
                produs.set(k,multime2.get(j));

            }

            if(valid(k)){
                if(solutie(k)){
                    tipareste();
                }else{
                    back(k+1);
                }
            }

        }

    }

    public ArrayList<ArrayList<K>> getSolutie(){
        return solutie;
    }
}
