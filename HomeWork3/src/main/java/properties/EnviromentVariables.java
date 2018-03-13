package properties;

enum EnviromentVariables {
    BASE_ADMIN_URL("env.admin.url"),
    BROWSER("browser");

    private String value;
    EnviromentVariables(String value) { this.value = value; }

    @Override
    public String toString() { return value; }
}
