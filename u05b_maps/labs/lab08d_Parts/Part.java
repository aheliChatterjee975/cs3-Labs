public class Part implements Comparable<Part>
{
	private String make, mode, part;
	private int partNumber, year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		
		
		int len = list.length;
		year = Integer.parseInt(list[len - 1]);
		mode = list[len - 2];
		make = list[len - 3];
		partNumber = Integer.parseInt(list[len - 4]);
		
		
		part = "";
		for (int i = 0; i < len - 4; i++) {
			part += list[i] + " ";
		}
		part = part.trim();
	}

	
	public int compareTo( Part other )
	{
		if (!this.make.equals(other.make)) {
			return this.make.compareTo(other.make);
		}
		if (!this.mode.equals(other.mode)) {
			return this.mode.compareTo(other.mode);
		}
		if (this.year != other.year) {
			return this.year - other.year;
		}
		
		if (!this.part.equals(other.part)) {
			return this.part.compareTo(other.part);
		}
		return this.partNumber - other.partNumber;
	}

	public String toString()
	{
		return make + " " + mode + " " + year + "  " + part + " " + partNumber;
	}
}
