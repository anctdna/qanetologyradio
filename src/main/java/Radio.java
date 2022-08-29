public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationsAmount;

    private int volumeRange;

    public Radio () {
        this.stationsAmount = 10;
        this.volumeRange = 100;
    }

    public Radio (int stationsAmount, int volumeRange) {
        this.stationsAmount = stationsAmount;
        this.volumeRange = volumeRange;
    }

    public void next() {
        if (currentStation < stationsAmount - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < volumeRange - 1) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationsAmount - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > volumeRange) {
            return;
        }
        this.currentVolume = currentVolume;
    }




}
