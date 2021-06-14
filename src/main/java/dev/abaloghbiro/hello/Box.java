package dev.abaloghbiro.hello;

import java.io.Serializable;

public class Box <T extends Serializable>{


    private T boxValue;


    public Box(T object){
        this.boxValue = object;
    }

    public T getBoxValue() {
        return boxValue;
    }

    public static void main(String[]args){

        Box<String> b = new Box<String>("Alma");
        Box<Integer> bi = new Box<Integer>(1000);
    }
}
