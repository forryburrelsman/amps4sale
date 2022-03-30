package net.wattever.amps4sale.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class StripeService {
    public void displayPaymentMethods() {
        ArrayList paymentMethodTypes = new ArrayList();
        paymentMethodTypes.add("card");

        Map<String, Object> params = new HashMap<>();
        params.put("payment_method_types", paymentMethodTypes);
        params.put("amount", 1000);
        params.put("currency", "usd");
        params.put("application_fee_amount", 123);
    }
}
