package com.chuyashkou.lessons_oop.clothes;

public enum Size {

    XXS(32) {
        @Override
        public String getDescription() {
            return "детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    Size() {
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "взрослый размер";
    }

    @Override
    public String toString() {
        return name() + "{" +
                "euroSize=" + euroSize + " - " + getDescription() +
                '}';
    }
}
