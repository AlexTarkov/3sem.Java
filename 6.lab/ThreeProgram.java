class ThreeProgram{
	
	static int N;
	
	public static void main(String args[]){
		String param = args[0];
		if(param.equals("-2")) {N = Integer.parseInt(args[1]); func2(); }
		if(param.equals("-1")) { func1(); }
		if(param.equals("-3")) { func3(); }
		
		}
	
	static void func1(){
		int i = 2;
		while(i<101){
			System.out.print(i+" ");
			i+=2;
			}
		System.exit(0);
		}
	
	static void func2(){
		int i = 2;
		int sum = 1;
		while(i<=N){
			sum+=i*i;
			i++;
			}
		System.out.print("Sum = "+sum);
		System.exit(0);
		}
	
	static void func3(){
		int i = 1;
		int sum = 0;
		while(i<100){
			sum+=i;
			i+=2;
			}
		System.out.print("Sum = "+sum);
		System.exit(0);
		}
	
	}