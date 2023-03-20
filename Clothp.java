
public class Clothp extends Cartp {
    private float hight;
	private float width;
	private float thick;
	public Clothp() {
		width=hight=thick = 0;
		
		
	}
	public Clothp( int id,
            String title,
            float price,
            float width,
            float hight,
            float thick) {
		super(id,title, price );
		this.hight=hight;
		this.width=width;
		this.thick=thick;
	}
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		this.hight = hight;
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
	public float getThick() {
		return thick;
	}
	public void setThick(float thick) {
		this.thick = thick;
	}
	public void Display() {
		super.display();
		
		System.out.println("width = " + width + " height = " + hight);
        System.out.println("thickness = " + thick);
        System.out.println("------------------------------------");
		
	}
	
}
