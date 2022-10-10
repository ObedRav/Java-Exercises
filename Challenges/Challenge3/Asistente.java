//Exercise here ("https://drive.google.com/file/d/1ZKwBiqm4VMc7BOoruWj1JrVkGAwtArGd/view?usp=sharing")

package Challenges.Challenge3;

import java.util.Random;

public class Asistente {
    protected String idTiquete, nombreCompleto, direccionResidencia, credenciales;

    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia) {
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
        this.credenciales = "";
    }

    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

    public void generarCredenciales(){
        Random r = new Random();
        int valorDado = r.nextInt(100000);
        String rand = valorDado+"";
        this.credenciales = rand;
    }
}
