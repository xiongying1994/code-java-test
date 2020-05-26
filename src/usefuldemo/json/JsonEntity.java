package usefuldemo.json;

import com.alibaba.fastjson.annotation.JSONField;
import com.sun.xml.internal.org.jvnet.fastinfoset.FastInfosetResult;
import jiangsuTest.entity.EntityOne;
import lombok.Data;

import java.util.List;

@Data
public class JsonEntity {

    private static final long serialVersionUID = 2187741540491899075L;

    @JSONField(name = "IRESULT")
    private String IRESULT;


    private String CHARGECNTCH;

    public String getIRESULT() {
        return IRESULT;
    }

    public void setIRESULT(String IRESULT) {
        this.IRESULT = IRESULT;
    }

    @JSONField(name = "CHARGECNTCH")
    public String getCHARGECNTCH() {
        return CHARGECNTCH;
    }


    public void setCHARGECNTCH(String CHARGECNTCH) {
        this.CHARGECNTCH = CHARGECNTCH;
    }

    @JSONField(name = "DuraTionCntCh")
    public String getDurationCh() {
        return durationCh;
    }
    @JSONField(name = "durationCntCh")
    public void setDurationCh(String durationCh) {
        this.durationCh = durationCh;
    }

    @Override
    public String toString() {
        return "JsonEntity{" +
                "IRESULT='" + IRESULT + '\'' +
                ", CHARGECNTCH='" + CHARGECNTCH + '\'' +
                ", durationCh='" + durationCh + '\'' +
                ", message='" + message + '\'' +
                ", totalBytesCnt='" + totalBytesCnt + '\'' +
                ", transActionId='" + transActionId + '\'' +
                ", data=" + data +
                '}';
    }


    private String durationCh;

    @JSONField(name = "smsg")
    private String message;

    private String totalBytesCnt;

    private String transActionId;

    private List<EntityOne> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSmsg() {
        return message;
    }

    public void setSmsg(String smsg) {
        this.message = smsg;
    }

    public String getTotalBytesCnt() {
        return totalBytesCnt;
    }

    public void setTotalBytesCnt(String totalBytesCnt) {
        this.totalBytesCnt = totalBytesCnt;
    }

    public String getTransActionId() {
        return transActionId;
    }

    public void setTransActionId(String transActionId) {
        this.transActionId = transActionId;
    }

    public List<EntityOne> getData() {
        return data;
    }

    public void setData(List<EntityOne> data) {
        this.data = data;
    }


}
