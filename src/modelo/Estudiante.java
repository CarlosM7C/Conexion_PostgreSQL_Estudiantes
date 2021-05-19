package modelo;

public class Estudiante {
    int idestudiante;
    String nombre;
    String apellido;
    String carrera;

    public Estudiante() {
    }

    public Estudiante(int idestudiante, String nombre, String apellido, String carrera) {
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public int getId() {
        return idestudiante;
    }

    public void setId(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNom() {
        return nombre;
    }

    public void setNom(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
}
