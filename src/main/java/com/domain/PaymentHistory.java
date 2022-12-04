package com.domain;

public class PaymentHistory {

    private Long id;
    private String customer_id;
    private String trxid;
    private String loan_trxid;
    private String payment_trxid;
    private String value;
    private String payment;
    private String payment_status;
    private String payment_id;
    private String created_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    public String getLoan_trxid() {
        return loan_trxid;
    }

    public void setLoan_trxid(String loan_trxid) {
        this.loan_trxid = loan_trxid;
    }

    public String getPayment_trxid() {
        return payment_trxid;
    }

    public void setPayment_trxid(String payment_trxid) {
        this.payment_trxid = payment_trxid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
