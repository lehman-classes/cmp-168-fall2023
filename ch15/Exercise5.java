class Exercise5 {

// public static int getSum(int a, int b){
// 	if(a==0){ //base case
// 		return b;
// 	}
// 	else{
// 		return getSum( a-1, b+1); //recursive call
// 	}
// }

  public int getProduct(int a, int b){
  	if(a==0){ //base case
  		return 0;
  	} else{
  		return b + getProduct( a-1, b); //recursive call
  	}
  }

  public static void main(String[] args) {

    Exercise5 ex = new Exercise5();
    int result = ex.getProduct(3, 5);
    System.out.printf("The product is %d\n", result);

    System.exit(0);

  }
}
