import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberRadioStation() {
        Radio rad = new Radio(15);
        Assertions.assertEquals(15, rad.getNumberRadioStation());
    }

    @Test
    public void shouldNotSetNumberRadioStation1() {
        Radio rad = new Radio();
        Assertions.assertEquals(10, rad.getNumberRadioStation());
    }

    @Test
    public void shouldSetNumberCurrentRadioStationNotSetNumberRS() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(7);
        int expected = 7;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberCurrentRadioStationNotSetNumberRS1() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(11);
        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberCurrentRadioStationNotSetNumberRS2() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(-1);
        int expected = 10;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNumberCurrentRadioStationSetNumberRS() {
        Radio rad = new Radio(15);
        rad.setNumberCurrentRadioStation(11);
        int expected = 11;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetNumberCurrentRadioStationSetNumberRS() {
        Radio rad = new Radio(15);
        rad.setNumberCurrentRadioStation(17);
        int expected = 15;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStashion() {
        Radio rad = new Radio(15);
        rad.setNumberCurrentRadioStation(5);
        rad.nextNumberRadioStation();
        int expected = 6;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextRadioStashionSetNumberRS() {
        Radio rad = new Radio(15);
        rad.setNumberCurrentRadioStation(14);
        rad.nextNumberRadioStation();
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextRadioStashionNotSetNumberRS() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(9);
        rad.nextNumberRadioStation();
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStashion() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(5);
        rad.prevNumberRadioStation();
        int expected = 4;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevRadioStashion() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(0);
        rad.prevNumberRadioStation();
        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLevelVolume() {
        Radio rad = new Radio();
        rad.setLevelVolume(80);
        int expected = 80;
        int actual = rad.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLevelVolume1() {
        Radio rad = new Radio();
        rad.setLevelVolume(101);
        int expected = 0;
        int actual = rad.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLevelVolume2() {
        Radio rad = new Radio();
        rad.setLevelVolume(-1);
        int expected = 0;
        int actual = rad.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setLevelVolume(50);
        rad.increaseVolume();
        int expected = 51;
        int actual = rad.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume1() {
        Radio rad = new Radio();
        rad.setLevelVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setLevelVolume(100);
        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();
        rad.setLevelVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

}




















