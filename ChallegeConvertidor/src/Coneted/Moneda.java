package Coneted;

public class Moneda {
    private String monedaBase;
    private String monedaDeCambio;
    private int cantidad;

    public Moneda(String monedaBase, String monedaDeCambio) {
        this.monedaBase = monedaBase;
        this.monedaDeCambio = monedaDeCambio;
    }

    public String getMonedaDeCambio() {
        return monedaDeCambio;
    }

    public void setMonedaDeCambio(String monedaDeCambio) {
        this.monedaDeCambio = monedaDeCambio;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
