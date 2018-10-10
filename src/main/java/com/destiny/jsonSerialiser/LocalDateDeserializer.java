package com.destiny.jsonSerialiser;

import java.io.IOException;
import java.time.LocalDate;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

    /**
     * Transform json into LocalDate.
     */
    private static final long serialVersionUID = 325190445641680507L;

    protected LocalDateDeserializer() {
        super(LocalDate.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        // Transform a json date into a LocalDate
        return LocalDate.parse(parser.readValueAs(String.class));
    }
}
