public class Main {
    
    public static void main(String[] args) {
        
        ArvoreBinaria av = new ArvoreBinaria();
        av.inserir(50);
        av.inserir(70);
        av.inserir(39);
        av.inserir(42);
        av.inserir(23);
        av.inserir(63);
        av.inserir(42);
        av.inserir(14);
        
        System.out.println("Pré-ordem: ");
        av.PreOrdem();

        System.out.println("\nEm-ordem: ");
        av.EmOrdem();

        System.out.println("\nPós-ordem: ");
        av.PosOrdem();
    }
}
