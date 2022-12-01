package com.proiect1;

import java.util.ArrayList;
import java.util.List;

public class Anagrame<K> extends Permutare<K>{

    protected ArrayList<K> data;
    protected String vocale;
    public Anagrame(ArrayList<K> data){
        super(data);
        this.vocale="aeiou";
    }

    @Override
    protected boolean validate(int k) {
        for(int i=0;i<k;i++){
            if(super.permutare.get(i).equals(super.permutare.get(k))            ){
                return false;
            }else{
                if((isVocala((String) permutare.get(k-1))&&isVocala((String) permutare.get(k))||
                        (!isVocala((String) permutare.get(k-1))&&!isVocala((String) permutare.get(k))))){
                    return false;
                }
            }
        }
        return true;

    }
    private boolean isVocala(String m){
        return vocale.contains(m);
    }
}
