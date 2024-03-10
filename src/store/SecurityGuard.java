package store;

public class SecurityGuard extends AbstractStoreEmployee {

    private boolean nightShift;

    public SecurityGuard(double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay, String name, boolean nightShift) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, name);
        this.nightShift = nightShift;
    }

    public boolean isNightShift() {
        return nightShift;
    }

    public void setNightShift(boolean nightShift) {
        this.nightShift = nightShift;
    }

    @Override
    public double calculatePay() {
        // Implementasi perhitungan gaji untuk SecurityGuard
        return super.getBasePay() + (super.getNumberOfHoursWorked() * super.getHourlyRate());
    }

    @Override
    public boolean checkPromotionEligibility() {
        // Implementasi pengecekan kelayakan promosi untuk SecurityGuard
        return false; // Atau implementasi yang sesuai dengan kebutuhan Anda
    }

    @Override
    public String toString() {
        return super.toString() + "\nNight Shift: " + (nightShift ? "Yes" : "No");
    }
}

