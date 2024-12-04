package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.nodo;

public class Stack {
    private nodo top; // nodo en la cima de nuestra pila.
    private int size;
    //Creamos la pila con la cima nula o vacia.
    public Stack(){
        this.top = null;
    }
    public void push(int value){
        nodo newnodo = new nodo(value);
        newnodo.setNext(top);
        top = newnodo;
        size++;

    }
    public int  pop(){
        if (isEmpty()) {
           throw new EmptyStackException(); 
        }
        int value = top.getValue();
        top = top.getNext();
        size --;
        return value;
        
    }
    public boolean isEmpty(){
        return top == null;

    }
    //Metodo que retorna el valor del nodo de la cima
    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }
    public void printStack(){
        nodo current =  top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
            
        }
    }
    public int getSize2(){
        int cont = 0;
        nodo current = top;
        while (current != null) {
            cont ++;
            current = current.getNext();
        }
        return cont;
    }
    public int getSize(){
        return size;
    }
}
