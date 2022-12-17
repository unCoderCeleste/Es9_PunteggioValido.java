/*
Esercizio 9:
Scrivere un codice che verifichi che la variabile intera punteggio
contenga un valore valido.
Si supponga che i valori siano validi se sono compresi tra 0 e 100
 */
import java.util.Scanner;
public class Es9_PunteggioValido {
    public static void main(String[] args) {
        Scanner punt= new Scanner(System.in);
        System.out.println("PUNTEGGIO VALIDO.");
        System.out.print("Ingressi il punteggio (tra 0 e 100): ");
        int punteggio= punt.nextInt();
        if(punteggio>0 && punteggio<100){
            System.out.println("\nIl punteggio è valido!");
        }
        else{
            System.out.println("\nIl punteggio NON è valido!");
        }
    }
}