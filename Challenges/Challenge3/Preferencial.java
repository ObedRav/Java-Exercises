//Exercise here ("https://drive.google.com/file/d/1ZKwBiqm4VMc7BOoruWj1JrVkGAwtArGd/view?usp=sharing")

package Challenges.Challenge3;

public class Preferencial extends Asistente{
    private boolean participaSorteo;

    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;

    }

    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
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
    
    public void participarSorteo(){
        if (this.participaSorteo == true) {
            this.participaSorteo = false;
        }else if(this.participaSorteo == false){
            this.participaSorteo = true;
        }
    }
}
