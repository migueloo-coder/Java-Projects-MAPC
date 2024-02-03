
package ventana;


public class Objetos {
    private String nombre;
    private int identificacion;
    private int edad;
    
    
    


public Objetos(String n, int id ,int e){
    nombre=n;
    identificacion=id;
    edad=e;
    
    
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


@ Override

public String toString(){
    return this.nombre;
}
}