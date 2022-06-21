class Main {
    public static void main(String[] args) {

        Caixa<Integer> caixa_A = new Caixa<>();
        caixa_A.guardarObjeto(4);
        caixa_B.guardarObjeto(4);
        caixa_A.retirarObjeto(4);

        Caixa<String> caixa_B = new Caixa<>();
        caixa_B.guardarObjeto("Brinquedo");
        caixa_B.guardarObjeto("Brinquedo");
        caixa_B.retirarObjeto("Brinquedo");

    }
}