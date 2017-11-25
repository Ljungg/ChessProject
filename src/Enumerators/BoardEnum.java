package Enumerators;

public enum BoardEnum {
    A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8);
    private final int value;

    BoardEnum(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }


}
