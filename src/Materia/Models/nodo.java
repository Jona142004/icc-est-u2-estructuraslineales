package Materia.Models;

public class nodo {
    private int value;
    private nodo next;
    

    public nodo(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "nodo [value=" + value +  "]";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }
    

}
