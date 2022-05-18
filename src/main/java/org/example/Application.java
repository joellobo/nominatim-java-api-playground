package org.example;

import com.atlis.location.model.impl.Address;
import com.atlis.location.model.impl.MapPoint;
import com.atlis.location.nominatim.NominatimAPI;

public class Application {

    public static void main(String[] args) {
        String endpointUrl = "https://nominatim.openstreetmap.org/";

        Address address = new Address();
        address.setCity("New York");
        MapPoint mapPoint = NominatimAPI.with(endpointUrl).getMapPointFromAddress(address, 5);

        System.out.println(mapPoint.toString());
    }

}
