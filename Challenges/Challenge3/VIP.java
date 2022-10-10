//Exercise here ("https://drive.google.com/file/d/1ZKwBiqm4VMc7BOoruWj1JrVkGAwtArGd/view?usp=sharing")

package Challenges.Challenge3;

import java.util.Random;

public class VIP extends Asistente {
    private boolean[] pantallas;
    private String credencialesPrevia;

    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.pantallas = new boolean[]{false,false,false};
        this.credencialesPrevia = "";
    }

    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }

    @Override
    public String getIdTiquete() {
        return idTiquete;
    }

    @Override
    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    @Override
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    @Override
    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    @Override
    public String getCredenciales() {
        return credenciales;
    }

    @Override
    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
    
    public void generarCredencialesPrevia(){
        Random r = new Random();
        int valorDado = r.nextInt(100000);
        String rand = valorDado+"";
        this.credencialesPrevia = rand;
    }

    public void asignarPantalla(int pantalla){
        if (pantallas[pantalla-1] == true) {
            pantallas[pantalla-1] = false;
        }else if(pantallas[pantalla-1] == false){
            pantallas[pantalla-1] = true;
        }else{
            pantallas[pantalla-1] = false;
        }
    }
}
