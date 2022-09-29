public class Lista {
    public class No {
        public String info;
        No p = new No(27);
        No p1 = new No(38);
        public No proximo;
        public No primeiro;
        public No ultimo;


        public No(String valor){
            this.info = valor;
            this.proximo = null;}


        public No insere(No i, No j, String P) {// cria uma adjacência entre i e j com custo P no grafo;

            i.proximo=j;
            j.info=P;

            return i.proximo;}

        public No retira(No i, No j) {
            i.proximo = null;
            return i.proximo;
        }

        // imprime a matriz de adjacências do grafo
        public void imprimir(){// imprime a matriz de adjacências do grafo
            No p = this.primeiro;
            while (p!=null){
                System.out.println(p.info);
                p=p.proximo;}}

        void seta_informacao(No i, String V) { // atualiza a informação do nó i (rótulo) com o valor V (que deve ser uma string) no grafo
        i.info=V;
        }
            int adjacentes(No i) { // retorna o número de adjacentes ao vértice i no grafo e os armazena no vetor adj
            System.out.print(i.proximo);
            return 1;
            }
    }
}
