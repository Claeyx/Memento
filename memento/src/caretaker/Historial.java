package caretaker;

import memento.Memento;
import java.util.Stack;

public class Historial {
    private final Stack<Memento> historial = new Stack<>();
    public void guardarEstado(Memento memento) {
        if (memento != null) {
            historial.push(memento);
        }
    }
    public Memento obtenerUltimoEstado() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        System.out.println("Aviso: No hay estados guardados para restaurar.");
        return null;
    }
}