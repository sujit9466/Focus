package generics;

public  class Util {

	
	public static void stringHoP( Holder<String> stringHolder) {
	stringHolder.setData(stringHolder.getData().toUpperCase());
}
	
	public static void allType( Holder<?> holder) {
		System.out.println(holder.getData());
		
		System.out.println(holder.getData());
		System.out.println(holder.getClass());
	}
	
	public static void numericHolder(Holder<? extends Number> numberHolder ) {
		System.out.println(numberHolder.getData());
		
	}
}
