package clean.code.samples;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeIntervalSepDefs implements  En{
    private TimeInterval referenceInterval;
    private TimeInterval testInterval;



    public TimeIntervalSepDefs() {
        ParameterType("localdate","\\d{2}/\\d{2}/\\d{4}",p1 -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//            formatter = formatter.withLocale( putAppropriateLocaleHere );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
            LocalDate date = LocalDate.parse(p1, formatter);
            return date;
        });
        Given("test interval starting in {localdate} ending {localdate}", (LocalDate startDate, LocalDate endDate) -> {
            testInterval = new TimeInterval(startDate,endDate);
        });
        Given("a reference interval starting in {localdate} ending in {localdate}", (LocalDate startDate, LocalDate endDate) -> {
            referenceInterval = new TimeInterval(startDate,endDate);
        });
        Then("saying 'interval intersection is empty' is {}", (Boolean expectResult) -> {
            Assert.assertEquals(expectResult,referenceInterval.isIntersectionEmpty(testInterval));
        });
    }
}
