package ma.sii.workshop.monolith.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

@Getter
@RequiredArgsConstructor
public abstract class Response implements Serializable {

    private final StatusCode statusCode;
    private final String message;
    private final Object result;

    public Response(Object result) {
        this.statusCode = StatusCode.OK;
        this.message = StringUtils.EMPTY;
        this.result = result;
    }
}
