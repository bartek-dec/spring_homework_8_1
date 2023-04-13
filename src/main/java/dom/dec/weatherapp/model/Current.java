package dom.dec.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Current {

    @JsonProperty("temp_c")
    private Double tempC;


    @JsonProperty("temp_c")
    public Double getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    @Override
    public String toString() {
        return "Current{" +
                "tempC=" + tempC +
                '}';
    }
}