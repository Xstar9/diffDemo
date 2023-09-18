package com.example;

/**
 * @author: scott.lin
 * @description:
 * @date: Created in 2019/5/20 10:45
 * @modified By:
 */
public class Math {
    public int multiply(int a,int bb){
        if(a==0) return 0;
        else return a*bb;
    }

    public int devide(int a,int bb){
        if( bb == 0)    return 999999999;
        else return a/bb;
    }

    public int square(int c){
        return c*c;
    }



    public int double_call(int a){
        return devide(a,a);
    }
}
