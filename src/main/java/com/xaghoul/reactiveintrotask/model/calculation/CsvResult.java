package com.xaghoul.reactiveintrotask.model.calculation;

import java.util.List;

public interface CsvResult {
    List<Object> getData();

    default String getDataAsString() {
        return getData().stream()
                .map(Object::toString)
                .toString();
    }
}
