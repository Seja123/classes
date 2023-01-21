class Different{
    public static void main(String[] args) {
        
    
        String str = "Hello ! Welcome to Computer Science Department";
        String str1 = "java123is456fun";
        System.out.println("The String is = " + str);
        System.out.println("The String2 is = " + str1);

        System.out.println("The substring is " + str.substring(0,15));
        System.out.println("The length of String is = " + str.length());
        System.out.println("The replaced String is (Replaccing to with the to the)");
        System.out.println(str.replace("to" , "to the"));
        System.out.println(str.replaceAll("D","P"));
        System.out.println("We are getting the character at the 5th position is " + str.charAt(6));
        int result = str.indexOf('S');
        System.out.println("Position of S in String " + str + "=" + result);
        int result1 = str.indexOf("C");
        System.out.println("Position stringc is = " + str +" =" + result1);
        System.out.println("Converting to lowercase = " + str.toLowerCase());
        System.out.println("Converting to uppercase" + str.toUpperCase());
        System.out.println();

    }   
}

//

class pattern1{
    public static void main(String args []) {
        
        int i,j;
        
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("" + j) ;
            }
            System.out.println();
        }
    }
}

//non recursive

class fibbonacci2{
    public static void main(String[] args) {
        int count=10,n1=0,n2=1,n3;
       for(int i=2;i<count;i++){
        n3=n1+n2;
        System.out.println(" " + n3);
        n1=n2;
        n2=n3;
       }
    }
}

//using recursive

class fibonacci{
    public static int fibonacciRecursion(int n){
       if(n==0){
        return 0;
       }
       if(n==1 || n==2){
        return 1;
       }
       return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);

    }
    public static void main (String args[]){
        int maxNumber=10;
        System.out.println("Fibonacci series of " + maxNumber + "numbers :");
        for(int i=0;i<maxNumber;i++){
            System.out.println(fibonacciRecursion(i) + "");
        }
    }
}
    
     //
     
     class matrix{
    public static void main(String[] args) {
        int a [][] = {{5,2,3} ,{2,6,3},{6,9,1}};
        int b [][] ={{2,7,5} ,{1,4,3},{1,2,1}};
        int c [][] = new int [3][3];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for (int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];

                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//method overload

class overload{
    public static void main(String[] args) {
        overload A =new overload();
        System.out.println("Area of square = " + A.Area(10));
        System.out.println("Area of Rectangle is = " + A.Area (10,20));

    }
    int Area (int x)
    {
        int p=x*x;
        return(p);
    }
    int Area (int x, int y){
        return (x*y);
    }
}

//constructor overload

class overload2{
    public static void main(String[] args) {
        Box myBox1= new Box (10,20,30);
        Box myBox2 = new Box ();
        Box myCube = new Box (7);

        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of MyBox is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox is " + vol);

        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);

    }
}
class Box {
    double width,height,depth;
    
    Box (double w ,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box(){
        width=height=depth;

    }
    Box(double len){
        width=height=depth=len;

    }
    double volume(){
        return width*height*depth;
    }
}

//Scanner class

import java.util.*;
class Employee{
    int id;
    String name;
    String design;
    float salary;
}
class main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many employees ?");
        int n=sc.nextInt();
        Employee emp []= new Employee[n];
        for(int i=0;i<n;i++){
            emp [i]=new Employee();
            System.out.println("Enter" + (i+1)+ "Employee data : ");

            System.out.println("Enter Employee Id : ");
            emp[i].id=sc.nextInt();
            System.out.println("Enter Employee name : ");
            emp[i].name=sc.next();
            System.out.println("Enter Employee designation : ");
            emp[i].design=sc.next();
            System.out.println("Enter Employee salary : ");
            emp[i].salary=sc.nextFloat();
        
        System.out.println("Employee id,Name,designation & salary :" + emp[i].id + " "+ emp[i].name+" "+ emp[i].design + " "+ emp[i].salary);
    }
}
}

//
