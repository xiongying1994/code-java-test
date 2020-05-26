package usefuldemo.lambda.entity;

public class billingCycleId {
    Long billingCycleId;
    Long lBillingCycleId;

    public Long getBillingCycleId() {
        return billingCycleId;
    }

    public void setBillingCycleId(Long billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    public Long getlBillingCycleId() {
        return lBillingCycleId;
    }

    public void setlBillingCycleId(Long lBillingCycleId) {
        this.lBillingCycleId = lBillingCycleId;
    }

    @Override
    public String toString() {
        return "billingCycleId{" +
                "billingCycleId=" + billingCycleId +
                ", lBillingCycleId=" + lBillingCycleId +
                '}';
    }
}
