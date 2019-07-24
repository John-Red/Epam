package company;

public interface ApplicationConst {
    String APP_NAME = "AIIX";
    String AUTHOR = "Evgeniy Redin";
    String VERSION = "0.1.0";
    String WEATHER_KEY = "91ead9711dd84912af085935191204";

    String ALLOWED_DOMAIN_NAMES = "^([a-zA-Z0-9]+\\.)+(com|org|de|gov)$";

    String OP_GROUP = "^(SELECT|DELETE)";
    String FLD_GROUP = "([*a-zA-z, ]+)";
    String SPACE = "([\\s]+)";
    String FROM_GROUP = "(FROM)";
    String TBL_GROUP = "([a-zA-Z]+)$";

}
