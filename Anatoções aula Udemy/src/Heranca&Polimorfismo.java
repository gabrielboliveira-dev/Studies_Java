/*
###1 Herança

É um tipo de associação que permite que uma classe herde todos dados e
comportamentos de outra

Vantagens
• Reuso
• Polimorfismo

Sintaxe
• class A extends B

Definições importantes
• Relação "é-um"
• Generalização/especialização
• Superclasse (classe base) / subclasse (classe derivada)
• Herança / extensão
• Herança é uma associação entre classes (e não entre objetos)

###2 Upcasting e downcasting

Upcasting
• Casting da subclasse para superclasse
• Uso comum: polimorfismo

Downcasting
• Casting da superclasse para subclasse
• Palavra instanceof
• Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)

###3 Sobreposição

É a implementação de um método de uma superclasse na subclasse

• É fortemente recomendável usar a anotação @Override em um método
sobrescrito
• Facilita a leitura e compreensão do
código
• Avisamos ao compilador (boa prática)

###4 Classes e métodos final

Palavra chave: final

• Classe: evita que a classe seja herdada
public final class SavingsAccount {
• Método: evita que o método sob seja sobreposto

• Segurança: dependendo das regras do negócio, às vezes é desejável
garantir que uma classe não seja herdada, ou que um método não
seja sobreposto.
• Geralmente convém acrescentar final em métodos sobrepostos, pois
sobreposições múltiplas podem ser uma porta de entrada para
inconsistências
• Performance: atributos de tipo de uma classe final são analisados de
forma mais rápida em tempo de execução.
• Exemplo clássico: String

###5 Polimorfismo

Em Programação Orientada a Objetos, polimorfismo é recurso que
permite que variáveis de um mesmo tipo mais genérico possam
apontar para objetos de tipos específicos diferentes, tendo assim
comportamentos diferentes conforme cada tipo específico.

Account x = new Account(1020, "Alex", 1000.0);
Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

x.withdraw(50.0);
y.withdraw(50.0);

A associação do tipo específico com o tipo genérico é feita em tempo de
execução (upcasting).

O compilador não sabe para qual tipo específico a chamada do método
Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account):

###6 Classes abstratas

São classes que não podem ser instanciadas

• É uma forma de garantir herança total: somente subclasses não
abstratas podem ser instanciadas, mas nunca a superclasse abstrata

###7 Métodos abstratos

São métodos que não possuem implementação.

• Métodos precisam ser abstratos quando a classe
é genérica demais para conter sua implementação.

• Se uma classe possuir pelo menos um método
abstrato, então esta classe também é abstrata.
 */