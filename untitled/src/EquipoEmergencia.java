public  abstract  class EquipoEmergencia {
    private String nombre;

    public EquipoEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public  void mostrarNombre(){
        System.out.println("el nombre del equipo es ");

    }
}
