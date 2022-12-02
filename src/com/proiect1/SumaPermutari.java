package com.proiect1;

import javax.management.ObjectName;
import java.util.ArrayList;
//todo: se da un numar n , sa se afiseze suma permutarilor cifrelor
public class SumaPermutari extends Permutare{

    private int n;
    private long suma;
    private ArrayList<Integer> data;
    public SumaPermutari(ArrayList<Integer> data){
        super(data);
        ArrayList<Integer> permutare=new ArrayList<>();
        for(int i=0;i<data.size();i++){
            permutare.add(null);
        }
        super.setPermutare(permutare);
        suma=0;


    }

    protected void tipar(){
        String nr="";
        System.out.println(super.permutare.toString());
        for(int i=0;i<super.permutare.size();i++){
            nr=nr+String.valueOf(super.permutare.get(i));
        }
        suma+=Integer.valueOf(nr);
        System.out.println(suma);
    }

    public void sumaPerm(){
        System.out.println("suma este= "+suma);
    }
}
