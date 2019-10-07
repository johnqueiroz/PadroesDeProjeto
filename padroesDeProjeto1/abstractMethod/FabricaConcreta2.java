class FabricaConcreta2 implements FabricaAbstrata {

    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA2();
    }
    
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB2();
    }
}