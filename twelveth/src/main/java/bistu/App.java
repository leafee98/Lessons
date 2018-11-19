package bistu;

import java.util.Scanner;

abstract class Bill {
    protected double volume;
    protected Bill() {
        this.volume = 0;
    }
    protected Bill(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return this.volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    abstract public double getBill();
}

class WaterBill extends Bill{
    private double[] rate = { 2.28, 2.5, 3.9 };
    public WaterBill() {
        super(0);
    }
    public WaterBill(double volume) {
        super(volume);
    }
    public double[] getRate() {
        return this.rate;
    }
    public void setRate(double[] rate) {
        this.rate = rate;
    }
    public double getBill() {
        double sum = 0;
        if (super.volume < 180) {
            sum += (super.volume - 0) * this.rate[0];
        } else {
            sum += 180 * this.rate[0];
            if (super.volume < 260) {
                sum += (super.volume - 180) * this.rate[1];
            } else {
                sum += (260 - 180) * this.rate[1];
                sum += (super.volume - 260) * this.rate[2];
            }
        }
        return sum;
    }
}

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        WaterBill testObject= new WaterBill(input.nextDouble());
        System.out.println("水费为" + testObject.getBill());

        input.close();
    }
}
