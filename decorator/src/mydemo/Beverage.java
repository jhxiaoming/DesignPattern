package mydemo;

public abstract class Beverage {

    private String description = "Unknown Beverage";
    private String size = "";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract float cost();

}
