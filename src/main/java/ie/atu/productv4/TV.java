package ie.atu.productv4;

public class TV extends Product{

    private String size;
    private String manufacture;

    public TV() {
        super();
        size = "";
        manufacture = "";
        count++;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture
                + "\nScreen size is " + size;
    }
}
