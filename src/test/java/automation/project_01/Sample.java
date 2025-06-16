package automation.project_01;

public class Sample {
         int a=10;
         int b=20;
         static int c=30;
         static int d=40;
         
	     public void Method() {
			System.out.println(a);
			System.out.println(b);
		    System.out.println(Sample.c);
		    System.out.println(Sample.d);
		    int c = 50;
		    int a = 60;
		    System.out.println(Sample.c);
		    System.out.println(a);
			
		}	
//		public static void method1()
//		{
//			  Sample abc=new Sample();
//			System.out.println(abc.a);
//			System.out.println(abc.b);
//			System.out.println(Sample.c);
//		    System.out.println(Sample.d);
//		}
		public static void main(String[] args) {
			//method1();
			 Sample t=new Sample();
			 t.Method();
			
		}
		
	}




