package com.gmail.olgabovkaniuk.bovkaniuk_12.task3;

public enum Volume {
    VOLUME_FIRST(10),
    VOLUME_SECOND(20),
    VOLUME_THIRD(30);

    private final int volume;

    Volume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public static Volume getVolume(int value) {
        Volume[] volumes = values();
        for (Volume volume : volumes) {
            if (volume.getVolume() == value) {
                return volume;
            }
        }
        throw new RuntimeException("Volume is not found! value is " + value);
    }
}
