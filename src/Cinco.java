import java.util.LinkedList;
import java.util.Scanner;

public class Cinco{public static void main(String[] args) {
    LinkedList<Integer> elementos = new LinkedList<Integer>();
    elementos.addFirst(5);
    elementos.add(1,7);
    elementos.add(2,15);
    elementos.add(3,22);
    elementos.addLast(null);
    Scanner inpu=new Scanner(System.in);
    int input=inpu.nextInt();
    if (elementos.size()==0){System.out.println("Vazio patrao");}
    if(input<elementos.getFirst()){elementos.add(0,input);}
    if(input>elementos.size()-1){elementos.add(elementos.size()-1,input );}
    else{elementos.add(elementos.size()-2,input);}


    System.out.println(elementos);
}
}
