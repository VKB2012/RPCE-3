import java.util.LinkedList;
public class Quatro { public static void main(String[] args) {
    LinkedList<String> elementos = new LinkedList<String>();
    elementos.addFirst("Ouro");
    elementos.add(1,"Prata");
    elementos.add(2,"Bronze");
    elementos.add(3,"Plastico");
    elementos.addLast(null);

    System.out.println(elementos);
}}
