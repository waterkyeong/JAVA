package quiz;

public class Drinks_Main {

	public static void main(String[] args) {		
		
//		Juice juice = new Juice();
//		Coffee coffee = new Coffee();
//		Beer beer = new Beer();
//		Water water = new Water();
//		Tea tea = new Tea();
//		
//		juice.drink();
//		coffee.drink();
//		beer.drink();
//		water.drink();
//		tea.drink();
//		
		Drinks[] arr = new Drinks[5];
	
		arr[0] = new Juice();
		arr[1] = new Coffee();
		arr[2] = new Beer();
		arr[3] = new Water();
		arr[4] = new Tea();
		
		for(Drinks d : arr) {
			d.drink();
		}
		
		
		
		
//		Drinks[]drinks= {new Juice(),new Coffee(),new Beer(), new Water(),new Tea()};
//		for(Drinks drink : drinks ) {
//			drink.drink();
//		}
	}

}
