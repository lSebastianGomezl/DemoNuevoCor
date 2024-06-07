package co.com.konex.cetificacion.login.backoffice.models.backend;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GestionEmpresaData {
    private String id;
    private String idGrupoEmpresarial;
    private String nit;
    private String razonSocial;
    private String idPais;
    private String idMunicipio;
    private String direccion;
    private String correo;
    private String telefono;
    private String dominio;
    private String estado;
    private String moneda;
    private String tipoPago;
    private String aplicaComercializador;
    private String aplicaDistribuidor;
    private String responsableIva;
    private String obligadoFacturar;
    private String regimenSimple;
    private String entidadEstado;
}
