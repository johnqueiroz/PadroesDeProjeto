class FabricaConcreta1 implements FabricaAbstrata {

    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA1();
    }

    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB1();
    }
}