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
        if (isBeforeOrEqual(end, start))
            return true;
        LocalDate end1 = this.end;
        LocalDate start1 = timeInterval.start;
        if (isBeforeOrEqual(end1, start1))
            return true;
        return false;
    }

    private boolean isBeforeOrEqual(LocalDate end, LocalDate start) {
        return end.isBefore(start) || end.isEqual(start);
    }
}
