public class Homework {
    public static void main(String[] args) {
        Movie Nairobi = new Movie("Nairobi", 90,"Rated R", "Asad");
        Movie Allstar = new Movie("Allstar", 75, "PG-13", "Farhad");

        Reel Instagram = new Reel("Asad", 30, 200, 40,
                "Yb- Better Man");
        Reel Snapchat = new Reel("Farhad", 45, 75, 80,
                "Yb- Life Support");

        System.out.println(Nairobi.getTitle()+ ", " + Nairobi.getMovieLengthInMinutes()+ ", " +
                Nairobi.getRating()+ ", " + Nairobi.getDirector());
        System.out.println(Allstar.getTitle()+ ", " + Allstar.getMovieLengthInMinutes() + ", " +
                Allstar.getRating()+ ", " + Allstar.getDirector());

        System.out.println(Instagram.getUserId()+ ", " + Instagram.getLengthInSeconds()+ ", " +
                Instagram.getNumberOfLikes()+ ", " + Instagram.getNumberOfShares());
        System.out.println(Snapchat.getUserId()+ ", " + Snapchat.getLengthInSeconds()+ ", " +
                Snapchat.getNumberOfLikes() + ", " + Snapchat.getNumberOfShares());
    }
}
/*
1. Create a Movie class with the following properties -- I'll leave it to you to decide what the
appropriate data types would be:

title
movieLengthInMinutes
rating (ratings can be R, G, PG, PG-13)
director
2. Add a constructor method

3. Add getters and setters.

4. In your Main class' main() method, create two instances of the movie class.
Continue with the concept of classes and objects by implementing Instagram reels.

Steps

1. Create a Reel class with the following properties:

userId (this is the ID of the user who made the post)
lengthInSeconds
numberOfLikes
numberOfShares
backgroundSong
2. Add a constructor method

3. Add getters and setters.

4. In your Main class' main() method, create two instances of the movie class.
 */