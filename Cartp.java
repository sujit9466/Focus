
public abstract class Cartp {
    private int id;
    private String title;
    private float price;

    public Cartp() {
        id = -1;
        title = "Not Available";
        price = 0f;
    }

    public Cartp(int id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display() {
        System.out.println("id = " + id);
        System.out.println("title = " + title);
        System.out.println("price = " + price);
    }
}
