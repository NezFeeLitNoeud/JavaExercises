package fr.formation;

public class Application {

    public static void main(String[] args) {
        Cowboy luckyLuke = createLuckyLuke();
        Cowboy joeDalton = createJoeDalton();
        System.out.println("Before shooting:");
        print(luckyLuke, joeDalton);

        shootUntilDeath(luckyLuke, joeDalton);
        System.out.println("After shooting:");
        print(luckyLuke, joeDalton);

    }

    /**
     * Les cowboys en param�tres se tirent dessus al�atoirement jusqu'� la mort
     * de l'un des deux.
     * <p>
     * Note: plusieurs solutions possibles pour impl�menter un tire al�atoire,
     * aller au plus simple.
     */
    private static void shootUntilDeath(Cowboy luckyLuke, Cowboy joeDalton) {
        do {
            luckyLuke.shoot(joeDalton);
            joeDalton.shoot(luckyLuke);
        } while(luckyLuke.isDead() == false && joeDalton.isDead() == false);

    }

    private static Cowboy createLuckyLuke() {
        Weapon fusil = new Weapon("Widow", 10, 3);
        Cowboy lucky = new Cowboy("Lucky Luke", 30, fusil);
        return lucky;
    }

    private static Cowboy createJoeDalton() {
        Weapon pistolet = new Weapon("Shouteur", 15, 1);
        Cowboy joe = new Cowboy("Joe Dalton", 24, pistolet);
        // To be implemented
        return joe;
    }

    private static void print(Cowboy luckyLuke, Cowboy joeDalton) {
        System.out.println(luckyLuke);
        System.out.println(joeDalton);
        System.out.println();
    }}
