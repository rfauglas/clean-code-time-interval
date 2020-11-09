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
        if (isBeforeOrEqual(timeInterval.end, this.start))
            return true;
        if (isBeforeOrEqual(this.end, timeInterval.start))
            return true;
        return false;
    }

    private boolean isBeforeOrEqual(LocalDate end, LocalDate start) {
        return end.isBefore(start) || end.isEqual(start);
    }
}
