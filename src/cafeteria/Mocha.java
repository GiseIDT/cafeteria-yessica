package cafeteria;

public class Mocha extends Cafe {

    private double costoLeche = 1.5;
    private double costoChocolate = 1.75;

    public Mocha() {
    }

    public double getCostoLeche() {
        return costoLeche;
    }

    public void setCostoLeche(double costoLeche) {
        this.costoLeche = costoLeche;
    }

    public double getCostoChocolate() {
        return costoChocolate;
    }

    public void setCostoChocolate(double costoChocolate) {
        this.costoChocolate = costoChocolate;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getCostoExtra() {
        return costoExtra=(costoLeche +  costoChocolate);
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }

    /* public double CostoExtra() {
        double CostoExtra = costoLeche +  costoChocolate;
        return CostoExtra();
    }*/

    public double costoTotal() {
        double costoTotal = getCostoExtra() + getPrecioBase();
        return costoTotal();
    }

    
}
