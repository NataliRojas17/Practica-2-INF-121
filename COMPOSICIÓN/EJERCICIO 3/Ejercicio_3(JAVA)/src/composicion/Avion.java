package composicion;

import java.util.ArrayList;

public class Avion {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public ArrayList<Parte> getPartes() {
        return partes;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void agregarParte(Parte parte) {
        partes.add(parte);
    }
    public void mostrarAvion() {
        System.out.println("Modelo del avión: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes del avión:");
        for (Parte p : partes) {
            p.mostrarInfo();
        }
    }
}
