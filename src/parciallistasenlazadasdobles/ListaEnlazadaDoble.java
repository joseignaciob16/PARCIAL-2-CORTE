package parciallistasenlazadasdobles;

import javax.swing.JOptionPane;

/** @author Jose Ignacio */

public class ListaEnlazadaDoble {
    
    private Nodo cabeza;

    public ListaEnlazadaDoble() {
        cabeza = null;
    }

    public void setCabeza(Nodo cab) {
        cabeza = cab;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
    
   public Nodo BuscarJugadores(int id) {

       Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getIdentificador()==id) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

  

    public int contarNodos() {
        int cantidad = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            cantidad++;
            temp = temp.getSiguiente();
        }
        return cantidad;
    }

    

    void agregarEntreNodos(Nodo nd, Nodo nuevo) {
        nuevo.setSiguiente(nd.getSiguiente());
        if (nd.getSiguiente() != null) {
            nd.getSiguiente().setAnterior(nuevo);
        }
        nd.setSiguiente(nuevo);
        nuevo.setAnterior(nd);
    }

    public void agregarAcabeza(Nodo nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nuevo.setAnterior(null);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
    }
    
    public void ListadoPorTipo(){
    String list;
    
     Nodo temp = cabeza;
     
        String doc = "ARCHIVOS CON EXTENSION .DOC \n",
                pdf = "ARCHIVOS CON EXTENSION .PDF \n",
                txt = "ARCHIVOS CON EXTENSION TXT \n";
     
        String procesos = "Procesos con Prioridad \n";

        
        while (temp != null) {
            if (temp.getExtension().equals(".DOC")) {
                doc += "Identificador: " + temp.getIdentificador() + " - Nombre: " + temp.getNombre() + " - Acceso: "
                        + temp.getPermisosDeAcesso() + " - Tamaño: " + temp.getTam() + "\n";

            } else if (temp.getExtension().equals(".PDF")) {
                pdf += "Identificador: " + temp.getIdentificador() + " - Nombre: " + temp.getNombre() + " - Acceso: "
                        + temp.getPermisosDeAcesso() + " - Tamaño: " + temp.getTam() + "\n";

            } else if (temp.getExtension().equals(".TXT")) {
                txt += "Identificador: " + temp.getIdentificador() + " - Nombre: " + temp.getNombre() + " - Acceso: "
                        + temp.getPermisosDeAcesso() + " - Tamaño: " + temp.getTam() + "\n";
            }
            temp = temp.getSiguiente();

        }
        
        list = doc + "\n" + pdf + "\n" + txt;
        JOptionPane.showMessageDialog(null, list);
    
    }
    
    public void ContadorPorTipo(){
    String list;
    
     Nodo temp = cabeza;
     
        int doc = 0,pdf = 0, txt= 0;
     
        String procesos = "CANTIDAD DE ARCHIVOS POR TIPO \n";
        
        while (temp != null) {
            if (temp.getExtension().equals(".DOC")) {
                doc++;
            } else if (temp.getExtension().equals(".PDF")) {
                pdf++;
            } else if (temp.getExtension().equals(".TXT")) {
                txt++;
            }
            temp = temp.getSiguiente();

        }
        
        list = "DOCS = " + doc + "\n"
                + "PDF = " + pdf + "\n"
                + "TXT = " + txt;
        JOptionPane.showMessageDialog(null, list);

    }
    
    
    public float maxtAM() {

        float def = 0;
        float max = 0;

        Nodo temp = cabeza;
        while (temp != null) {

            def = temp.getTam();

            if (def > max) {

                max = def;

            }
            temp = temp.getSiguiente();

        }
        return max;
    }
    
    Nodo BuscarArchivotam(float tam) {

        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getTam()== tam) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    void cambiar(Nodo nod1, Nodo nod2) {
        Nodo temp = new Nodo();
        temp.copiar(nod1);
        nod1.copiar(nod2);
        nod2.copiar(temp);
    }
    
    void OrdenarIntercambio() {

        Nodo ni;
        Nodo nj;
        ni = cabeza;
        while (ni != null) {
            nj = ni.getSiguiente();
            while (nj != null) {
                if (ni.getTam()< nj.getTam()) {
                    cambiar(ni, nj);
                }
                nj = nj.getSiguiente();
            }
            ni = ni.getSiguiente();
        }
    }

    public void CambiarPosicion(Nodo dat1, Nodo dat2) {
        Nodo temp = new Nodo();
        temp.copiar(dat1);
        dat1.copiar(dat2);
        dat2.copiar(temp);
    }
}
