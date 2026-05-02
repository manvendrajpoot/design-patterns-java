package main.java.org.manvendra.Basics.OOPs;

import java.util.HashMap;

public class PaymentService {
    /*
        Stores Payment records
     */
    HashMap<String, PaymentMethod> paymentMethodHashMap;

    PaymentService () {
        paymentMethodHashMap = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod paymentMethod) {
        paymentMethodHashMap.put(name, paymentMethod);

    }

    public void makePayment(String name, int amount) {
        PaymentMethod paymentMethod = paymentMethodHashMap.get(name);

        /* dynamic dispatch based on paymentMethod*/
        paymentMethod.pay();
    }
}
