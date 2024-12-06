

import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        runStackGeneric();
        runQueue();
        runQueueGeneric();
    }

    public static void runStack(){

        Stack stack = new Stack();

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        stack.printStack();
        int cont = stack.getSize();
        System.out.println("Tamanio: " + cont);

        System.out.println(stack.getSize2());


        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());
    }

    public static void runStackGeneric(){
        StackGeneric<Pantalla> cola = new StackGeneric<>();
        cola.push(new Pantalla(1, "Home Page", "/home"));
        cola.push(new Pantalla(1, "Menu Page", "/home/menu"));
        cola.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en " + cola.peek().getRuta());
        System.out.println("Regreso a " + ((cola.popNode().getNext().getValue().getRuta())));
        System.out.println("Estoy en " + cola.peek().getRuta());

        cola.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));
        System.out.println("Pantallas = " + cola.getSize());
        System.out.println("Estoy en " + cola.peek().getRuta());
        cola.printStack();
    }
    public static void runQueue(){
        Queue cola =new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        cola.pritnQueue();
        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
        System.out.println("Despues de la implementacion");
        cola.pritnQueue();
        System.out.println("Tam despues de la implementacion");
        System.out.println(cola.getSize());


    }
    public static void runQueueGeneric(){
        QueueGeneric<Pantalla> colaGenerica = new QueueGeneric<>();
        colaGenerica.enqueue(new Pantalla(1, "Home Page", "/home"));
        colaGenerica.enqueue(new Pantalla(1, "Menu Page", "/home/menu"));
        colaGenerica.enqueue(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en " + colaGenerica.peek().getRuta());
        System.out.println("Regreso a " + ((colaGenerica.dequeue().getNext().getValue().getRuta())));
        System.out.println("Estoy en " + colaGenerica.peek().getRuta());

        colaGenerica.enqueue(new Pantalla(1, "Settings Page", "/home/menu/settings"));
        System.out.println("Pantallas = " + colaGenerica.size());
        System.out.println("Estoy en " + colaGenerica.peek().getRuta());
        colaGenerica.printQueueGeneric();

}
}
