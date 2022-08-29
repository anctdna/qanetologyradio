import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(7);

        int expected = 7;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifSetStationLessThanMin() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifSetStationMoreThanMax() {
        Radio station = new Radio();

        station.setCurrentStation(11);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifSetVolumeLessThanMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifSetVolumeMoreThanMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationListing () {
        Radio station = new Radio();
        station.setCurrentStation(4);

        station.next();

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationIfAboveMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationListing () {
        Radio station = new Radio();
        station.setCurrentStation(4);

        station.prev();

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationIfLessThanMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownListing() {
        Radio volume = new Radio();
        volume.setCurrentVolume(80);

        volume.decreaseVolume();

        int expected = 79;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpListing() {
        Radio volume = new Radio();
        volume.setCurrentVolume(80);

        volume.increaseVolume();

        int expected = 81;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeShouldNotBeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeShouldNotBeLessThanMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
