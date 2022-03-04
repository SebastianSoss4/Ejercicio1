public class Fibo{
	public int fibo(int x){
		if(x>2){
			return fibo(x-1) + fibo(x-2);
		}else{
			if(x==2){
				return 1;
			}else return 0;
		}
	}
}