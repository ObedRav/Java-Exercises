package Challenges.Challenge2;

public class Challenge2 {
    public String[] turnos;
    public String[] turnosPerdidos;
    public boolean estadoTurnoVirtual; 
    public int turnoEnAtencion;
    public int cantidadTurnosAtendidos = 1;

    public Challenge2(String[] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[]{" "," "," "," "," "," "," "," "," "," "," "," "};
        this.estadoTurnoVirtual = true;
        this.turnoEnAtencion = 0;
        this.cantidadTurnosAtendidos = 1;
    }

    public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
    
    public void atenderProximoTurno() {
        if(estadoTurnoVirtual == true){
            turnoEnAtencion++;
            cantidadTurnosAtendidos+=1;
     }
    }

    public void cambiarEstadoTurno(){
        if (estadoTurnoVirtual == true){
            estadoTurnoVirtual = false;
        }else if(estadoTurnoVirtual == false) {
            estadoTurnoVirtual = true;
        }
    }
    

    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }
}
