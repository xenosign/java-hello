package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "팽이가 도니?";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "멜로로코";

        MovieReview[] movieReviews = {inception, aboutTime};

        for (MovieReview m : movieReviews) {
            System.out.println(m.title + " / " + m.review);
        }
    }
}

