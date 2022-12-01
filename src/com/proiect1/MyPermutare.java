package com.proiect1;

import java.util.ArrayList;

public class MyPermutare<K> {
    private ArrayList<K> data;
    private ArrayList<K> permutare;


    public MyPermutare(ArrayList<K> data){
        this.data=data;
        permutare=new ArrayList<K>();
        for(int i=0;i<data.size();i++){
            permutare.add((K) new Object());
        }

    }

    private void afisare(){
        for(int i=0;i<permutare.size();i++){
            System.out.print(permutare.get(i)+",");
        }
        System.out.println("");
        System.out.println("----------------------");
    }

    private boolean validare(int k){
        for(int i=0;i<k;i++){
            if(permutare.get(i).equals(permutare.get(k))){
                return false;
            }
        }
        return true;
    }

    private boolean isSolutie(int k){
        return k==data.size()-1;
    }

    public void back(int k){
        for(int i=0;i<data.size();i++){
            permutare.set(k,data.get(i));
            if(validare(k)){
                if(isSolutie(k)){
                    afisare();
                }else{
                    back(k+1);
                }
            }

        }

    }
}
