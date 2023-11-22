package p001;

import java.util.Scanner;

public class ConverteTemperatura {
private double celsius, fahrenheit;
public ConverteTemperatura() {
	this.celsius = 0;
	this.fahrenheit = 0;
}

public double getCelsius() {
	return celsius;
}

public void setCelsius(double celsius) {
	this.celsius = celsius;
}

public double getFahrenheit() {
	return fahrenheit;
}

public void setFahrenheit(double fahrenheit) {
	this.fahrenheit = fahrenheit;
}
public void celsiusParaFahrenheit() {
	this.fahrenheit = (this.celsius*9/5)+32;
	System.out.println(this.celsius+"°C -> "+this.fahrenheit+"°F");
}
public void fahrenheitParaCelsius() {
	this.celsius = (this.fahrenheit-32)*5/9;
	System.out.println(this.fahrenheit+"°F -> "+this.celsius+"°C");
}

public static void main(String[] args) {
	ConverteTemperatura t1 = new ConverteTemperatura();
	double temp;
	char t;
	Scanner s = new Scanner(System.in);
	System.out.println("Digite a temperatura");
	temp = s.nextDouble();
	System.out.println("Digite a unidade de medida (c ou f)");
	t = s.next().charAt(0);
	if (t=='c') {
		t1.setCelsius(temp);
		t1.celsiusParaFahrenheit();
		temp = t1.getFahrenheit();
	}
	if (t=='f') {
		t1.setFahrenheit(temp);
		t1.fahrenheitParaCelsius();
		temp = t1.getCelsius();
	}
	
}
}
