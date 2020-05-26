package old.intoandout;

/**
 * @author xiongying
 */
public enum SeasonEnum {
   /*季节*/
    SPRING(1), SUMMER(2), AUTUMN(2313), WINTER(35463);
    private int seq;
    private SeasonEnum(int seq){
        this.seq = seq;
    }

    public int getValue() {
        return seq;
    }
}