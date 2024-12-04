import Materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        runStack();
        
        
        
    }

    public static void runStack(){
        Stack stack = new Stack();
        int ingresada = 10;
        //agregar elementos
        stack.push(5);
        stack.push(7);
        stack.push(ingresada);

        stack.push(20);
        stack.printStack();
        int cont = stack.getSize();
        System.out.println("Tamanio -->" + cont);
        int cont2 = stack.getSize2();
        System.out.println("cont2 -->" + cont2);

        
        System.out.println( "Cima   -->" + stack.peek());
        System.out.println("Retirar-->" + stack.pop());
        System.out.println( "Cima   -->" + stack.peek());
        System.out.println("Retirar-->" + stack.pop());
        System.out.println( "Cima   -->" + stack.peek());
    }
}
