public enum DeliverTypes {
    STEP( "Пешая   доставка стоит 10$."),
    AUTO( "Авто    доставка стоит 20$."),
    AERO( "Авиа    доставка стоит 100$."),
    WATER("Водная  доставка стоит 50$");

    private String value;

    DeliverTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
