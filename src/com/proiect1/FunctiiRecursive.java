package com.proiect1;

public class FunctiiRecursive {

    public static int f1(int a, int b) {
        if (b < 1) {
            return -1;
        } else {
            if (a % b == 0) {
                return 1 + f1(a / b, b);
            } else {
                return 0;
            }
        }
    }

    public static int f2(long n,int k){
        if(n!=0){
            if(n%10==k){
                return 1+f2(n/10,k);
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }

    public static int f3(int n,int y){
        if(n!=0){
            y=y+1;
            return y+f3(n-1,y);
        }else return 0;
    }

    public static void f4(int x,int y){

        for(int i=x;i<=y;i++){
            System.out.println(i);
            f4(i+1,y);
        }
    }

    public static void f5(int x){
        if(x<=9){
            System.out.println(x+1+",");
            f5(x+2);
            System.out.println(x+3+",");
        }
    }

    public static int f6(int x, int y){
        if(x<y) return 1+f6(x+1,y);
        if(y<x) return 1+f6(y+1,x);
        return 1;
    }
}
