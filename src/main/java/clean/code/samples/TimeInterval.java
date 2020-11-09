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
         throw new UnsupportedOperationException();
    }
}
