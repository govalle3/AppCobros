package com.ceiba.AppCobros.debtController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("api/v1/debt")
public class DebtController {

    private static final List<Debt> DEBTS = Arrays.asList(
            new Debt(1, "Sneider Garcia"),
            new Debt(2, "Alexander Angulo"),
            new Debt(3, "German Ovalle")
    );

    @GetMapping(path = "{debtId}")
    public Debt getDebt(@PathVariable("debtId") Integer debtId) {

    return DEBTS.stream()
            .filter(debt -> debtId.equals(debt.getDebtId()))
            .findFirst()
            .orElseThrow(()-> new IllegalStateException("Debt " + debtId + "does not exists"));

    }
}
