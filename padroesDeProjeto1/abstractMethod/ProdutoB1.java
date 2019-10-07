class ProdutoB1 implements ProdutoAbstratoB {

    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getNome() + " interage com " + a.getClass().getNome());
    }

}