package com.ceiba.AppCobros.debtController;

public class Debt {

    private final Integer debtId;
    private final String clientName;

    public Debt(Integer debtId, String clientName) {
        this.debtId = debtId;
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public Integer getDebtId() {
        return debtId;
    }
}
