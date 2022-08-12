// Faça uma função que recebe dois vetores A e B de números reais (13 elementos cada) como parâmetro, uma função deverá retornar a soma do menor número de A pelo maior número B.
// Dicas:
// - Use laços de repetição para percorrer os vetores A e B;
// - Use condicionais para encontrar os elementos dentro dos vetores A e B.


Import java.util.Scanner;
public class Q2 {
static void pimpolho (float [] va, float[] vb){
float ma= va[0];
float mb= vb[1];
float soma=0;
for(int i=0;i&lt;va.length;i++){
if(ma &gt; va[i]){
ma=va[i];
}
}
for(int i=0;j&lt;vb.length;i++){
if(mb &lt; vb[i]){
mb=vb[i];
}
}
soma= ma+mb;
System.out.println(&quot;Somando o menor numero A &quot;+ma+ &quot; com o maior numero B &quot;+mb+ &quot; resulta em: &quot;+soma);
}
public static void main(String[] args) {
float[] va= {2,2,7,9,2,1,9,8,9,2,3,4,7};
float[] vb= {7,6,5,4,3,2,1,1,2,3,4,5,6};
vetor(va, vb);
}
}
