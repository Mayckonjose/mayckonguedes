package pokedex;
//impotando o array
    import java.util.ArrayList;

    public class Pokeagenda {
        //criando um array do tipo pokemon
        ArrayList<Pokemon> pokedex = new ArrayList<>();
        //adicionando o pokemon no array pokedex
        public void adicionar(Pokemon p){
            pokedex.add(p);
            
        }
        // o metodo remover remove o elemento pelo indice estabelecido
        public void remover(int v){
            pokedex.remove(v);
            
        }
        //o metodo exibir  mostra todos os elementos do arraylist, usado
        public void exibir(){
            for (Pokemon p: pokedex ){
                System.out.println(p.getNome()+" "+p.getTipo()+""+p.getNivel()+"\n");
            }

        }
        //metodo pesquisa recebe como parametro o nome do pokemon a ser procurado e retorna o tipo e o nivel
        public void buscar(String Pokemom){ 
            for (Pokemon p: pokedex){
                if(Pokemom.equals(p.getNome())){
                    System.out.println("O pokemom é do tipo: " + p.getTipo() + " e do nível:  " + p.getNivel());
                }else{System.out.println("pokemon inexistente");}

    }

        }
    }
