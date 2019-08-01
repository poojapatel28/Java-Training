import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class PoolClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		// one future doesn't wait for other to finish. 
		Future<Integer> f1 = service.submit(new Number(1, 500));
		Future<Integer> f2 = service.submit(new Number(433, 500));
		Future<Integer> f3 = service.submit(new Number(100, 500));
		Future<Integer> f4 = service.submit(new Number(1, 50));
		
		try {
			// get() only prints data once the flag of future is updated signifying response received. 
			System.out.println(f1.get());
			System.out.println(f2.get(100, TimeUnit.SECONDS));
			System.out.println(f3.get());
			System.out.println(f4.get());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		service.shutdown();
	}

}
