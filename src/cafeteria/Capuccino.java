package cafeteria;

public class Capuccino extends Cafe {

    private double costoLeche = 1.5;
    private double costoCanela = 0.75;
    private double costoChocolate = 1.75;

    public Capuccino() {
    }

    
    
    
    public double getCostoLeche() {
        return costoLeche;
    }

    public void setCostoLeche(double costoLeche) {
        this.costoLeche = costoLeche;
    }

    public double getCostoCanela() {
        return costoCanela;
    }

    public void setCostoCanela(double costoCanela) {
        this.costoCanela = costoCanela;
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
        return costoExtra = (costoLeche + costoCanela + costoChocolate);
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }

    /* public double CostoExtra() {
        double CostoExtra = (costoLeche + costoCanela + costoChocolate);
        return Capuccino.getCostoExtra();
    }*/
   public double costoTotal() {
        double costoTotal = getCostoExtra() + getPrecioBase();
        return costoTotal();
    }


}
