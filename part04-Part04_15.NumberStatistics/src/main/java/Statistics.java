import java.util.ArrayList;

public class Statistics {
    private int count, sum;

    public  Statistics(){
    }

    public void addNumber(int num) {
        this.sum += num;
        count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if(count == 0) {
            return 0;
        }
        return 1.0 * sum / count;
    }
}
