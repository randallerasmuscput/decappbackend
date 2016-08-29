package com.example.Domain;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2016/06/06.
 */
@Embeddable
public class Address implements Serializable {


    private String address;
    private String suburb;
    private String postalCode;

    private Address() {
    }

     public String getAddress() {
        return address;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getPostalCode() {
        return postalCode;
    }

    private Address(Builder builder) {
        address = builder.address;
        suburb = builder.suburb;
        postalCode = builder.postalCode;
    }

       public static class Builder {
        private String address;
        private String suburb;
        private String postalCode;

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder suburb(String val) {
            suburb = val;
            return this;
        }

        public Builder postalCode(String val) {
            postalCode = val;
            return this;
        }

        public Builder copy(Address copy) {
            Builder builder = new Builder();
            builder.address = copy.address;
            builder.suburb = copy.suburb;
            builder.postalCode = copy.postalCode;
            return builder;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
