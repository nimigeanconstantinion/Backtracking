package com.proiect1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BTProblema4 {
    private ArrayList<Integer> data;
    private int m;

    public BTProblema4(int m){
        this.data=new ArrayList<Integer>(List.of(0,1,2,3,4,5,6,7,8,9));
        this.m=m;
    }

    public ArrayList<Integer> solutieP4(){
            Aranjament p=new Aranjament(data,m);
            p.back(0);
            ArrayList<ArrayList<Integer>> pm=p.getSolutions();
           return pm.stream().filter(x->{
                ArrayList<Integer> v=(ArrayList<Integer>) x;
                int m=v.get(0)%2;
                for(int i=1;i<v.size();i++){
                       int h=v.get(i)%2;
                       if(h==m) return false;
                       m=h;
                }
                return true;
            }).map(z->{
                ArrayList<Integer> g=(ArrayList<Integer>) z;
                int n=1;
                int result=0;
                for(int k=g.size()-1;k>=0;k--){
                    result+=g.get(k)*n;
                    n*=10;
                }
                return result;

            }).sorted().collect(Collectors.toCollection(ArrayList<Integer>::new));
    }
}
