package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Cada uno de los tipos primitivos tiene una clase en java asociada, conocida
        //como clase Wrapper o Envolvente del tipo primitivo:
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        //para que vamos a utilizar estas clases envolventes en lugar de los tipos?
        //basicamente es porque las clases contienen atributos y metodos, a diferecia de 
        //los tipos primitivos solamente almacenan un valor pero o tienen ni atributos ni metodos.
        //Asi que si queremos utilizar solamente objetos en java, entonces podemos utilizar estas clases
        //evolventes, ahora un detalle es que si utilizamos el tipo primitivo (int).
        
        Integer entero = 10;//Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        
        int entero2 = entero;//Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
