package ChorsmanHomeWork.ChHW3.Ch9.ex2;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WordClock extends Clock{
    private ZonedDateTime zdt2;
    public WordClock(int zone) {
        Set<String> hei =ZoneId.getAvailableZoneIds();
        List<String> f=new ArrayList<>();
        for (String s : hei) {
            f.add(s);
        }
        ZoneId zoneId = ZoneId.of(f.get(zone));
        Instant instant = Instant.now();
        this.zdt2 = instant.atZone(zoneId);
        System.out.println(zdt2);
    }

    @Override
    public String getHours() {
        return String.valueOf(zdt2.getHour());
    }

    @Override
    public String getMinutes() {
        return String.valueOf(zdt2.getMinute());
    }
}
