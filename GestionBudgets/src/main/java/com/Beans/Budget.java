    package com.Beans;


    import javax.persistence.*;

    @Entity
    @Table(name = "budgets")
    public class Budget {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String Category;

        private double Limite;

        private double AmountSpent;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @ManyToOne
        @JoinColumn(name = "category_id")
        private Category categorys;
        public Budget(int id, java.lang.String category, double limite, double amountSpent) {
            this.id = id;
            this.Category = category;
            this.Limite = limite;
            this.AmountSpent = amountSpent;
        }

        public Budget() {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public java.lang.String getCategory() {
            return Category;
        }

        public void setCategory(java.lang.String category) {
            this.Category = category;
        }

        public double getLimite() {
            return Limite;
        }

        public void setLimite(double limite) {
            this.Limite = limite;
        }

        public double getAmountSpent() {
            return AmountSpent;
        }

        public void setAmountSpent(double amountSpent) {
            this.AmountSpent = amountSpent;
        }


    }
