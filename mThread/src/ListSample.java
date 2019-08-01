import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> iList = Arrays.asList(3,4,5,77,88);
		List<String> sList = Arrays.asList("Smith","Peter","Roger","Uma");

		print(iList);
		print(sList);
		
		List<Integer> idList = new ArrayList<>();
		List<String> sdList = new ArrayList<>();
		copy(idList,iList);
		copy(sdList,sList);
		System.out.println(idList);
		System.out.println(sdList);
	}

	//unknown type allows only accessors not mutators
	//adding new object or defined object type not allowed
	private static void print(List<?> iList) {
		// TODO Auto-generated method stub
		for(Object o:iList)
		{
			System.out.println(o);
		}
		
	}
	
	private static <T> void copy(List<T> dest, List<T> src)
	{
		for(T e:src)
		{
			dest.add(e);
		}
	}

}
