# Java-TIC18
Arquivos e avaliações da disciplina de Java do programa de Residência em tecnologia 

## Semana 1

- Instrução Prática 001
  - Questões
  - Calculadora Simples
  - Conversor de temperatura 

  ### Questões
  1. O que é uma classe em Java e qual é a diferença entre uma classe e um
objeto? Dê 5 exemplos mostrando-os em C++ e em Java. 

Java:
Em Java, uma classe é uma estrutura que define o comportamento e as propriedades de objetos.
A diferença entre uma classe e um objeto é que uma classe é uma estrutura de código que define um tipo, enquanto um objeto é uma instância dessa classe.

[Veja o código Java aqui]("/d/Residência/Módulo 2 - Novembro/Java/Semana 1/Java-TIC18/q1-exemplo_Java.java")
[Veja o código em C++ aqui]("/d/Residência/Módulo 2 - Novembro/Java/Semana 1/Java-TIC18/q2_exemploC++.cpp")


  2. Como você declara uma variável em Java e quais são os tipos de dados
primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na
linguagem C++

Java:
Em Java, você declara uma variável usando a seguinte sintaxe:
  tipoDeDado nomeDaVariavel;
Exemplos de tipos primitivos em Java: int, float, double, boolean, char.

C++:
Em C++, a sintaxe é semelhante, mas você pode usar auto para inferir o tipo.
  tipoDeDado nomeDaVariavel;
Exemplos de tipos primitivos em C++: int, float, double, bool, char.


  3. Explique o conceito de herança em Java e como você pode criar uma
subclasse a partir de uma classe existente. Faça um paralelo com C++,
apresentando 5 exemplos.

Java:
Em Java, herança é o conceito de uma classe herdar as propriedades e métodos de outra.
Exemplo em Java:
[Veja código Java aqui]("/d/Residência/Módulo 2 - Novembro/Java/Semana 1/Java-TIC18/q3_herança.java")
[Veja código em C++ aqui]("/d/Residência/Módulo 2 - Novembro/Java/Semana 1/Java-TIC18/q3_herançaC++.cpp")

  4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro.
Em C++ é diferente. Discorra sobre esse aspecto.

Em Java, declaramos variáveis que armazenam referências a objetos, mas não manipulamos ponteiros diretamente.
Em C++, podemos manipular ponteiros diretamente usando o operador * e o operador &.
'''
// C++
int x = 5;
int* ponteiroParaX = &x;
std::cout << *ponteiroParaX << std::endl; // Acessando o valor por meio do ponteiro
'''
'''
// Java
int x = 5;
// Em Java, não manipulamos ponteiros diretamente, mas trabalhamos com referências.
'''
Em Java, a manipulação de memória é gerenciada automaticamente pelo coletor de lixo, o que facilita em muitos casos, mas perde a flexibilidade de gerenciar manualmente a memória como em C++.
