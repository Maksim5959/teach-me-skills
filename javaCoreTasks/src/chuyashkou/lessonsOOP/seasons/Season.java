package chuyashkou.lessonsOOP.seasons;

public enum Season {

    WINTER(-10.4),
    SPRING(15.4),
    SUMMER(25.8) {
        @Override
        public String getDescription() {
            return "теплое время года";
        }
    },
    AUTUMN(13.2);

    private double temperature;

    Season() {
    }

    Season(double temperature) {
        this.temperature = temperature;
    }

    public static void iLikeSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return "холодное время года";
    }

    @Override
    public String toString() {
        return super.name() + "{" +
                " temperature = " + temperature +
                '}';
    }
}
