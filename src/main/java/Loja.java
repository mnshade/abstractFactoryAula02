public class Loja {
    private Camisa camisa;
    private Calca calca;

    public Loja(FactoryAbstract factory){
        this.camisa = factory.createCamisa();
        this.calca = factory.createCalca();
    }

    public String marcaCamisa(){
        return this.camisa.marca();
    }
    public String marcaCalca(){
        return this.calca.marca();
    }
}
