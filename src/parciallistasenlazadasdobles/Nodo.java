package parciallistasenlazadasdobles;

/**@author Jose Ignacio */

public class Nodo {
    
    private int identificador;
    private String permisosDeAcesso;
    private String nombre;
    private String extension;
    private float tam;
    private Nodo siguiente; 
    private Nodo anterior;
    
    public Nodo() {
        
        siguiente = null;
        anterior = null;
    }
    
     public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getPermisosDeAcesso() {
        return permisosDeAcesso;
    }

    public void setPermisosDeAcesso(String permisosDeAcesso) {
        this.permisosDeAcesso = permisosDeAcesso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public float getTam() {
        return tam;
    }

    public void setTam(float tam) {
        this.tam = tam;
    }
    
    public void setSiguiente(Nodo sig) {
        siguiente = sig;
    }

    public void setAnterior(Nodo ant) {
        anterior = ant;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
    
    public void copiar(Nodo datnd) {     
        identificador = datnd.getIdentificador();
        permisosDeAcesso = datnd.getPermisosDeAcesso();
        nombre = datnd.getNombre();
        tam = datnd.getTam();
       extension  = datnd.getExtension();
    }

   

   
}
