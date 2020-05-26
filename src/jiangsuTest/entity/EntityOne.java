package jiangsuTest.entity;

import lombok.Data;

@Data
public class EntityOne {
    private static final long serialVersionUID = 2187741540491899075L;

    private String bytesCNT;
    private String startTime;
    private String durationCH;
    private String ccgProductName;
    private String ticketNumber;
    private String ticketType;
    private String productID;
    private String serviceType;
    private String duration;
    private String ticketChargeCH;

    public String getBytesCNT() {
        return bytesCNT;
    }

    public void setBytesCNT(String bytesCNT) {
        this.bytesCNT = bytesCNT;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDurationCH() {
        return durationCH;
    }

    public void setDurationCH(String durationCH) {
        this.durationCH = durationCH;
    }

    public String getCcgProductName() {
        return ccgProductName;
    }

    public void setCcgProductName(String ccgProductName) {
        this.ccgProductName = ccgProductName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTicketChargeCH() {
        return ticketChargeCH;
    }

    public void setTicketChargeCH(String ticketChargeCH) {
        this.ticketChargeCH = ticketChargeCH;
    }
}
