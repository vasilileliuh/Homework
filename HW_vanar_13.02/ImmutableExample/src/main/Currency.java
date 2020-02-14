package main;

public final class Currency {
    private String baseCode;
    private String code;
    private Float value;
    private String date;

    public Currency(String baseCode, String code, Float value, String date) {
        this.baseCode = baseCode;
        this.code = code;
        this.value = value;
        this.date = date;
    }

    public final Currency setBaseCode(String baseCode) {
        Currency copy = this.copy();
        copy.baseCode = baseCode;
        return copy;
    }

    public final String getBaseCode() {
        return baseCode;
    }

    public final Currency setCode(String code) {
        Currency copy = this.copy();
        copy.code = code;
        return copy;
    }

    public final String getCode() {
        return code;
    }

    public final Currency setValue(Float value) {
        Currency copy = this.copy();
        copy.value = value;
        return copy;
    }

    public final Float getValue() {
        return value;
    }

    public final Currency setDate(String date) {
        Currency copy = this.copy();
        copy.date = date;
        return copy;
    }

    public final String getDate() {
        return date;
    }

    private Currency copy() {
        Currency copy = new Currency(baseCode, code, value, date);
        return copy;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "baseCode='" + baseCode + '\'' +
                ", code='" + code + '\'' +
                ", value=" + value +
                ", date='" + date + '\'' +
                '}';
    }
}
