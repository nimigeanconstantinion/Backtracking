package com.proiect1;

import java.util.ArrayList;

public class PermutareRegine extends Permutare{


    public PermutareRegine(ArrayList<String> data){
        super(data);
    }

    @Override
    protected void tipar(){
        if(checkSolution(super.permutare)){
            System.out.println(super.permutare.toString());
        }

    }

    //todo:functie ce primeste ca prametru p lista cu stringuri si verifica daca sunt 2 * linie sa

    protected boolean checkSolution(ArrayList<String> lista){
        for (int i=0;i<lista.size()-1;i++){
            for(int j=i+1;j<lista.size();j++){
                if(lista.get(i).indexOf("*")==lista.get(j).indexOf("*")||
                        lista.get(i).indexOf("*")==lista.get(j).indexOf("*")+j-i||
                        lista.get(i).indexOf("*")==lista.get(j).indexOf("*")-j+i){
                    return false;
                }
            }

        }
        return true;
    }


}
