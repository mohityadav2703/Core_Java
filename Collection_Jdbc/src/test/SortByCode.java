package test;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortByCode implements Comparator{
	public int compare(Object o1,Object o2)
	{
		BookDetails ob1=(BookDetails)o1;
		BookDetails ob2=(BookDetails)o2;
		int k=ob1.code.compareTo(ob2.code);
		if(k==0)
			return 0;
		else if(k>0)
			return 1;
		else
			return -1;
	}
}
