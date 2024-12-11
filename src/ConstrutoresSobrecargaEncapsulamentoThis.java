/*
 ###1 Construtor

• É uma operação especial da classe, que executa no momento da
instanciação do objeto

• Usos comuns:
• Iniciar valores dos atributos
• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua
instanciação (injeção de dependência)

• Se um construtor customizado não for especificado, a classe disponibiliza o
construtor padrão:
Product p = new Product();

• É possível especificar mais de um construtor na mesma classe (sobrecarga)

###2 This 
 É uma referência para o próprio objeto

• Usos comuns:
• Diferenciar atributos de variáveis locais
• Passar o próprio objeto como argumento na chamada de um método ou
construtor

###3 Sobrecarga

• É um recurso que uma classe possui de oferecer mais de uma
operação com o mesmo nome, porém com diferentes listas de
parâmetros.

###4 Encapsulamento

• É um princípio que consiste em esconder detalhes de implementação
de uma classe, expondo apenas operações seguras e que mantenham
os objetos em um estado consistente.

• Regra de ouro: o objeto deve sempre estar em um estado consistente, e a
própria classe deve garantir isso.

Regra geral básica
• Um objeto NÃO deve expor nenhum atributo (modificador de acesso
private)
• Os atributos devem ser acessados por meio de métodos get e set
• Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans

###5 Modificadores de acesso

• private: o membro só pode ser acessado na própria classe
• (nada): o membro só pode ser acessado nas classes do mesmo pacote
• protected: o membro só pode ser acessado no mesmo pacote, bem como em
subclasses de pacotes diferentes
• public: o membro é acessado por todas classes (ao menos que ele resida em
um módulo diferente que não exporte o pacote onde ele está)
 */