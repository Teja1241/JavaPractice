
public class EqlHshEx {

	public int id;
	public String name;

	public EqlHshEx(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args)
	{
		EqlHshEx a = new EqlHshEx(1, "ABD");
		EqlHshEx b = new EqlHshEx(1, "ABD");
		System.out.println("ABD hashcode = " + a.hashCode());
		System.out.println("ABD hashcode = " + b.hashCode());
		System.out.println("Checking equality between a and b = " + a.equals(b));
	}
}
