/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

/**
 *
 * @author HP
 */
public class UnsortedArray {
    static int findElement(int arr[],int n,int key)
    {
        for(int i =0;i<n;i++)
        if(arr[i]==key)
            return i;
        //if the key is not found
        return -1;
    }
    //Driver's Code
    public static void main(String[] args) {
        int arr[]={12,34,10,6,40};
        int n=arr.length;
        //Using a last element as search element
        int key=40;
        //function call
        int position=findElement(arr,n,key);
        if(position== -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: " +(position+1));
    }
}
