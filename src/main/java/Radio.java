public class Radio {
    private int numberCurrentRadioStation;
    private int currentLevelVolume;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > 9) return;
        if (newNumberCurrentRadioStation < 0) return;
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void nextNumberRadioStation() {
        if (numberCurrentRadioStation == 9) {
            numberCurrentRadioStation = 0;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prevNumberRadioStation() {
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = 9;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
    }

    public int getLevelVolume() {
        return currentLevelVolume;
    }

    public void setLevelVolume(int currentLevelVolume) {
        if (currentLevelVolume > 100) return;
        if (currentLevelVolume < 0) return;
        this.currentLevelVolume = currentLevelVolume;
    }

    public void increaseVolume() {
        if (currentLevelVolume < 100) {
            currentLevelVolume = currentLevelVolume + 1;
        }
        if (currentLevelVolume == 100) return;
    }

    public void decreaseVolume() {
        if (currentLevelVolume > 0) {
            currentLevelVolume = currentLevelVolume - 1;
        }
        if (currentLevelVolume == 0) return;
    }

}
