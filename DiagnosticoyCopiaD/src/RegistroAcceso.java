public class RegistroAcceso {
    private String usuario;
    private String[] marcasTiempo; // Objeto mutable en Heap

    public RegistroAcceso(String usuario, String[] marcasTiempo) {
        this.usuario = usuario;
        this.marcasTiempo = marcasTiempo; // ¡Fuga en constructor!
    }

    public String[] getMarcasTiempo() {
        return marcasTiempo; // ¡Fuga en getter!
    }
}
