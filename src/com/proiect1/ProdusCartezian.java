package com.proiect1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProdusCartezian<K,U> {
    protected ArrayList<K> data1;
    protected ArrayList<U> data2;

    protected HashMap<K,ArrayList<U>> produsCartezian;
    
    public ProdusCartezian(ArrayList<K> data1,ArrayList<U> data2){
        this.data1=data1;
        this.data2=data2;
        this.produsCartezian=new HashMap<>();


    }

    public void tipareste(){
        for (K k :produsCartezian.keySet()
             ) {

            for(int i=0;i<produsCartezian.get(k).size();i++){
                System.out.println("{"+k+","+produsCartezian.get(k).get(i)+"}");
            }

        }
    }

    protected boolean validate(HashMap<K,U> map){
        if(produsCartezian.containsKey(map.keySet().iterator().next())){
            if(produsCartezian.get(map.keySet().iterator().next()).contains(map.values().iterator().next())){
                return false;
            }
        }
        return true;

    }
    public void back(int k){
        for(int i=0;i<data1.size();i++){
            for(int j=0;j<data2.size();j++){
                HashMap<K,U> produs=new HashMap<>();
                produs.put(data1.get(i),data2.get(j));
                if(validate(produs)){
                    ArrayList<U> valori=produsCartezian.get(data1.get(i));
                    if(valori==null){
                        valori=new ArrayList<>();
                    }
                    valori.add(data2.get(j));
                    produsCartezian.put(data1.get(i),valori);
                    back(k+1);
                }

            }
        }
    }
    
}
