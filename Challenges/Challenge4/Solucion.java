package Challenges.Challenge4;

import java.util.ArrayList;

public class Solucion {
    
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
        ArrayList <Double> nota = new ArrayList<>();
        double suma = 0;
        double first = 0;
        double comprobacion = 0;
        String nombreDatoMayor = "";
        double notaMayor = 0;
        String nombreDatoMinimo = "";
        double notaMenor = 0;
        double ejemplo = 5D;
        for (Estudiante cadena: grupo) {
            nota.add(cadena.getNota());
            }
        for (int i = 0; i < nota.size(); i++) {
            suma += nota.get(i);
            first = suma/nota.size();
        }
        for (int i = 0; i < grupo.size(); i++) {
            if (grupo.get(i).getNota() > comprobacion){
                comprobacion = grupo.get(i).getNota(); 
                nombreDatoMayor = String.valueOf(grupo.get(i).getNombreCompleto());
                notaMayor = grupo.get(i).getNota();
            }
            if (ejemplo > grupo.get(i).getNota()) {
                nombreDatoMinimo = String.valueOf(grupo.get(i).getNombreCompleto());
                notaMenor = grupo.get(i).getNota();
                ejemplo = grupo.get(i).getNota();
            }
        }
        ArrayList<Object> reportes = new ArrayList<>();
        
        reportes.add(first);
        reportes.add(nombreDatoMinimo);
        reportes.add(notaMenor);
        reportes.add(nombreDatoMayor);
        reportes.add(notaMayor);
        
        return reportes.toArray(); 
    }
}
