package cafeteria;

public class Cafe {

    protected double precioBase = 5;
    protected double costoExtra = 0;

    public Cafe() {
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getCostoExtra() {
        return costoExtra;
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }

    public double calcularCostoTotal() {
        double costoTotal = precioBase + costoExtra;
        return costoTotal;
    }
}
