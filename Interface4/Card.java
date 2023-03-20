package Interface4;
public class Card implements Loggable{

    private long cardNo;
    private String title;

    public Card(long cardNo, String title) {
        this.cardNo = cardNo;
        this.title = title;
    }

    @Override
    public void log(String filePath) {
        System.out.println("Card Log: " + cardNo  + " " + filePath);
    }

    @Override
    public void info() {
        System.out.println("Card info: " + cardNo + " " + title);
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo=" + cardNo +
                ", title='" + title + '\'' +
                '}';
    }
}
