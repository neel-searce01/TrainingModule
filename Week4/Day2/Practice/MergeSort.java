class MergeSort{
	int[] arr;
	int[] tempArr;
	int length;

	public void sort(int inputArr[]){
		this.arr = inputArr;
		this.length = inputArr.length;
		this.tempArr = new int[length];
		divideArray(0, length-1);
	}

	public void divideArray(int lowerindex, int higherindex){
		if(lowerindex<higherindex){
			int middle = lowerindex + (higherindex - lowerindex) / 2;
			divideArray(lowerindex, middle);
			divideArray(middle+1, higherindex);
			mergeArray(lowerindex, middle, higherindex);
		}
	}

	public void mergeArray(int lowerindex, int middle, int higherindex){
		for(int i = lowerindex; i<=higherindex; i++)
			tempArr[i] = arr[i];
		int i = lowerindex;
		int j = middle + 1;
		int k = lowerindex;

		while(i<=middle && j<=higherindex){
			if(tempArr[i]<tempArr[j]){
				arr[k] = tempArr[i];
				i++;
			}
			else{
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}

		/*while(i<=middle){
			arr[k] = tempArr[i];
			i++;
			k++;
		}*/
	}

	public static void main(String[] args){
		int[] i = {25, 30, 35, 10, 50};
		MergeSort ms = new MergeSort();
		ms.sort(i);
		for(int t = 0; t<i.length; t++)
			System.out.print(i[t] + " ");
	}
}