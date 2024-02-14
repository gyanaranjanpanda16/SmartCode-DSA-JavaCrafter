package com.gyanaranjan.StringProgram01;

public class ImmutableClass {
    private  int i;

    public ImmutableClass(int i) {
        this.i = i;
    }
    public ImmutableClass modify(){
        if(this.i ==i){
            return this;
        }
        return ( new ImmutableClass(i));
    }

    public static void main(String[] args) {

    }
}
