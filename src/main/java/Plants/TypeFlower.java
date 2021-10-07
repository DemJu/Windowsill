package Plants;

import java.lang.reflect.Type;

public enum TypeFlower {
    ROSE("Rose") /*роза*/, FORGET_ME_NOT("Forget-me-not") /*незабудка*/; //, FERN("Fern")/*папоротник*/, ORCHID("Orchid") /*орхидея*/;

    private final String value;

    TypeFlower(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
