public class PSCAnimal {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Rex", 5);
        Cachorro cachorro = new Cachorro("Tor", 4);
        Gato gato = new Gato("Felix", 3);

        System.out.println("\nAnimal");
        System.out.println(animal.toString());
        System.out.println(animal.emitirSom());

        System.out.println("\nCachorro");
        System.out.println(cachorro.toString());
        System.out.println(cachorro.emitirSom());
        
        System.out.println("\nGato");
        System.out.println(gato.toString());
        System.out.println(gato.emitirSom());

    }
}