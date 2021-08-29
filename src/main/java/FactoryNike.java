public class FactoryNike implements FactoryAbstract{

    @Override
    public Camisa createCamisa() {
        return new CamisaNike();
    }

    @Override
    public Calca createCalca() {
        return new CalcaNike();
    }
}
