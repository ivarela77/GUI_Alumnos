package guiAlumnado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author IvI
 */
public class Metodos {
    
    public static void eliminarAlumno(ArrayList<Alumno> alumnos, int indice){
        alumnos.remove(indice);  
    }
    
    public static void aniadirAlumno(ArrayList<Alumno> alumnos, Alumno a){
        alumnos.add(a);
    }
    
    public static void hacerCopia(ArrayList<Alumno> alumnos){
        try {
            ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
            salida.writeObject(alumnos);
            salida.flush();
            salida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error de fichero");
        } catch (IOException ex) {
            System.out.println("Error IO");
        }
    }
    
    public static ArrayList<Alumno> cargarCopia(){
        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        try {
            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("alumnos.dat"));
            alumnos=(ArrayList<Alumno>) entrada.readObject();
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error archivo");
        } catch (IOException ex) {
            System.out.println("Error IO");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error CNF");
        }
       return alumnos; 
    }
    
        public static boolean validarDni(String dni){
            boolean valido=true;
            char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            if(dni.length()>=8 && dni.length()<=9){
                try{
                    int numDni=Integer.parseInt(dni.substring(0, dni.length()-1));
                    char letraDni=dni.toUpperCase().charAt(dni.length()-1);
                    int res=numDni%23;
                    if(letraDni!=letrasNIF[res]){return false;
                    }
                }catch(NumberFormatException e){ return false;}
            }else{return false;}
        return valido;
    }
    
    public static boolean ComprobarNombre(String nombre){
        boolean resultado=true;
        if(nombre.equals("")){
            resultado=false;
        }
        return resultado;  
    }
    
    public static boolean ComprobarEdad(String edad){
        boolean resultado=true;
        try{
            int edadN=Integer.parseInt(edad);
            if(edadN<1 || edadN>125){resultado=false;}
        }
        catch(NumberFormatException ex){  
            return false;
        }
        return resultado;  
    }
    
    public static boolean ComprobarCurso(String curso){
        boolean resultado=true;
       
        if(curso.equalsIgnoreCase("seleccionar un curso...")){
            resultado=false;
        }
        return resultado;  
    }
    
    public static boolean ComprobarNota(String nota){
        boolean resultado=true;
        
        try{
            double notaN=Double.parseDouble(nota);
            if(notaN<0 || notaN>10){resultado=false;}
        }
        catch(NumberFormatException ex){
            return false;
        }
        return resultado;  
    }
    
    public static boolean ComprobarRepite(boolean rSi, boolean rNo){
        boolean resultado;

        if((rSi==false)&&(rNo==false)) {resultado=false;}
        else {resultado=true;}
        
        return resultado;  
    }
}