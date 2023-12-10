public class Radio {
    private int numberRadioStation = 10;
    private int numberCurrentRadioStation = numberRadioStation;
    private int currentLevelVolume;


    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation;
        this.numberCurrentRadioStation = numberRadioStation-1;
    }

    public Radio() {
        this.numberRadioStation = numberRadioStation-1;

    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > (numberRadioStation - 1)) {
            return;
        }

        if (newNumberCurrentRadioStation < 0) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void nextNumberRadioStation() {
        if (numberCurrentRadioStation == (numberRadioStation - 1)) {
            numberCurrentRadioStation = 0;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prevNumberRadioStation() {
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = (numberRadioStation - 1);
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
    }

    public int getLevelVolume() {
        return currentLevelVolume;
    }

    public void setLevelVolume(int currentLevelVolume) {
        if (currentLevelVolume > 100) {
            return;
        }
        if (currentLevelVolume < 0) {
            return;
        }
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
        if (currentLevelVolume == 0) {
            return;
        }
    }

}
