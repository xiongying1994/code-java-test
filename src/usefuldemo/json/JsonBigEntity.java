package usefuldemo.json;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author xiongying
 */
public class JsonBigEntity implements Serializable {

    private String NAME = "asda";

    private String AGE_GIRL = "18";

    @JSONField(name = "NAME")
    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @JSONField(name = "AGE_GIRL")
    public String getAGE_GIRL() {
        return AGE_GIRL;
    }

    public void setAGE_GIRL(String AGE_GIRL) {
        this.AGE_GIRL = AGE_GIRL;
    }
}
