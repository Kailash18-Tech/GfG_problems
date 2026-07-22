class Solution {
	public void rotateArr(int arr[], int d) {
		d = d % arr.length;
		int[] res = new int[arr.length];
		
		for (int i = 0 ; i < arr.length; i++) {
			res[i] = arr[(i+d)%arr.length];
		}
		
		for (int i = 0 ; i< arr.length ; i++) {
			arr[i] = res[i];
		}
		
	}
}
