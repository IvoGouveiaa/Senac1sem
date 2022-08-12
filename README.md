# Senac1sem
1 semestre Senac 
import java.util.Scanner;
public class Q1 {
Scanner sc = new Scanner(System.in);
static char []sex (){
Scanner sc = new Scanner(System.in);
char vs[] = new char [5];
for (int i=0; i &lt; vs.length;i++){
System.out.println(&quot;Insira seu sexo: &quot;);
vs [i] = sc.next().charAt(0);
}
return vs;
}
static char []zoio (){
Scanner sc = new Scanner(System.in);
char vo[] = new char [5];
for (int i=0; i &lt; vo.length;i++){
System.out.println(&quot;Insira a cor do seu olho: &quot;);
vo [i] = sc.next().charAt(0);
}
return vo;
}
static char []cabelera (){
Scanner sc = new Scanner(System.in);
char vc[] = new char [5];
for (int i=0; i &lt; vc.length;i++){
System.out.println(&quot;Insira a cor do seu cabelo: &quot;);
vc [i] = sc.next().charAt(0);
}
return vc;
}
static int []idade (){
Scanner sc = new Scanner(System.in);
int vi [] = new int [5];
for (int i=0; i &lt; vi.length;i++){
System.out.println(&quot;Insira sua idade: &quot;);
vi [i] = sc.nextInt();
}
return vi;
}
static float creu(int vetor[], char cab[], char oio[]){
float media=0;
float qnt=0;
for(int i=0;i&lt;vetor.length;i++) {
if(cab[i]==&#39;P&#39; || oio[i]==&#39;C&#39;) {
media+=vetor[i];
qnt++;
}
}
return (media/qnt);
}
static float mamis (int vetor[]){
int maior=0;
for (int i=0; i&lt;vetor.length;i++){
if(vetor[i]&gt; maior){
maior = vetor[i];
}
}
return (maior);
}
static float eita (int vetor[], char cabe[], char zoio[], char sex[]){
float qnt=0;

for (int i=0; i&lt;vetor.length;i++){
if(cabe[i] ==&#39;L&#39; &amp;&amp; zoio[i] == &#39;A&#39; &amp;&amp; sex[i] == &#39;M&#39; &amp;&amp; (vetor[i]&gt;= 18 || vetor[i]&lt;= 35)){
qnt++;
}
}
return qnt;
}
public static void main(String[] args) {
char sexo []= sex();
char olhos [] = zoio();
char cabelos [] = cabelera();
int idade [] = idade();
System.out.println(&quot;A média da idade das&#39; pessoas com olhos castanho e cabelos pretos &quot;+ creu(idade,
cabelos, olhos));
System.out.println(&quot;A maior idade é: &quot;+ mamis(idade));
System.out.println(&quot;A quantidade de habitantes de olhos azuis, cabelos loiros, do sexo feminino e com a idade
entre 18 e 35 é: &quot;+eita(idade, cabelos, olhos, sexo) );
}
}
