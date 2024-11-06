package hello.advanced.trace;
import lombok.Getter;

@Getter
public class TraceStatus {

    private TraceId traceId;
    private Long startTime;
    private String message;

    public TraceStatus(TraceId traceId, Long startTime, String message) {
        this.traceId = traceId;
        this.startTime = startTime;
        this.message = message;
    }
}
