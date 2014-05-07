
public class Integer implements Comparable<Integer> {
	
	//Private Data Members
	private int order;
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	private int random_number;
	
	//Getters and setters methods
	public int getRandom_number() {
		return random_number;
	}
	public Integer(int order, int random_number) {
		super();
		this.order = order;
		this.random_number = random_number;
	}
	public void setRandom_number(int random_number) {
		this.random_number = random_number;
	}
	
	@Override
	//Method to compare two Integer objects, based on difference between random number of the two Integer objects
	public int compareTo(Integer arg0) {
		return this.random_number - arg0.getRandom_number();
	}
	
}
