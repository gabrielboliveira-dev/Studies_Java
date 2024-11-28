/* 
###1 Operadores aritimétricos

+: adição
-: subtração
*: multiplicação
/: divisão
%: mod

###2 Variáveis e tipos primitivos em Java

Tipos numéricos inteiros:
byte
short
int
long

Tipos numéricos com ponto flutuante:
float
double

Um caractere Unicode:
char

Valor verdade:
boolean

Cadeia de caracteres:
String

<tipo> <nome> = valor;

###3 Sáida de dados

Sem quebra de linha ao final:
System.out.print("Bom dia!");

Com quebra de linha ao final:
System.out.println("Bom dia!");

Para escrever o conteúdo de uma variável
System.out.println(y);

Para escrever o conteúdo de uma variável com ponto flutuante
System.out.printf("%.2f%n", x);
System.out.printf("%.4f%n", x);

ATENÇÃO:
Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
Locale.setDefault(Locale.US);

Para concatenar vários elementos em um mesmo comando de escrita
System.out.println("RESULTADO = " + x + " METROS");

###4 Entreda de dados

Scanner sc = new Scanner(System.in);
import java.util.Scanner;
faça sc.close() quando não precisar mais do objeto sc

x = sc.next();
• next()
• nextInt()
• nextDouble()
• next().charAt(0)

 Como ler até a quebra de linha
• nextLine()

###5 Funções matemáticas

A = Math.sqrt(x); Variável A recebe a raiz quadrada de x
A = Math.pow(x, y); Variável A recebe o resultado de x elevado a y
A = Math.abs(x); Variável A recebe o valor absoluto de x
 */