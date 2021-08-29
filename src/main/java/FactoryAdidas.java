public class FactoryAdidas implements FactoryAbstract{

    @Override
    public Camisa createCamisa() {
        return new CamisaAdidas();
    }

    @Override
    public Calca createCalca() {
        return new CalcaAdidas();
    }
}
