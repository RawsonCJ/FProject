package game.number;

public class FizzBuzzPrint {
	int i = 1;
	public void multiplesThreeOrFive() {
		System.out.println("=========Game Begin===========");
		while(i<=100){
			if (i%3 == 0 && i%5 != 0) {
				System.out.println("Fizz  ");
			} else if (i%5 ==0 && i%3 != 0){
				System.out.println("Buzz  ");
			} else if (i%3==0 && i%5==0) {
				System.out.println("FizzBuzz  ");
			}  else {
				System.out.println(i+"  ");
			}
			
			i++;
		}
		System.out.println("=========Game Over===========");
	}
	
	public void divisibleOrIncludeThreeOrFive() {
		i =1;
		System.out.println("=========Game Begin===========");
		while(i<=100){
			if ((i%3 == 0 || i%10 == 3 || i/10 == 3) && (i%5 !=0 )) {			
					System.out.println("Fizz  ");
			} else if ((i%5 ==0  || i%10 == 5 || i/10 == 5)  && (i%3 !=0 ) ){
					System.out.println("Buzz  ");
			} else if ((i%3 == 0 || i%10 == 3 || i/10 == 3) && (i%5 ==0  || i%10 == 5 || i/10 == 5)) {
				System.out.println("FizzBuzz  ");
			} else {
				System.out.println(i + "  ");
			}
			i++;
		}
		System.out.println("=========Game Over===========");
	}
	
	public static void main(String[] args) {
		FizzBuzzPrint test = new FizzBuzzPrint();
		test.multiplesThreeOrFive();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		test.divisibleOrIncludeThreeOrFive();
	}

}
