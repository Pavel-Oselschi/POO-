package task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(Complex other) {
        this(other.real, other.imaginary);
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void showNumber() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);
        c1.showNumber();
        c2.showNumber();
        c1.addWithComplex(c2);
        c1.showNumber(); // "4 + 6i"
    }
}
