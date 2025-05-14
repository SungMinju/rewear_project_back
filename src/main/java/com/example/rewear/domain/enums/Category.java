package com.example.rewear.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Category {
    KNIT, SWEATSHIRT, SHIRT,
    SHORTS, JEANS, SWEATPANTS,
   ZIP_UP_HOODIE, PUFFER_JACKET, JACKET,
    DRESS,
    SKIRT;

    @JsonCreator
    public static Category from(String key) {
        return Category.valueOf(
                key.trim()
                        .replaceAll("[ \\-]", "_")   // Space/hyphen → underscore
                        .toUpperCase()
        );
    }

}
