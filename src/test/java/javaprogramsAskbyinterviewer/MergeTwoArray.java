package javaprogramsAskbyinterviewer;

public class MergeTwoArray {
public static void main(javastringpro[] args) {
	int[] arr1 = {11, 34, 66, 75};
    int n1 = arr1.length;
    int[] arr2 = {1, 5, 19, 50, 89, 100};
    int n2 = arr2.length;
    int n3=n1+n2;
    System.out.println(n3);
    for(int i=0;i<n1;i++) {
    	System.out.println(arr1[i]);
    }
    for(int j=0;j<n2;j++) {
    	System.out.println(arr2[j]);
    }
}
}