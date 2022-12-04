package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//SELECT trxid, loan_trxid FROM loan_payment_history Limit 1

@RestController
public class PaymentHistoryControllers {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(path = "/gld")
    public ResponseEntity<List<PaymentHistory>> getAllUsers(){
        List<PaymentHistory> paymentHistory = jdbcTemplate.query("SELECT trxid, loan_trxid FROM loan_payment_history Limit 1", new BeanPropertyRowMapper(PaymentHistory.class));
        return new ResponseEntity<>(paymentHistory, HttpStatus.OK);

    }

}
