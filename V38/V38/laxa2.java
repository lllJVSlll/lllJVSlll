package V38;

import java.util.Scanner;

public class laxa2 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
	
int tal1 = 0;
int tal2 = 0;
int tal3 = 0; 
int tal4 = 0;
int tal5 = 0;


System.out.println("Skriv in 5 heltal(kan vara negativa ocks�)");
tal1 = input.nextInt();
tal2 = input.nextInt();
tal3 = input.nextInt();
tal4 = input.nextInt();
tal5 = input.nextInt();


double medel = (tal1 + tal2 + tal3 + tal4 + tal5);
double medel2 = (medel)/5;



if (tal1 >=tal2 & tal1 >=tal3 & tal1 >=tal4 & tal1 >=tal5) {
System.out.println("H�gsta talet:" + tal1);
}
else if (tal2 >=tal1 & tal2 >=tal3 & tal2 >=tal4 & tal2 >=tal5) {
System.out.println("H�gsta talet:" + tal2);
}
else if (tal3>=tal1 & tal3 >=tal2 & tal3 >=tal4 & tal3 >=tal5) {
System.out.println("H�gsta talet:" + tal3);
}
else if (tal4 >=tal1 & tal4 >=tal2 & tal4 >=tal3 & tal4 >=tal5) {
System.out.println("H�gsta talet:" + tal4);
}
else if (tal5 >=tal1 & tal5 >=tal2 & tal5 >=tal3 & tal5 >=tal4) {
System.out.println("H�gsta talet:" + tal5);


if (tal1 <=tal2 & tal1 <=tal3 & tal1 <=tal4 & tal1 <=tal5) {
System.out.println("L�gsta talet:" + tal1);
}
else if (tal2 <=tal1 & tal2 <=tal3 & tal2 <=tal4 & tal2 <=tal5) {
System.out.println("L�gsta talet:" + tal1);
}
else if (tal3 <=tal1 & tal3 <=tal2 & tal3 <=tal4 & tal3 <=tal5) {
System.out.println("L�gsta talet:" + tal1);
}
else if (tal4 <=tal1 & tal4 <=tal2 & tal4 <=tal3 & tal4 <=tal5) {
System.out.println("L�gsta talet:" + tal1);
}
else if (tal5 <=tal1 & tal5 <=tal2 & tal5 <=tal3 & tal5 <=tal4) {
System.out.println("L�gsta talet:" + tal1);
}

System.out.println("Medelv�rde:" + medel2);
}

}
}