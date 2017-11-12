package effectiveJava.rule05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {

    private final Date birthDate = null;

    public boolean isBabyBoomer(){
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946 , Calendar.JANUARY , 1,0,0,0);
        Date boomStart = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0;
    }
}
