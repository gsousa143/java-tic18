package exercicios;

import java.util.Scanner;

public class CvrTemp {
static public double fharParaCelsius(double f) {
	return (f-32)*5/9;
}
static public double celciusParaFhar(double c) {
	return (c*9/5)+32;
}
static public double cvrTemp(double temp,int flag) {
	if(flag==1)
		return CvrTemp.fharParaCelsius(temp);
	else
		return CvrTemp.celciusParaFhar(temp);
}
public static void main(String[] args) {
	int in;
	double temp, tempCvr;
	Scanner s = new Scanner(System.in);
	System.out.println("Digite a temperatura");
	temp = s.nextDouble();
	System.out.println("Caso esteja em ºC digite 0, se estive em ºF digite 1");
	in = s.nextInt();
	
	System.out.println("VERSAO 1");
	tempCvr = CvrTemp.cvrTemp(temp, in);
	System.out.println(tempCvr);
	
	System.out.println("VERSAO 2");
	if(in==1) {
		tempCvr = CvrTemp.fharParaCelsius(temp);
	}else
		tempCvr = CvrTemp.celciusParaFhar(temp);
	System.out.println(tempCvr);
	
}
}
