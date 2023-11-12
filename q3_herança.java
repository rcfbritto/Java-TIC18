// Classe Pai
class Animal {
    void fazerSom() {
        System.out.println("Barulho genérico");
    }
}

// Subclasse
class Cachorro extends Animal {
    void latir() {
        System.out.println("Au au!");
    }
}
