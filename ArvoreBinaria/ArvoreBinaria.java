public class ArvoreBinaria {
    
    private No raiz;

    //método para inserir um elemento na árvore binária de busca
    public void inserir(int valor) {
        if  (raiz == null) {
        raiz = new No(valor);
        } else {
            raiz.inserirNo(valor);
        }
    }
    
    //método para percorrer a árvore em ordem
    public void EmOrdem() {
        EmOrdemRecursivo(raiz);
        
    }
    // método auxiliar recustivo para o percurso em ordem
    private void EmOrdemRecursivo(No raiz) {
        if(raiz == null) {
            return;
        }
        EmOrdemRecursivo(raiz.esq);
        System.out.print(raiz.dado + ", ");
        EmOrdemRecursivo(raiz.dir);
    }

    // método para percorrer a árvore na pré-ordem
    public void PreOrdem() {
        PreOrdemRecusivo(raiz);
    }

    // método auxiliar recusivo para o percurso na pré-ordem
    private void PreOrdemRecusivo(No raiz) {
        if(raiz == null) {
            return;
        }
        System.out.print(raiz.dado + ", ");
        PreOrdemRecusivo(raiz.esq);
        PreOrdemRecusivo(raiz.dir);
    }
    
    // método para percorrer a árvore no percurso pós-ordem
    public void PosOrdem() {
        PosOrdemRecusivo(raiz);
    }

    // método auxliar recusivo para percorrer a árvore no percuso pós-ordem
    private void PosOrdemRecusivo(No raiz) {
        if(raiz == null) {
            return;
        }
        PosOrdemRecusivo(raiz.esq);
        PosOrdemRecusivo(raiz.dir);
        System.out.print(raiz.dado + ", ");
    }
}
