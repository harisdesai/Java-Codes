
public class Max_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,6,2,8,6,0,3,9};
		int n=a.length;
		int maximum=a[0];
		
		for(int i=0 ; i<n ; i++) {
			if(a[i]>maximum) {
				maximum=a[i];
			}
		}
		System.out.println(maximum+" is largest");
	}

}
