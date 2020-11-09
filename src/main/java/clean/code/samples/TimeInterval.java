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

        if (timeInterval.end.isBefore(start) || timeInterval.end.isEqual(start))
            return true;
        if (timeInterval.start.isAfter(end) || timeInterval.start.isEqual(end))
            return true;
        return false;
    }
}
