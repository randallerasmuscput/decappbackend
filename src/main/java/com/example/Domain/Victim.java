package com.example.Domain;

//import javax.persistence.Embedded;
//import javax.persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity

public class Victim implements Serializable
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Victim() {
    }

    private Victim(Builder builder) {
        id = builder.id;
        name = builder.name;
        surname = builder.surname;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
   public static final class Builder {
        private Long id;
        private String name;
        private String surname;

        public Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder surname(String val) {
            surname = val;
            return this;
        }
        public Builder copy(Victim copy) {
            Builder builder = new Builder();
            builder.id = copy.id;
            builder.name = copy.name;
            builder.surname = copy.surname;
            return this;
        }

        public Victim build() {
            return new Victim(this);
        }
    }
}

























