public class ELOAlgo {
    public static void main(String[] args) {
        /*
            this algo is used for comparing two people or rank them using there rating and
            algo helps you get new ranking
            steps-
            1. get initial ranking values for every person
            2. then we check who will win using that formulae(probability)
            3. then we use formulae to calculate new rating and then we can use this rating to rank people
         */

        int rankingOne = 1200;
        int rankingTwo = 1400;

        /*
            we calculate probability who will win and by what probability
         */

        double eloratingForPlayerOne = 1/(1+Math.pow(10, (rankingTwo - rankingOne)/(double)400));
        double eloratingForPlayerTwo = 1/(1+Math.pow(10, (rankingOne - rankingTwo)/(double)400));

            //new rating for player 1 and 2
            //let say k is constant be 30
        int k = 30;

        /*
            below is formulae to calculate new rating
            newRating = prevRating + constant * (probabilityGuessed - probabilityReal);
         */

        double newRatingForPlayerOne = rankingOne + k * (0 - eloratingForPlayerOne);
        double newRatingForPlayerTwo = rankingTwo + k * (1 - eloratingForPlayerTwo);

        rankingOne = (int) newRatingForPlayerOne;
        rankingTwo = (int) newRatingForPlayerTwo;
        System.out.println(rankingOne);
        System.out.println(rankingTwo);


    }
}
