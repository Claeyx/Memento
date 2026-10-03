package main;

import originator.Editor;
import caretaker.Historial;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Historial historial = new Historial();

        System.out.println("INICIO DE PRUEBAS DEL PATRÓN MEMENTO\n");

        // 1.
        editor.setContenido("Hola");
        System.out.println("Contenido actual: \"" + editor.getContenido() + "\"");
        historial.guardarEstado(editor.guardar());
        System.out.println("Estado guardado\n");

        // 2.
        editor.setContenido("Hola, como estas?");
        System.out.println("Contenido actual: \"" + editor.getContenido() + "\"");
        historial.guardarEstado(editor.guardar());
        System.out.println("Estado guardado\n");

        // 3.
        editor.setContenido("Hola, como estas?, ok");
        System.out.println("Contenido actual (modificado sin guardar): \"" + editor.getContenido() + "\"\n");

        // 4.
        System.out.println("Restaurando estado anterior");
        editor.restaurar(historial.obtenerUltimoEstado());
        System.out.println("Contenido tras restauración: \"" + editor.getContenido() + "\"\n");

        // 5.
        editor.setContenido("Hola, mundo! Nueva edición despues de restauración.");
        System.out.println("Contenido actual: \"" + editor.getContenido() + "\"");
    }
}