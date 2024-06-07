package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.acciones;

import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModificarGrupoEmpresarial implements Task {
        private TablaGrupoEmpresarial tablaGrupoEmpresarial;
        public ModificarGrupoEmpresarial(TablaGrupoEmpresarial tablaGrupoEmpresarial){
            this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
        }
        public static ModificarGrupoEmpresarial modificarDatosGrupoEmpresarial(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
            return Tasks.instrumented(ModificarGrupoEmpresarial.class, tablaGrupoEmpresarial);
        }
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.INPUT_RAZON_SOCIAL_NOMBRE),
                    Clear.field(ContenedorDeObjetosGrupoEmpresarial.INPUT_RAZON_SOCIAL_NOMBRE)
                    );
            if(tablaGrupoEmpresarial.getRazonSocialONombre().equals("aleatorio")){
                actor.attemptsTo(
                        Enter.theValue(GeneradorNombres.razonSocial()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_RAZON_SOCIAL_NOMBRE));

            }else{
                actor.attemptsTo(
                        Enter.theValue(tablaGrupoEmpresarial.getRazonSocialONombre()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_RAZON_SOCIAL_NOMBRE));

            }
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.INPUT_DIRECCION),
                    Clear.field(ContenedorDeObjetosGrupoEmpresarial.INPUT_DIRECCION),
                    Enter.theValue(tablaGrupoEmpresarial.getDireccion()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_DIRECCION),
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.INPUT_CORREO),
                    Clear.field(ContenedorDeObjetosGrupoEmpresarial.INPUT_CORREO),
                    Enter.theValue(tablaGrupoEmpresarial.getCorreoElectronico()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_CORREO),
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.INPUT_TELEFONO),
                    Clear.field(ContenedorDeObjetosGrupoEmpresarial.INPUT_TELEFONO),
                    Enter.theValue(tablaGrupoEmpresarial.getTelefono()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_TELEFONO),
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.INPUT_DOMINIO),
                    Clear.field(ContenedorDeObjetosGrupoEmpresarial.INPUT_DOMINIO),
                    Enter.theValue(tablaGrupoEmpresarial.getDominio()).into(ContenedorDeObjetosGrupoEmpresarial.INPUT_DOMINIO),
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_EDITAR_GRUPO_EMPRESARIAL));
        }
 }

