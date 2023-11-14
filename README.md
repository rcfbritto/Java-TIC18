# Java-TIC18
Arquivos e avaliações da disciplina de Java do programa de Residência em tecnologia 

## Semana 1

- Instrução Prática 001
  - Questões
  - Calculadora Simples
  - Conversor de temperatura 

### Questões
##### 1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java. 

Em Java, uma classe é uma estrutura ou modelo que define o comportamento e as propriedades de objetos. 
A diferença entre uma classe e um objeto é que uma classe é uma estrutura de código que define um tipo, enquanto um objeto é uma instância dessa classe, que pode ser manipulado para interagir de acordo com os métodos definidos na classe.

### Exemplos em Java:

#### Classe Carro
```
// Classe em Java
public class Carro {
    String modelo;
    int ano;
}

// Objeto em Java
Carro meuCarro = new Carro();
meuCarro.modelo = "Fusca";
meuCarro.ano = 2000;

```
#### Classe para calcular média
```
// Classe CalculadoraMedia
class CalculadoraMedia {
    // Método para calcular a média de um array de números
    public double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }
}

// Objeto da classe CalculadoraMedia
public class Main {
    public static void main(String[] args) {
        CalculadoraMedia calculadora = new CalculadoraMedia();
        int[] numeros = {10, 5, 8, 12, 7};
        double resultado = calculadora.calcularMedia(numeros);
        System.out.println("Média: " + resultado);
    }
}

```
#### Classe verificadora de números pares
```
// Classe VerificadorPar
class VerificadorPar {
    // Método para verificar se um número é par
    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}

// Objeto da classe VerificadorPar
public class Main {
    public static void main(String[] args) {
        VerificadorPar verificador = new VerificadorPar();
        boolean resultado = verificador.ehPar(14);
        System.out.println("É par? " + resultado);
    }
}
```
#### Classe para saudação
```
// Classe Saudacao
class Saudacao {
    // Método para exibir uma saudação
    public void saudar() {
        System.out.println("Olá, mundo!");
    }
}

// Objeto da classe Saudacao
public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = new Saudacao();
        saudacao.saudar();
    }
}

```
#### Classe para realizar um sorteio
```
// Classe Sorteio
class Sorteio {
    // Método para gerar um número aleatório entre 1 e 10
    public int sortearNumero() {
        return (int) (Math.random() * 10) + 1;
    }
}

// Objeto da classe Sorteio
public class Main {
    public static void main(String[] args) {
        Sorteio sorteio = new Sorteio();
        int numeroSorteado = sorteio.sortearNumero();
        System.out.println("Número sorteado: " + numeroSorteado);
    }
}

```
### Agora veja os exemplos equivalentes em C++:

#### Classe Carro
```
//Classe em C++

class Carro {
public:
    string modelo;
    int ano;
};

// Objeto em C++
Carro meuCarro;
meuCarro.modelo = "Fusca";
meuCarro.ano = 2000;

```
#### Classe para calcular média
```
#include <iostream>
#include <vector>

using namespace std;

// Classe CalculadoraMedia
class CalculadoraMedia {
private:
    vector<int> numeros; // Armazena os números para cálculo da média

public:
    // Método para adicionar um número à lista
    void adicionarNumero(int numero) {
        numeros.push_back(numero);
    }

    // Método para calcular a média dos números na lista
    double calcularMedia() {
        if (numeros.empty()) {
            cout << "Erro: Nenhum número na lista." << endl;
            return 0.0;
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return static_cast<double>(soma) / numeros.size();
    }
};

// Função principal
int main() {
    // Criar objeto da classe CalculadoraMedia
    CalculadoraMedia calculadora;

    // Adicionar números à lista
    calculadora.adicionarNumero(10);
    calculadora.adicionarNumero(5);
    calculadora.adicionarNumero(8);

    // Calcular e exibir a média
    double media = calculadora.calcularMedia();
    cout << "Média: " << media << endl;

    return 0;
}

```
#### Classe verificadora de números pares
```
#include <iostream>

using namespace std;

// Classe VerificadorPar
class VerificadorPar {
public:
    // Método para verificar se um número é par
    bool ehPar(int numero) {
        return numero % 2 == 0;
    }
};

// Função principal
int main() {
    // Criar objeto da classe VerificadorPar
    VerificadorPar verificador;

    // Verificar se um número é par
    int numero = 14;
    if (verificador.ehPar(numero)) {
        cout << numero << " é par." << endl;
    } else {
        cout << numero << " não é par." << endl;
    }

    return 0;
}

```
#### Classe para saudação
```
#include <iostream>
#include <string>
using namespace std;

// Classe Saudacao
class Saudacao {
private:
    string mensagem; // Armazena a mensagem de saudação

public:
    // Construtor que inicializa a mensagem padrão
    Saudacao() : mensagem("Olá, mundo!") {}

    // Método para exibir a mensagem de saudação
    void saudar() {
        cout << mensagem << endl;
    }
};

// Função principal
int main() {
    // Criar objeto da classe Saudacao
    Saudacao saudacao;

    // Exibir a mensagem de saudação padrão
    saudacao.saudar();

    return 0;
}

```
#### Classe para realizar um sorteio
```
#include <iostream>
#include <cstdlib> // Para a função rand()
#include <ctime>   // Para a função time()
using namespace std;

// Classe Sorteio
class Sorteio {
public:
    // Método para gerar um número aleatório entre min e max (inclusive)
    int sortearNumero(int min, int max) {
        return rand() % (max - min + 1) + min;
    }
};

// Função principal
int main() {
    // Inicializando para a função rand() usando o tempo atual
    srand(std::time(0));

    // Criar objeto da classe Sorteio
    Sorteio sorteio;

    // Gerar e exibir um número aleatório entre 1 e 10
    int numeroSorteado = sorteio.sortearNumero(1, 10);
    cout << "Número sorteado: " << numeroSorteado << endl;

    return 0;
}

```

