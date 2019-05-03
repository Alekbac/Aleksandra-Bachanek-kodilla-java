package com.kodilla.good.patterns.Allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public OrderRequest retrieve(){
        User user = new User( "Jan", "Nowak");
        String item = "Brush";

        LocalDateTime orderDay = LocalDateTime.of( 2019, 05, 03, 15, 0 );

        return new OrderRequest(user, orderDay, item);
    }
}
