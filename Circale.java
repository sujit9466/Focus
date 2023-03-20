

	 class Circale extends Shape {
		private  int r;
		public Circale() {
			r=0;
			
		}
		public Circale(int x, int y,int r) {
			super(x,y);
			this.r = r;
		}
		public int getR() {
			return r;
		}
		public void setR(int r) {
			this.r = r;
		}		
		
		public float area() {
		return 3.14f*r*r;

		}
	public void draw() {
		System.out.println("x="+getX()+"y="+getY());
			System.out.println("circle"+"r="+r);
		}
		

	}


