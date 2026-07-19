// new GodPokemon()
//         │
//         ▼
// Pokemon()   ← Automatically called
//         │
//         ▼
// LegendaryPokemon()  ← Automatically called
//         |
//     GodPokemon()

//Pokemon
// ├── StrongPokemon
// └── LegendaryPokemon
//       └── GodPokemon

class Pokemon {
    int power;
    String type;

    Pokemon(String type, int power) {
        this.type = type;
        this.power = power;
    }

    Pokemon() {
    }

    void print() {
        System.out.println(power + " " + type);
    }
}

class StrongPokemon extends Pokemon {
    int speed;
}

class LegendaryPokemon extends Pokemon {
    String ability;
}

class GodPokemon extends LegendaryPokemon {
    char tag;
}

public class A_11_Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.power = 500;
        mewtwo.type = "Psychic";
        mewtwo.ability = "Pressure";

        Pokemon pikachu = new Pokemon();

        GodPokemon dialga = new GodPokemon();
        dialga.power = 1000;
        dialga.type = "Steel/Dragon";
        dialga.ability = "Pressure";
        dialga.tag = 'S';

        mewtwo.print();
        System.out.println(mewtwo.ability);

        dialga.print();
        System.out.println(dialga.ability);
        System.out.println(dialga.tag);
    }
}
