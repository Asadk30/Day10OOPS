public class Reel {
    String userId;
    double lengthInSeconds;
    int numberOfLikes;
    int numberOfShares;
    String backgroundSong;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(double lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public String getBackgroundSong() {
        return backgroundSong;
    }

    public void setBackgroundSong(String backgroundSong) {
        this.backgroundSong = backgroundSong;
    }


    public Reel(String userId, double lengthInSeconds, int numberOfLikes, int numberOfShares, String backgroundSong) {
        this.userId = userId;
        this.lengthInSeconds = lengthInSeconds;
        this.numberOfLikes = numberOfLikes;
        this.numberOfShares = numberOfShares;
        this.backgroundSong = backgroundSong;
    }
}
