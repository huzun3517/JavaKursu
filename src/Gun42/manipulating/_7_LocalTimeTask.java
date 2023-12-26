package Gun42.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class _7_LocalTimeTask {
    //using current LocalTime
    //1. test current time with plus minute and plus hour :
    //      Şu andaki zamana 1 saat ve 1 dakika ekleyerek sonucun saatini ve dakikasını ayrı ayrı test ediniz.
    //2. test current time with minus minute and plus hour:
    //      Şu andaki zamana 1 saat ve 1 dakika çıkartarak sonucun saatini ve dakikasını ayrı ayrı test ediniz.

    @Test
    public  void testPLus() {
        LocalTime time= LocalTime.now();
        LocalTime actualtime=time.plusHours(1).plusMinutes(1);

        Assert.assertEquals(23,actualtime.getHour());
        Assert.assertEquals(48,actualtime.getMinute());
    }

    @Test
    public  void testMinus() {
        LocalTime time= LocalTime.now();
        LocalTime actualtime=time.minusHours(1).minusMinutes(1);

        Assert.assertEquals(21,actualtime.getHour());
        Assert.assertEquals(46,actualtime.getMinute());
    }
}
