package Objetos;

import Coneted.MonedaApi;

public class Moneda {
    private String monedaBase;
    private String monedaDeCambio;
    private double cantidad;
    private double tazaDeCambio;
    private double resultado;

    public Moneda(String monedaBase, String monedaDeCambio, double cantidad) {
        this.monedaBase = monedaBase;
        this.monedaDeCambio = monedaDeCambio;
        this.cantidad = cantidad;
    }

    public Moneda(MonedaApi miMonedaApi) {
        this.monedaBase = miMonedaApi.base_code();
        this.monedaDeCambio = miMonedaApi.target_code();
        this.tazaDeCambio = miMonedaApi.conversion_rate();
        this.resultado = miMonedaApi.conversion_result();
    }

    public String getMonedaDeCambio() {
        return monedaDeCambio;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getTazaDeCambio() {
        return tazaDeCambio;
    }

    public void setTazaDeCambio(double tazaDeCambio) {
        this.tazaDeCambio = tazaDeCambio;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "{" +
                "monedaBase='" + monedaBase + " "+
                ", monedaDeCambio='" + monedaDeCambio + " " +
                ", tazaDeCambio=" + tazaDeCambio +
                ", resultado=" + resultado +" "+getMonedaDeCambio()+ '}';
    }
}
