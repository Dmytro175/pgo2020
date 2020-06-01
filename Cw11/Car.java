package Cw11;
 class Car implements Comparable<Car>{
    Integer productionYer;
    String name;

    public Car(Integer productionYer, String name) {
        this.productionYer = productionYer;
        this.name = name;
    }

    public Integer getProductionYer() {
        return productionYer;
    }
    @Override
    public int compareTo(Car car) {
        if (productionYer == car.getProductionYer()){
            return 0;
        }else if (productionYer>car.getProductionYer()){
            return 1;
        }else{
            return -1;
        }
    }

     @Override
     public String toString() {
         return super.toString();
     }
 }


