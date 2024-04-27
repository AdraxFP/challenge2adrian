package util;

import com.google.gson.JsonObject;

public record money(String base_code, JsonObject conversion_rates) {
}