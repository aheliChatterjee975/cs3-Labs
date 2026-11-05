import static java.lang.System.*;
import java.util.*;

public class HeapSortGenericRunner
{
	public static void main ( String[] args )
	{
		Comparable[] values = {99, 2, 8, 75, 10, 7, 9, 17, 5, 3, 4, 1, 11, 1};
		System.out.println(Arrays.toString(values));
		HeapSortGeneric.heapSort(values);
		System.out.println(Arrays.toString(values) + "\n");

		values = new Comparable[] {"ZAP!", "BAM!", "EEK!", "KA-POW!", "BOOM!", "SWOOSH", "THUD", "AARRGGHH" };
		System.out.println(Arrays.toString(values));
		HeapSortGeneric.heapSort(values);
		System.out.println(Arrays.toString(values));
	}
}