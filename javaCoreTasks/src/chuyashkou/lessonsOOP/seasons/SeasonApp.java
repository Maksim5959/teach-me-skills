package chuyashkou.lessonsOOP.seasons;

public class SeasonApp {

    public static void main(String[] args) {

        Season season = Season.SPRING;

        System.out.println(season);

        Season.iLikeSeason(season);

        for (Season s : Season.values()) {
            System.out.print(s + " " + s.getDescription() + ", ");
            Season.iLikeSeason(s);
        }
    }
}
