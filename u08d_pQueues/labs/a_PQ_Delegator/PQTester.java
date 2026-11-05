import java.util.Queue;
import java.util.Arrays;
import java.util.PriorityQueue;

// I called this class Delegator since it
// delegates most of its responsibilities
// to Java's PriorityQueue class.
public class PQ_Delegator {
	private Queue<String> pQueue;
	int size = 0;

	public PQ_Delegator() {

	}

	public PQ_Delegator(String list) {

	}

	public void setPQ(String list) {

	}

	// Use delegation to get the PriorityQueue object to actually
	// do the work for the add, getMin, & removeMin methods.
	public void add(String obj) {

	}

	public String getMin() {

	}

	public String removeMin() {

	}

	public String getNaturalOrder() {
		String output="";
		return output;
	}

	public String toString() {

	}
}