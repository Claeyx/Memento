package originator;

import memento.Memento;

public class Editor {
    private String contenido;
    public Editor() {
        this.contenido = "";
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getContenido() {
        return contenido;
    }
    public Memento guardar() {
        return new Memento(this.contenido);
    }
    public void restaurar(Memento memento) {
        if (memento != null) {
            this.contenido = memento.getContenido();
        }
    }
}