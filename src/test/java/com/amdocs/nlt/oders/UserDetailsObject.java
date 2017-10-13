package com.amdocs.nlt.oders;

public class UserDetailsObject {

    private String salutation;
    private String firstName;
    private String lastName;
    private String companyName;
    private String contactNumber;
    private String alternateContactNumber;
    private String emailAddress;
    private String alternateEmailAddress;

    public static class Builder {

        private String salutation;
        private String firstName;
        private String lastName;
        private String companyName;
        private String contactNumber;
        private String alternateContactNumber;
        private String emailAddress;
        private String alternateEmailAddress;

        public Builder() {
        }

        public Builder salutation(String val) {
            salutation = val;
            return this;
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder companyName(String val) {
            companyName = val;
            return this;
        }

        public Builder contactNumber(String val) {
            contactNumber = val;
            return this;
        }

        public Builder alternateContactNumber(String val) {
            alternateContactNumber = val;
            return this;
        }

        public Builder emailAddress(String val) {
            emailAddress = val;
            return this;
        }

        public Builder alternateEmailAddress(String val) {
            alternateEmailAddress = val;
            return this;
        }

        public UserDetailsObject build() {
            return new UserDetailsObject(this);
        }

    }

    private UserDetailsObject(Builder builder) {
        this.salutation = builder.salutation;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;

        this.companyName = builder.companyName;
        this.contactNumber = builder.contactNumber;
        this.alternateContactNumber = builder.alternateContactNumber;
        this.emailAddress = builder.emailAddress;
        this.alternateEmailAddress = builder.alternateEmailAddress;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAlternateContactNumber() {
        return alternateContactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }
}
