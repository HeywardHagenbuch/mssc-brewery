package springframework.msscbrewery.web.mappers;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
@Component
public class DateMapper {
    public OffsetDateTime asOffsetDateTime(java.sql.Timestamp ts) {
        if (ts != null) {
            return OffsetDateTime.of(ts.toLocalDateTime().getYear(), ts.toLocalDateTime().getMonthValue(),
                    ts.toLocalDateTime().getDayOfMonth(), ts.toLocalDateTime().getHour(),
                    ts.toLocalDateTime().getMinute(), ts.toLocalDateTime().getSecond(),
                    ts.toLocalDateTime().getNano(), OffsetDateTime.now().getOffset());
        } else {
            return null;
        }
    }

    public Timestamp asTimestamp(OffsetDateTime offsetDateTime) {
        if (offsetDateTime != null) {
            return Timestamp.valueOf(offsetDateTime.atZoneSameInstant(OffsetDateTime.now().getOffset()).toLocalDateTime());
        } else {
            return null;
        }
    }
}
