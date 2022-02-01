class BubbleSort{
	public static void main(String args[]){
		//ystem.out.println("Hello World!");
		int[] a = {5, 20, 35, 10, 2};
		int temp;
		int flag=0;

		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
			System.out.println("\n");
			for(int k=0; k<a.length; k++)
			System.out.print(a[k] + " ");
			
		}
	}
}