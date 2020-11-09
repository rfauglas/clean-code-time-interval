package clean.code.samples;

import java.time.LocalDate;

public class TimeInterval {
    private LocalDate start;
    private LocalDate end;

    public TimeInterval(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public boolean isIntersectionEmpty(TimeInterval timeInterval) {

        LocalDate end = timeInterval.end;
        LocalDate start = this.start;
        if (end.isBefore(start) || end.isEqual(start))
            return true;
        LocalDate end1 = this.end;
        LocalDate start1 = timeInterval.start;
        if (end1.isBefore(start1) || start1.isEqual(end1))
            return true;
        return false;
    }
}
