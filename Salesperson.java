public class Salesperson {
    private int id;
    private double sales;

    public Salesperson(int id, double sales) {
        this.id = id;
        this.sales = sales;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSales() {
        return this.sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}