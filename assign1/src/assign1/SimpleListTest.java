package assign1;

public class SimpleListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleList list = new SimpleList();
		for(int i = 1; i < 11; i++){
			list.add(i);
		}
		
		System.out.println("List: "+list.toString());
		System.out.println("Count: "+list.count());
	      
	    list.remove(10);
	    System.out.println("List: "+list.toString());
	    System.out.println("Count: "+list.count());
	      
	    System.out.println("parameter 8 found at index: " + list.search(8));
	       
	}

}