##### 2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++

Em Java, nós declaramos uma variável usando a seguinte sintaxe: 
  
  tipoDeDado nomeDaVariavel;

Exemplos de tipos primitivos em Java são: int, float, double, boolean, char.

Em C++, a sintaxe é semelhante, mas podemos usar auto para inferir o tipo.

  tipoDeDado nomeDaVariavel;

Exemplos de tipos primitivos em C++ são: int, float, double, bool, char.



##### 3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

Em Java, herança é o conceito de uma classe herdar as propriedades e métodos de outra classe.

### Veja os exemplos em Java:

#### Veículo e Carro
```
// Classe base
class Veiculo {
    String modelo;
    int ano;

    void acelerar() {
        System.out.println("Acelerando...");
    }
}

// Subclasse
class Carro extends Veiculo {
    int numeroPortas;

    void abrirPorta() {
        System.out.println("Abrindo a porta do carro...");
    }
}
```
#### Animal e Mamífero
```
// Classe base
class Animal {
    String nome;

    void comer() {
        System.out.println("Comendo...");
    }
}

// Subclasse
class Mamifero extends Animal {
    boolean amamenta;

    void amamentar() {
        System.out.println("Amamentando...");
    }
}
```
#### Figura e Círculo
```
// Classe base
class Figura {
    String cor;

    void desenhar() {
        System.out.println("Desenhando...");
    }
}

// Subclasse
class Circulo extends Figura {
    double raio;

    void calcularArea() {
        System.out.println("Calculando a área do círculo...");
    }
}
```
#### Pessoa e Estudante
```
// Classe base
class Pessoa {
    String nome;
    int idade;

    void andar() {
        System.out.println("Andando...");
    }
}

// Subclasse
class Estudante extends Pessoa {
    String curso;

    void estudar() {
        System.out.println("Estudando...");
    }
}
```
#### Dispositivo Eletrônico e Smartphone
```
// Classe base
class DispositivoEletronico {
    String marca;

    void ligar() {
        System.out.println("Ligando o dispositivo eletrônico...");
    }
}

// Subclasse
class Smartphone extends DispositivoEletronico {
    String sistemaOperacional;

    void fazerChamada() {
        System.out.println("Realizando uma chamada telefônica...");
    }
}
```
### Agora veja os exemplos equivalentes em C++:

#### Veículo e Carro
```
#include <iostream>

// Classe base
class Veiculo {
public:
    std::string modelo;
    int ano;

    void acelerar() {
        std::cout << "Acelerando..." << std::endl;
    }
};

// Subclasse
class Carro : public Veiculo {
public:
    int numeroPortas;

    void abrirPorta() {
        std::cout << "Abrindo a porta do carro..." << std::endl;
    }
};

```
#### Animal e Mamífero
```
#include <iostream>

// Classe base
class Animal {
public:
    std::string nome;

    void comer() {
        std::cout << "Comendo..." << std::endl;
    }
};

// Subclasse
class Mamifero : public Animal {
public:
    bool amamenta;

    void amamentar() {
        std::cout << "Amamentando..." << std::endl;
    }
};

```
#### Figura e Círculo
```
#include <iostream>

// Classe base
class Figura {
public:
    std::string cor;

    void desenhar() {
        std::cout << "Desenhando..." << std::endl;
    }
};

// Subclasse
class Circulo : public Figura {
public:
    double raio;

    void calcularArea() {
        std::cout << "Calculando a área do círculo..." << std::endl;
    }
};

```
#### Pessoa e Estudante
```
#include <iostream>

// Classe base
class Pessoa {
public:
    std::string nome;
    int idade;

    void andar() {
        std::cout << "Andando..." << std::endl;
    }
};

// Subclasse
class Estudante : public Pessoa {
public:
    std::string curso;

    void estudar() {
        std::cout << "Estudando..." << std::endl;
    }
};

```
### Dispositivo Eletrônio e Smartphone
```
#include <iostream>

// Classe base
class DispositivoEletronico {
public:
    std::string marca;

    void ligar() {
        std::cout << "Ligando o dispositivo eletrônico..." << std::endl;
    }
};

// Subclasse
class Smartphone : public DispositivoEletronico {
public:
    std::string sistemaOperacional;

    void fazerChamada() {
        std::cout << "Realizando uma chamada telefônica..." << std::endl;
    }
};

```

##### 4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

Em Java, declaramos variáveis que armazenam referências a objetos, mas não manipulamos ponteiros diretamente.
Em C++, podemos manipular ponteiros diretamente usando o operador * e o operador &.

### Veja alguns exemplos:
#### Em C++:
```
int x = 5;
int* ponteiroParaX = &x;
std::cout << *ponteiroParaX << std::endl; // Acessando o valor por meio do ponteiro
```
#### Em Java:
```
int x = 5;
// Em Java, não manipulamos ponteiros diretamente, mas trabalhamos com referências.
```
Em Java, a manipulação de memória é gerenciada automaticamente pelo coletor de lixo, o que facilita em muitos casos, mas perde a flexibilidade de gerenciar manualmente a memória como em C++.
