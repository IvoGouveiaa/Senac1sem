//Faça uma função que receba, como parâmetros, dois valores inteiros, L para o número de linhas e C para o número de colunas. Esta função deve criar e preencher uma matrix
//com estas dimensões (podeser solicitando ao usuário os valores ou preenchendo de forma aleatória). Por fim, a função deverá retornar a atrix criada para o método main e
// este, em seguida, deverá mostrar a matriz gerada, no formato de uma matriz no tamanho L e C informado.

import java.util.Scanner;
public class Q3{
static void receba (int [][] matriz, int l, int c){
Random aleat= new Random();
int n = aleat.nextInt(10)+1;
for(int linha=0; linha &lt; l; linha++){
for(int coluna=0; coluna &lt; c;coluna++){
matriz[linha][coluna] += n++;
}

}
for(int linha =0; linha &lt; matriz.length;linha++){
for(int coluna =0; coluna &lt; matriz[linha].length;coluna++){
System.out.print(&quot; &quot;+matriz[linha][coluna]);
}
System.out.println();
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println(&quot;Insira o núemero de linhas: &quot;);
int l = sc.nextInt();
System.out.println(&quot;Insira o núemero de colunas: &quot;);
int c = sc.nextInt();
int matriz[][] = new int [l][c];
receba(matriz,l,c);
}
}
