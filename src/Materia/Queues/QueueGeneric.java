package Materia.Queues;

import java.util.EmptyStackException;

import Materia.Models.Node;
import Materia.Models.NodeGeneric;

public class QueueGeneric <T> {
    private NodeGeneric<T> front;
    private NodeGeneric<T> rear;
    private int size;

    public QueueGeneric() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Metodo para agregar un elemento a la pila

    public void push(T data){
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(front);
        front = newNode;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = front.getValue();
        front = front.getNext();
        size--;
        return value;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void QueueStack(){
        NodeGeneric<T> current = front;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext(); 
        }
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return front.getValue();
    }

    public int getSize(){
        int cont = 0;
        NodeGeneric<T> current = front;
        while (current != null) {
            cont++;
            current = current.getNext();
        }
        return cont;
    }
    public NodeGeneric<T> popNode(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        NodeGeneric<T> value = front;
        front = front.getNext();
        size--;
        return value;
    } 
    public void printQueueGeneric(){
        NodeGeneric<T> current = front;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
            
        }
    }
    
   
}
