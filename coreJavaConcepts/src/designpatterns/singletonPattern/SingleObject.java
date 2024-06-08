package SingletonPattern;

public class SingleObject {

		private SingleObject()
		{
			
		}
		
		private static SingleObject SingleInstance=new SingleObject();
		
		public static SingleObject getInstance() 
		{
			return SingleInstance;
		}
		
		public void showMessage() 
		{
			System.out.println("Hello World");
		}
}
