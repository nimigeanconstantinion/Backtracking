package com.proiect1;

import java.util.ArrayList;
import java.util.List;

public class BTProblema8 {
    private ArrayList<String> data;
    private ArrayList<String> baieti,fete;
    private ArrayList<ArrayList<String>> echipaFete;
    private int b,f;
    public BTProblema8(){
        this.f=2;
        this.baieti=new ArrayList<>(List.of("Alin","Bogdan","Calin"));
        this.fete=new ArrayList<>(List.of("Dana","Elena","Flavia"));
        this.echipaFete=new ArrayList<>();
    }


    public void solutie(){
        echipaFete=makeEchipaFete();
        ProdusCartezian2 prod=new ProdusCartezian2(baieti,echipaFete);
        prod.back(0);

    }

    public ArrayList<ArrayList<String>> makeEchipaFete(){
        Combinare cb=new Combinare(fete,f);
        cb.back(0);
        return cb.getSolutions();
    }
}
