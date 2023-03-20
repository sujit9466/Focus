package EcommerceAssingment_Inheretance;
public class ElectronicProduct extends Product {
    private String serialNumber;
    private int warrantyDuration;

    public ElectronicProduct() {
        serialNumber = "NA";
        warrantyDuration = 0;
    }

    public ElectronicProduct(
            int id,
            String title,
            float price,
            String serialNumber,
            int warrantyDuration
    ) {
        super(id, title, price);
        this.serialNumber = serialNumber;
        this.warrantyDuration = warrantyDuration;

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getWarrantyDuration() {
        return warrantyDuration;
    }

    public void setWarrantyDuration(int warrantyDuration) {
        this.warrantyDuration = warrantyDuration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("sr no = " + serialNumber);
        System.out.println("warranty = " + warrantyDuration);
        System.out.println("-------------------------------------------");
    }
}




