//Generated by xtext. Generator by olnor18
package math_expression;
public class Test28 {
	
	private External external;
	
	public Test28(External external) {
		this.external = external;
	}
	
	public void compute() {
		x = sqrt(4);
		y = x * 2;
	}

	interface External {
		public int sqrt(int n);
	}
}
