package com.ceiba.AppCobros.debtController;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/debt")
public class DebtManagementController {

    private static final List<Debt> DEBTS = Arrays.asList(
            new Debt(1, "Sneider Garcia"),
            new Debt(2, "Alexander Angulo"),
            new Debt(3, "German Ovalle")
    );

    @GetMapping
    public List<Debt> getAllDebts() {
        System.out.println("getAllDebts");
        return DEBTS;
    }

    @PostMapping
    public void registerNewDebt(@RequestBody Debt debt) {
        System.out.println("registerNewDebt");
        System.out.println(debt);
    }

    @DeleteMapping(path = "{debtId}")
    public void deleteDebt(@PathVariable("debtId") Integer debtId) {
        System.out.println("deleteStudent");
        System.out.println(debtId);
    }

    @PutMapping(path = "{debtId}")
    public void updateDebt(@PathVariable("debtId") Integer debtId, @RequestBody Debt debt) {
        System.out.println("updateDebt");
        System.out.printf("%s %s%n",debtId, debt);
    }

}
