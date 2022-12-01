package com.proiect1;

import java.util.ArrayList;
import java.util.List;

//"*---" "-*---" "--*-" "---*"
public class AseazaRegine {
    private int n;
    private ArrayList<String> varianta;
    private ArrayList<ArrayList<String>> data;
    private ArrayList<ArrayList<String>> solutie;
    private int nrReg;
    public AseazaRegine(int n){
        this.n=n;
        this.nrReg=0;
        this.data=new ArrayList<>();
        this.solutie=new ArrayList<>();

        this.varianta=new ArrayList<>();
        for(int i=0;i<n;i++){
            initVarianta();
            for(int k=0;k<n;k++){
                  if(k==i){
                      varianta.set(k,"*");
                  }
            }
            data.add(varianta);
            solutie.add(new ArrayList<>());
        }
    }

    public boolean isSolutie(int k){
        return k==n;
    }

    private boolean validate(int k){
        System.out.println("Testez "+k);
        if(k>0){
            for(int i=0;i<k;i++){
                int crtLine=solutie.get(i).indexOf("*");
                int finLine=solutie.get(k).indexOf("*");
                if(crtLine==finLine){
                    return false;
                }else{
                    if(finLine==crtLine-1||finLine==crtLine+1){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void initVarianta(){
        varianta=new ArrayList<>();
        for(int i=0;i<n;i++){
            varianta.add("-");
        }

    }

    public void back(int k){
        System.out.println("k="+k);
        for(int i=0;i<data.size();i++){
            solutie.set(k,data.get(i));
            System.out.println("Pun "+data.get(i).toString());
            System.out.println(validate(k));
            if(validate(k)){
                if(isSolutie(k)){
                    System.out.println(solutie.toString());
                }else{
                    back(k+1);
                }
            }
        }
    }

    public String toString(){
        String x="";
        for(int i=0;i<n;i++){
            x+=data.get(i)+"\n";
        }
        return x;
    }

}
