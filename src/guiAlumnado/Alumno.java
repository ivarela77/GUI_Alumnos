package guiAlumnado;

import java.io.Serializable;

/**
 *
 * @author dawa04
 */
public class Alumno implements Serializable{
    
    private String dni;
    private String nombre;
    private int edad;
    private String curso;
    private double nota;
    private boolean repite;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, int edad, String curso, double nota, boolean repite) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.nota = nota;
        this.repite = repite;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isRepite() {
        return repite;
    }

    public void setRepite(boolean repite) {
        this.repite = repite;
    } 
}
