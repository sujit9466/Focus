package EcommerceAssingment_Inheretance;
public class ClothingProduct extends Product {
   private float width, height;
    private float thinkness;

    public  ClothingProduct() {
        width = height = thinkness = 0;
    }

    public ClothingProduct(
            int id,
            String title,
            float price,
            float width,
            float height,
            float thinkness
    ) {
        super(id, title, price);
        this.width = width;
        this.height = height;
        this.thinkness = thinkness;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("width = " + width + " height = " + height);
        System.out.println("thickness = " + thinkness);
        System.out.println("------------------------------------");
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if(width <= 0) {
            return;
        }
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getThinkness() {
        return thinkness;
    }

    public void setThinkness(float thinkness) {
        this.thinkness = thinkness;
    }
}
