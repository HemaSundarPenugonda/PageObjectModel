package com.amdocs.nlt.oders;

/**
 * @author Hemsundar
 */
public class CommonDataObject {

    private String applicationReference_success;
    private String applicationReference_fail;
    private String applicationReference_minLength;
    private String applicationReference_maxLength;
    private String applicationReference_maxLengthPlus1;
    private String applicationReference_maxLengthMinus1;

    public static class Builder {
        private String applicationReference_success;
        private String applicationReference_fail;
        private String applicationReference_minLength;
        private String applicationReference_maxLength;
        private String applicationReference_maxLengthPlus1;
        private String applicationReference_maxLengthMinus1;

        public Builder() {
        }

        public Builder applicationReference_success(String val) {
            applicationReference_success = val;
            return this;
        }

        public Builder applicationReference_fail(String val) {
            applicationReference_fail = val;
            return this;
        }

        public Builder applicationReference_minLength(String val) {
            applicationReference_minLength = val;
            return this;
        }

        public Builder applicationReference_maxLength(String val) {
            applicationReference_maxLength = val;
            return this;
        }

        public Builder applicationReference_maxLengthPlus1(String val) {
            applicationReference_maxLengthPlus1 = val;
            return this;
        }

        public Builder applicationReference_maxLengthMinus1(String val) {
            applicationReference_maxLengthMinus1 = val;
            return this;
        }

        public CommonDataObject build() {
            return new CommonDataObject(this);
        }
    }

    private CommonDataObject(Builder builder) {
        this.applicationReference_success = builder.applicationReference_success;
        this.applicationReference_fail = builder.applicationReference_fail;
        this.applicationReference_minLength = builder.applicationReference_minLength;
        this.applicationReference_maxLength = builder.applicationReference_maxLength;
        this.applicationReference_maxLengthPlus1 = builder.applicationReference_maxLengthPlus1;
        this.applicationReference_maxLengthMinus1 = builder.applicationReference_maxLengthMinus1;
    }

    public String getApplicationReference_success() {
        return applicationReference_success;
    }
    public String getApplicationReference_fail() {
        return applicationReference_fail;
    }

    public String getApplicationReference_minLength() {
        return applicationReference_minLength;
    }

    public String getApplicationReference_maxLength() {
        return applicationReference_maxLength;
    }

    public String getApplicationReference_maxLengthPlus1() {
        return applicationReference_maxLengthPlus1;
    }

    public String getApplicationReference_maxLengthMinus1() {
        return applicationReference_maxLengthMinus1;
    }

}
