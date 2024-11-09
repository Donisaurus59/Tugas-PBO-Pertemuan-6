public class Zakat {
    private double penghasilan;
    private double zakatAmount;

    public Zakat(double penghasilan) {
        this.penghasilan = penghasilan;
        this.zakatAmount = calculateZakat();
    }

    public double getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
        this.zakatAmount = calculateZakat();
    }

    public double getZakatAmount() {
        return zakatAmount;
    }

    private double calculateZakat() {
        return penghasilan * 0.025;
    }
}
