package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.servicios.ServicioCalcu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorCalculadora {


    private ServicioCalcu servicio;
    @Autowired
    public ControladorCalculadora(ServicioCalcu servicio){

        this.servicio=servicio;
    }

    @RequestMapping("/calculadora")
    public ModelAndView mostrarCalculador(){

        return new ModelAndView("calculadora");
    }
@RequestMapping("operacionCalculadora")
        public ModelAndView calcular(
                @RequestParam(value="termino1", required = true) Double operando1,
                @RequestParam(value="termino2", required = true) Double operando2,
                @RequestParam(value="operacion", required = false) Integer operacion

){


        ModelMap modelo=new ModelMap();
        modelo.put("termino1",operando1);
        modelo.put("termino2",operando2);

        Double resultado;
        switch (operacion){
            case 1:
                resultado=servicio.sumar(operando1,operando2);
                modelo.put("resultado",resultado);
                modelo.put("operacion ","sumar");

                break;
            case 2:
                resultado=servicio.restar(operando1,operando2);
                modelo.put("resultado",resultado);
                modelo.put("operacion ","restar");

                break;
            case 3:
                resultado=servicio.multiplicar(operando1,operando2);
                modelo.put("resultado",resultado);
                modelo.put("operacion ","multiplicar");

                break;
            default:
                break;
        }

        return new ModelAndView("calculadora",modelo);

    }

}

