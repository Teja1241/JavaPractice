import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalRunExeServ 
{

	public static void main(String[] args) 
	{
	  Callable<String> ex = new Callable<String>()
			  
			  {
		  public String call() throws Exception
		  {
			  return "The work";
			  
			  
		  }
		  
			 };
			 ExecutorService executorservice = Executors.newSingleThreadExecutor();
			 Future<String> future = executorservice.submit(ex);
			 if(future.isDone())
			 {
				 System.out.println("done");
			 }
			 System.out.println("not done");
			 
	}
			 
			 
 	   

	}




