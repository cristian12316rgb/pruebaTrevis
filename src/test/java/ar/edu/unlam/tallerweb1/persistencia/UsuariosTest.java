package ar.edu.unlam.tallerweb1.persistencia;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;


public class UsuariosTest extends SpringTest {

Usuario usuario =new Usuario();

    @Test
    @Transactional
    @Rollback
    public void testQueSePuedaAgregarUnUsuarioALaBaseDeDatos(){
        whenAgregarloALaBaseDeDatos(usuario);
        thenSeValidaSiElUsuarioEstaEnLaDB();
    }



    private void thenSeValidaSiElUsuarioEstaEnLaDB() {
        Usuario prueba = session().get(Usuario.class,1L);
        prueba.setEmail("hola");
        assertThat(prueba.getId()).isEqualTo(usuario.getId());
    }

    private void whenAgregarloALaBaseDeDatos(Usuario usuario) {
        session().save(usuario);
    }


}
