import java.util.ArrayList;
public class List {
	public static void main(String args[])
	{
	ArrayList<Integer> l1 = new ArrayList();
	ArrayList<Integer> l2 = new ArrayList();
	
	l1.add(1);
	l1.add(1);
	l1.add(1);
	
	l2.add(2);
	l2.add(2);
	l2.add(2);
	
	l1.addAll(l2);
	
	
	for (Integer s: l1){
		System.out.println(s.toString());
		
	
	/*ArrayList<String> aL = new ArrayList<String>();
	
	aL.add("Java");
	aL.add("PERL");
	aL.add("C++");
	aL.add("PHP");
	
	System.out.println("Does the list contain Java? " + aL.contains("Java") );
	
	System.out.println(aL);
	System.out.println(aL.isEmpty());
	
	*/
	}
	
}
	




}
