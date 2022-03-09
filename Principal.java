public class Principal {
    public static void main(String[] args) {
        
        Papagaio p = new Papagaio();
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        p.setNome("Bartolomeu");
        System.out.print("Papagaio: ");
        System.out.println(p.getNome());
        System.out.println(p.voar());
        System.out.println(p.emitirSom());
        System.out.println(" ");

        c.setNome("Nina");
        c.setRaça("Vira Latas");
        c.setTamanho("Pequeno");
        System.out.print("Cachorro: ");
        System.out.println(c.getNome());
        System.out.println(c.getRaça());
        System.out.println(c.amamentar());
        System.out.println(c.emitirSom());
        System.out.println(" ");

      
        g.setNome("Billy");
        g.setRaça("Singapura");
        System.out.print("Gato: ");
        System.out.println(g.getNome());
        System.out.println(g.getRaça());
        System.out.println(g.amamentar());
        System.out.println(g.emitirSom());
    }

}
