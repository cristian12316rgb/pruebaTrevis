package ar.edu.unlam.tallerweb1.servicios;

import org.springframework.stereotype.Service;

@Service
public class ServicioImpl implements  ServicioCalcu{


    @Override
    public Double sumar(Double termino, Double termino2) {
        return termino+termino2;
    }

    @Override
    public Double restar(Double termino, Double termino2) {
        return termino-termino2;
    }

    @Override
    public Double multiplicar(Double termino, Double termino2) {
        return termino*termino2;
    }
}
