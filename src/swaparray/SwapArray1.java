package swaparray;

import java.util.Scanner; 
public class SwapArray1 
{ 
                 public static void main(String args[]) 
           { 
                     int x,y; 
                     Scanner s1=new Scanner(System.in); 
                     System.out.print("Enter the Size of Array : "); 
                     y=s1.nextInt(); 
                     int a[]=new int[y]; 
                     int b[]=new int[y]; 
                     System.out.println("\nEnter The Elements In First Array\n"); 
                           for(x=0;x<a.length;x++) 
                                 a[x]=s1.nextInt(); 
                                 System.out.println("\nEnter The Elements In Second Array\n"); 
                                 for(x=0;x<b.length;x++) 
                                 b[x]=s1.nextInt(); 
                                 System.out.print("The Elements of First Array : "); 
                                 for(x=0;x<a.length;x++) 
                                     { 
                                         System.out.print(a[x]+" "); 
                                     } 
                                         System.out.print("\nThe Elements of second Array : "); 
                                 for(x=0;x<b.length;x++) 
                                     { 
                                         System.out.print(b[x]+" "); 
                                     } 
                                         System.out.print("\n"); 
                                 for(x=0;x<y;x++) 
                                    { 
                                         a[x]=a[x]+b[x]; 
                                         b[x]=a[x]-b[x]; 
                                         a[x]=a[x]-b[x]; 
                                     } 
                                         System.out.println("\nAfter swaping the Output is \n"); 
                                         System.out.print("The Elements of First Array : "); 
                                 for(x=0;x<a.length;x++) 
                                    { 
                                         System.out.print(a[x]+" "); 
                                    } 
                                         System.out.print("\nThe Elements of second Array : "); 
                                 for(x=0;x<b.length;x++) 
                                   { 
                                         System.out.print(b[x]+" "); 
                                   } 
                                         System.out.print("\n"); 
              } 
} 