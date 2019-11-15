import java.util.HashMap;
import java.util.Map;

public class Mince {

    private int hodnotaMince;

    public Mince(int hodnotaMince) {
        this.hodnotaMince = hodnotaMince;
    }

    public int getHodnotaMince() {
        return hodnotaMince;
    }

    public void setHodnotaMince(int hodnotaMince) {
        this.hodnotaMince = hodnotaMince;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private Map<Integer, Mince> MinceMap = new HashMap<>();


}
