public class OverloadDemo {

  public static void main(String[] args) {
    Complex c1 = new Complex(3, 13);
    Complex c2 = new Complex(2.2, 35);
    test(c1, c2);
  }

  static void test(Complex complex1, Complex complex2) {
    System.out.printf("%.1f + %.1fi", complex1.getReal() + complex2.getReal(),
        complex1.getImaginary() + complex2.getImaginary());
  }
}

class Complex {
  private double real;
  private double imaginary;

  Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  @Override
  public String toString() {
    return real + " + " + imaginary + "i\n";
  }

}
