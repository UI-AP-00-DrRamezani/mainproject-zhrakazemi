package com.company.entity.classes;

public class Discount {
        private int capacity;
        private String code;
        private int discountPercent;
        private String validityDuration;
        private boolean allTimeDiscount;

        public Discount(int capacity, int discountPercent, String validityDuration, boolean allTime) {
            this.capacity = capacity;
            this.discountPercent = discountPercent;
            this.validityDuration = validityDuration;
            this.allTimeDiscount = allTime;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;

        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getDiscountPercent() {
            return discountPercent;
        }

        public void setDiscountPercent(int discountPercent) {
            this.discountPercent = discountPercent;
        }

        public String getValidityDuration() {
            return validityDuration;
        }

        public void setValidityDuration(String validityDuration) {
            this.validityDuration = validityDuration;
        }

        public boolean isAllTimeDiscount() {
            return allTimeDiscount;
        }

        public void setAllTimeDiscount(boolean allTimeDiscount) {
            this.allTimeDiscount = allTimeDiscount;
        }

}
