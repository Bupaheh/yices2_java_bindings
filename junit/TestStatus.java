import com.sri.yices.Status;
import org.junit.Assert;
import org.junit.Test;

public class TestStatus {
    @Test
    public void testStatus() {
        for (int i=0; i<Status.NUM_STATUSES; i++) {
            Status s = Status.idToStatus(i);
            Assert.assertEquals(s.getIndex(), i);
            System.out.println("index " + i + ": status = " + s);
        }
        Status error = Status.idToStatus(-100);
        System.out.println("index -100: status = " + error);
        Assert.assertEquals(error, Status.ERROR);

        Status another_error = Status.idToStatus(20);
        System.out.println("index 20: status = " + error);
        Assert.assertEquals(another_error, Status.ERROR);
    }
}