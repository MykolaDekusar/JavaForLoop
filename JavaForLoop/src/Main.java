
public class Main {

	public static void main(String[] args) {
		//il loop FOR esegue il codice per un tot di volte occhio alla condizione
		//che potrebbe non verificarsi mai e rendere il loop infinito
		//inizializzo i, verifico se è minore di 10, aumento i di 1 alla fine del ciclo
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		//ciclo da 10 a 1
		for(int i =10;i>0;i--) {
			System.out.println(i);
		}
		//posso mettere l'incremento anche all'interno del ciclo
		for(int i=1; i<=10;) {
			System.out.println(i);
			i++;
		}
	}

}
