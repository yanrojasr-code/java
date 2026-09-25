public class EquipoEmergencia {
    private  String nombre;

    public EquipoEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println("el nombre del equipo es: " + this.nombre);
    }
    public abstract void atenderEmergencia();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "EquipoEmergencia{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
