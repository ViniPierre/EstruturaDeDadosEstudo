public class ArvoreBinaria {
    
    private No raiz;

    public void inserir(int valor) {
        if  (raiz == null) {
        raiz = new No(valor);
        } else {
            raiz.inserirNo(valor);
        }
    }


}
