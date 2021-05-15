package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioRegistro;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ControladorRegistroTest {
    private static final Usuario usuario =new Usuario();
    private static final Usuario usuario2=new Usuario();
    private ServicioRegistro servicioUsuario;

    @Before
    public void init(){
        servicioUsuario=mock(ServicioRegistro.class);
    }

    @Test
    public void queNoSePuedaRegistrarADosUsuariosConElMismoMail(){

        givenRegistroUnUsuario();
        whenRegistrarUnNuevoUsuarioConElMismoMail();

    }

    private void thenLaBaseDeDatosSoloTieneAlPrimerUsuario() {
    }

    private void whenRegistrarUnNuevoUsuarioConElMismoMail() {

    }

    private void givenRegistroUnUsuario() {
    }

}
