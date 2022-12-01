package com.proiect1;

import java.util.ArrayList;

public class Permutare<K> {

    protected ArrayList<K> data;

    protected ArrayList<K> permutare;

    public Permutare(ArrayList<K> data) {
        this.data = data;
        permutare= new ArrayList<>();
        for(int i=0;i<data.size();i++){
            permutare.add((K) new Object());
        }

    }

    protected void tipar(){

        for(int i=0;i<permutare.size();i++){
            System.out.println(permutare.get(i)+",");
        }
        System.out.println("=================");
    }

    protected boolean validate(int k){




        for(int i=0;i<k;i++){

            if(permutare.get(k).equals(permutare.get(i))){
                return  false;
            }
        }

        return true;

    }


    protected boolean solutie(int k){

        if(k==data.size()-1){
            return true;
        }
        return false;
    }

    public void back(int k){
        for(int i=0;i<data.size();i++){
            permutare.set(k,data.get(i));
            if (validate(k)) {
                if(solutie(k)){
                    tipar();
                }else{
                    back(k+1);
                }
            }
        }
    }


    protected  void setPermutare(ArrayList<K> permutare){

        this.permutare=permutare;

    }


}
