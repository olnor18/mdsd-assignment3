//Generated by xtext. Generator by olnor18
package math_expression;
public class Test30 {
	
	private External external;
	
	public Test30(External external) {
		this.external = external;
	}
	
	public void compute() {
		x = sqrt(pow(pi(), 2));
	}

	interface External {
		public int pow(int n, int m);
		public int sqrt(int n);
		public int pi();
	}
}
