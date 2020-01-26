// sort hashmap in alphabetic order
import java.util.*;
public class hash
{
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			int key = sc.nextInt();
			String value = sc.next();
			hm.put(key, value);
		}
		HashMap<Integer,String> hm1=sort(hm);
		for(Map.Entry m:hm1.entrySet())
		{
		     System.out.println(m.getKey()+" "+m.getValue());
		}
		sc.close();
	}
	public static HashMap<Integer,String> sort(HashMap<Integer,String> hm)
	{
		List<Map.Entry<Integer, String> > l = 
        new LinkedList<Map.Entry<Integer, String> >(hm.entrySet());
		Collections.sort(l, new Comparator<Map.Entry<Integer,String> >() { 
            public int compare(Map.Entry<Integer, String> o1,  
                               Map.Entry<Integer,String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
		 HashMap<Integer,String> temp = new LinkedHashMap<Integer,String>(); 
        for (Map.Entry<Integer, String> aa : l) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 

	}	
}
