package src.vehiculos;

public abstract class Vehiculo {
    
    protected int cantGalones, cantPasajeros, velocidadMaxima;
    protected double aceleracionBase;
    protected boolean esGasolina;

    public Vehiculo() {
    }

    public Vehiculo(int cantGalones, int cantPasajeros, int velocidadMaxima, double aceleracion, boolean esGasolina) {
        this.cantGalones = cantGalones;
        this.cantPasajeros = cantPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracion;
        this.esGasolina = esGasolina;
    }

    @Override
    public String toString() {
        return "\n  Aceleracion Base: " + aceleracionBase + ",\n  Cantidad de Galones: " + cantGalones + ",\n  Cantidad de Pasajeros: "
                + cantPasajeros + ",\n  Combustible: " + getCombustible(esGasolina) + ",\n  Velocidad Maxima: " + velocidadMaxima;
    }

    public String getCombustible(boolean esGasolina) {
        if (esGasolina) {
            return "Gasolina";
        } else {
            return "Diesel";
        }
    }

    public int getCantGalones() {
        return cantGalones;
    }

    public void setCantGalones(int cantGalones) {
        this.cantGalones = cantGalones;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracion() {
        return aceleracionBase;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracionBase = aceleracion;
    }

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public void setEsGasolina(boolean esGasolina) {
        this.esGasolina = esGasolina;
    }

    

}
