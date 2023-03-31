public class List{
    private No cabeca;
    private int tam;
    public List(){
        cabeca = null;
        tam = 0;
    }


    public boolean vazia(){
        if (tam == 0 ) return true;
        else return false;
    }

    public int getTam() {
        return tam;
    }


    public int elemento (int pos) {
        No aux = cabeca;
        int cont = 1;
        if (vazia()) return -1;
        if ((pos < 1) || (pos > tam))
            return -1;
        while (cont < pos){
            aux = aux.getNext();
            cont++;
        }
        return aux.getContent();
    }

    public int posicao (int dado) {
        int cont = 1;
        No aux;
        if (vazia()) return 0;
        aux = cabeca;
        while (aux != null) {
            if (aux.getContent() == dado)
                return cont;
            aux = aux.getNext();
            cont++;
        }
        return -1;
    }

    boolean insere(int pos, int dado) {
        if ((vazia()) && (pos != 1)) return false;
        if (pos == 1){
            return insereInicioLista(dado);
        }
        else if (pos == tam+1){
            return insereFimLista(dado);
        }
        else{
            return insereMeioLista(pos, dado);
        }
    }

    private boolean insereInicioLista(int valor) {

        No novoNo = new No();

        novoNo.setContent(valor);
        novoNo.setNext(cabeca);
        cabeca = novoNo;
        tam++;
        return true;
    }

    private boolean insereMeioLista(int pos, int dado){
        int cont = 1;
        No novoNo = new No();
        novoNo.setContent(dado);

        No aux = cabeca;
        while ((cont < pos-1) && (aux != null)){
            aux = aux.getNext();
            cont++;
        }
        if (aux == null) return false;
        novoNo.setNext(aux.getNext());
        aux.setNext(novoNo);
        tam++;
        return true;
    }

    private boolean insereFimLista(int dado){
        No novoNo = new No();
        novoNo.setContent(dado);

        No aux = cabeca;
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        novoNo.setNext(null);
        aux.setNext(novoNo);
        this.tam++;
        return true;
    }

    public int remove(int pos) {
        if (vazia()) return -1;

        if (pos == 1){
            return removeInicioLista();
        }

        else{
            return removeNaLista(pos);
        }
    }

    private int removeInicioLista(){
        No p = cabeca;
        int dado = p.getContent();

        cabeca = p.getNext();
        tam--;

        p = null;
        return dado;
    }

    private int removeNaLista(int pos) {
        No atual = null, antecessor = null;
        int dado = -1, cont = 1;
        atual = cabeca;
        while ((cont < pos) && (atual != null)) {
            antecessor = atual;
            atual = atual.getNext();
            cont++;
        }
        if (atual == null)
            return -1;
        dado = atual.getContent();
        antecessor.setNext(atual.getNext());
        tam--;

        atual = null;
        return dado;
    }
}

