// Classe Pai
class Animal {
public:
    void fazerSom() {
        std::cout << "Barulho genérico" << std::endl;
    }
};

// Subclasse
class Cachorro : public Animal {
public:
    void latir() {
        std::cout << "Au au!" << std::endl;
    }
};
