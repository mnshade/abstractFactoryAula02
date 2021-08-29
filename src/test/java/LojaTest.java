import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void modeloCamisaAdidas(){
        FactoryAbstract factory = new FactoryAdidas();
        Loja loja = new Loja(factory);
        assertEquals("Camisa básica Adidas", loja.marcaCamisa());
    }

    @Test
    void modeloCalcaAdidas(){
        FactoryAbstract factory = new FactoryAdidas();
        Loja loja = new Loja(factory);
        assertEquals("Calça básica Adidas", loja.marcaCalca());
    }

    @Test
    void modeloCamisaNike(){
        FactoryAbstract factory = new FactoryNike();
        Loja loja = new Loja(factory);
        assertEquals("Camisa lançamento Nike", loja.marcaCamisa());
    }

    @Test
    void modeloCalcaNike(){
        FactoryAbstract factory = new FactoryNike();
        Loja loja = new Loja(factory);
        assertEquals("Calça lançamento Nike", loja.marcaCalca());
    }
}