package cafeteria;

public class Latte extends Cafe {

    private double costoLeche = 1.5;
    private double costoLecheEspuma = 2.5;

    public Latte() {
    }

    public Latte(double costoLeche, double costoLecheEspuma) {
        this.costoLeche = costoLeche;
        this.costoLecheEspuma = costoLecheEspuma;
    }

    public double getCostoLeche() {
        return costoLeche;
    }

    public void setCostoLeche(double costoLeche) {
        this.costoLeche = costoLeche;
    }

    public double getCostoLecheEspuma() {
        return costoLecheEspuma;
    }

    public void setCostoLecheEspuma(double costoLecheEspuma) {
        this.costoLecheEspuma = costoLecheEspuma;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getCostoExtra() {
        return costoExtra = (costoLeche + costoLecheEspuma);
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }

    /* public double CostoExtra() {
        double CostoExtra = costoLeche + costoLecheEspuma;
        return CostoExtra();
    }*/
    public double costoTotal() {
        double costoTotal = getCostoExtra() + getPrecioBase();
        return costoTotal();
    }

}
