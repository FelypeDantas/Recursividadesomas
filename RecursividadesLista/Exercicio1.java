package RecursividadesLista;

import javax.swing.JOptionPane;
public class Exercicio1 {
  public static void main(String[] args) {
	  int N;
	  
	  N = Integer.parseInt(JOptionPane.showInputDialog("Informe até onde irá a soma: "));
	  System.out.println("A soma será: " + Soma(N));
  }

private static int Soma(int n) {
	if(n == 0) {
		return n;
	}
	return n + Soma(n-1);
}
}
