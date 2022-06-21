public class Caixa<T> {

    T objeto;

    public void guardarObjeto(T object) {
        if (this.objeto == null ) {
            this.objeto = obj;
            System.out.println("Objeto do tipo " + object + " | " + this.objeto.getClass().getTypeName() + " adicionado com sucesso!");
        } else {
            System.out.println("A caixa já possui um objeto!");
        }
    }

    public void retirarObjeto(T object) {
        if (this.objeto != null) {
            this.objeto = null;
            System.out.println("Objeto do tipo " + object + " | " + object.getClass().getName() + " removido com sucesso!" );
        }
    }

}