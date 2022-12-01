package com.proiect1;

import jdk.jfr.DataAmount;


public class Masina implements Comparable<Masina> {
    private long vin;
    private String name;
    private int year;

    public Masina(int vin,String name,int anFabricatie){
        this.vin=vin;
        this.name=name;
        this.year=year;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object car){
        Masina m=(Masina) car;
        return this.vin== m.getVin();
    }


    public int compareTo(Masina m){
        if(this.vin==m.getVin()){
            return 0;
        }else{
            if(this.vin>m.getVin()){
                return 1;
            }
        }
        return -1;
    }


    public String toString(){
        return this.name;
    }
}
