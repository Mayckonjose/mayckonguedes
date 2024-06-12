package pokedex;

public class Main {
    public static void main(String[] args) {
        //criando um objeto da classe pokemon
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();
        Pokemon p3 = new Pokemon();
        //atribuindo valores aos pokemons
        p1.setNome("pikachu");
        p1.setTipo("eletrico");
        p1.setNivel(1);
        //-------------------//7
        p2.setNome("charizard");
        p2.setTipo("fogo");
        p2.setNivel(3);
        //----------------------//
        p3.setNome("ratata");
        p3.setTipo("normal");
        p3.setNivel(1);
        //criando uma Pokeagenda
        Pokeagenda poke = new Pokeagenda();
        //utilizando os metodos para add pokemon em pokedex
        poke.adicionar(p1);
        poke.adicionar(p2);
        poke.adicionar(p3);
        //---------------------//
        //metodo exibir
        poke.exibir();
        //metodo buscar
        poke.buscar("laturo");
        //metodo remover
        poke.remover(2);
        //metodo exibir
        poke.exibir();


}
}