package Seminar_1.practice.impl;

public enum Package {
        PLASTIC("пластик"), GLASS("стекло"), ALUMINIUM("алюминиевая банка"), PAPER_CUP("бумажный стакан");

        private final String material;

        Package (String material){
            this.material = material;
        }
        public String getMaterial(){
            return material;
        }

    }
