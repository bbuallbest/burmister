package org.burmister.payman.api.rest.resource;

import org.burmister.core.model.Payment;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Kyrylo Berehovyi
 */
@Path("/payment")
@Component
public class PaymentResource {

    @GET
    @Produces("application/json")
    public Payment getPayment() {
        return Payment.builder()
                .id(678L)
                .amount(234L)
                .name("fakePayment")
                .description("justA..Stub")
                .build();
    }

}
