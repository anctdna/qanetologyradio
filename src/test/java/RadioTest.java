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
    public void nextStationIfAboveMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.next();

        int expected = 0;
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
    public void volumeShouldNotBeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.increaseVolume();

        int expected = 10;
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
