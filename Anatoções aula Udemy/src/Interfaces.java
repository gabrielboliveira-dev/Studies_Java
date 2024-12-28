/*
###1 Interface

Interface é um tipo que define um conjunto de operações que umaclasse deve implementar.
Pra quê interfaces?
• Para criar sistemas com baixo acoplamento e flexíveis.
A interface estabelece um contrato que a classe deve cumprir.


O que é uma interface em Java?
Em Java, uma interface é um tipo de coapenas a assinatura dos métodos. Uma interface pode ser vista como uma forma de garantir que várias classes diferentes sigam você

As interfaces são fundamentais na programação orientada a objetos , pois permitem:

Abstração : Você define "o que fazer" (assinatura dos métodos) sem se preocupar com "como fazer".
Polimorfismo : Classes diferentes podem implementar a mesma interface de formas distintas.
Flexibilidade e desacoplamento : Permite trabalho

// Definição da interface
public interface Animal {
    void emitirSom();  // Método abstrato
}

// Classe que implementa a interface
public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au");
    }
}


O que é uma interface em Java?
Em Java, uma interface é um tipo de coapenas a assinatura dos métodos. Uma interface pode ser vista como uma forma de garantir que várias classes diferentes sigam você

As interfaces são fundamentais na programação orientada a objetos , pois permitem:

Abstração : Você define "o que fazer" (assinatura dos métodos) sem se preocupar com "como fazer".
Polimorfismo : Classes diferentes podem implementar a mesma interface de formas distintas.
Flexibilidade e desacoplamento : Permite trabalho
Como declarar uma interface em Java
A sintaxe básica para criar uma interface é:

Java

Copiar código
public interface MinhaInterface {
    void metodo1(); // Método abstrato (sem corpo)
    void metodo2();
}
Implementação de uma Interface
Para implementar uma interface em uma classe, usamos a palavra-chave implements. Todas as classes que implementam uma interface devem fornecer a implementação dos métodos definidos nela.

Exemplo básico:

Java

Copiar código
// Definição da interface
public interface Animal {
    void emitirSom();  // Método abstrato
}

// Classe que implementa a interface
public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au");
    }
}
Características Principais das Interfaces em Java
Métodos Abstratos :

Todos os métodos declarados em uma interface são, por padrão:
public: Podem ser acessados ​​por qualquer classe.
abstract: Não possui implementação (até o Java 7).
Você não precisa escrever especificamente publicou abstract:

Java

Copiar código
public interface MinhaInterface {
    void metodo(); // Isso já é "public abstract" por padrão.
}
Constantes :

Como as interfaces podem conter variáveis, mas elas são implicitamente públicas, estáticas e finais ( public static final).
Java

Copiar código
public interface Configuracoes {
    int MAX_USUARIOS = 100; // É automaticamente public static final
}
Herança Múltipla de Interfaces :

Uma classe pode implementar múltiplas interfaces, permitindo herança múltipla.
Java

Copiar código
public interface A {
    void metodoA();
}

public interface B {
    void metodoB();
}

public class MinhaClasse implements A, B {
    @Override
    public void metodoA() {
        System.out.println("Implementando método A");
    }

    @Override
    public void metodoB() {
        System.out.println("Implementando método B");
    }
}
Herança entre Interfaces :

Uma interface pode herdar outra interface.
Java

Copiar código
public interface Pai {
    void metodoPai();
}

public interface Filho extends Pai {
    void metodoFilho();
}
Interfaces no Java 8, 9 e posteriores
A partir do Java 8, a funcionalidade das interfaces foi ampliada significativamente:

Métodos Padrão :

As interfaces podem ter métodos com implementação padrão usando a palavra-chave default.
Isso permite que novas funcionalidades sejam adicionadas às interfaces existentes sem quebrar o código das classes que já foram implementadas.
Java

Copiar código
public interface Calculadora {
    void somar(int a, int b); // Método abstrato

    default void mensagem() {
        System.out.println("Método padrão na interface");
    }
}
Métodos Estáticos :

As interfaces podem conter métodos estáticos que podem ser chamados diretamente pela interface.
Java

Copiar código
public interface Utils {
    static void mostrarMensagem() {
        System.out.println("Método estático em uma interface");
    }
}

public class Teste {
    public static void main(String[] args) {
        Utils.mostrarMensagem();
    }
}
Métodos Privados (Introduzidos no Java 9):

Interfaces podem ter métodos privados que são usados ​​apenas internamente para compartilhar lógica entre métodos defaultou static.
Java

Copiar código
public interface Exemplo {
    default void metodo1() {
        helper(); // Chamando método privado
    }

    default void metodo2() {
        helper();
    }

    private void helper() {
        System.out.println("Método privado dentro da interface");
    }
}
Quando usar interfaces?
As interfaces são particularmente úteis nos seguintes cenários:

Definição de Contratos :

Quando você quer garantir que diferentes classes forneçam um comportamento específico, mesmo que a implementação seja diferente.
Exemplo: Classes Carroe Aviãopodem implementar uma interface Veiculo.
Polimorfismo :

Quando você deseja tratar objetos de diferentes classes de forma uniforme, baseando-se apenas na interface que eles implementam.

Herança Múltipla :

Como Java não suporta herança múltipla de classes, você pode usar interfaces para atingir esse objetivo.
 */