package ch02;

public class BinarySearchProblem {

	// 여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법
	// 단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어진다.
	// 수가 정렬된 상태에서는 이진 탐색(binary search)을 이용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있다.
	// 수의 예 : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]
	// 83의 위치를 찾아보세요
	
	// 수가 정렬된 상태이므로 중간의 값을 하나 선택한 후 찾으려는 값이 그보다 크면 범위를 오른쪽으로, 작으면 왼쪽으로 보내 좁힐 수 있다.
	// 한번 비교할 때 마다 1/2씩 범위가 좁혀진다.
	public static void main(String[] args) {

		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;
		
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) {
			
			if(target == temp) {
				find = true;
				break;
			}
			else if(target < temp) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
			
			mid = (left + right) / 2;
			temp = numbers[mid];
		}
		
		if(find == true) 
		{
			mid++;
			System.out.println("찾는 수는 " + mid + "번째 있습니다.");
		}
		else System.out.println("찾는 수가 없습니다.");

	}

}
