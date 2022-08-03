Class Train{
    String TrainName;
    int TrainNumber;
    String Traintype;
}

// Creating the constructor
public Train(String Name, int Number, String Type)
this.TrainName=Name;
this.TrainNumber=Number;
this.Traintype=Type;
}

private String getTrainName()
{
    return this.TrainName;
    
}

Class TrainEngine()
{
         String engineType;
        void setEngine() {

           // Accessing the carType property of Car
            if(Train.this.TrainType.equals("SuperFast")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Premium")) {
                    this.engineType = "WAP7";
                } 
                
                else if(Car.this.getCarName().equals("NonPremium"))
                    this.engineType="WAP5";
                    
                    else if(Car.this.getCarName().equals("Freight"))
                    this.engineType="WDP3"
                    
                    else { 
                        this.engineType="WDG"
                    }
                        

            else if(Train.this.TrainType.equals("Fast"))
                this.engineType = "WAP4";
            }
            else
            {
                this.engineType="WXG";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

public class Main {
    public static void main(String[] args) {

// create an object of the outer class Car
        Train train1 = new Train("NonPremium", 21225 "Superfast");

        // create an object of inner class using the outer class
        Train.Engine engine = Train1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Train train2 = new Train("Premium", 22131,"SuperFast");
        Train.Engine c2engine = Train2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for SuperFast = " + c2engine.getEngineType());
    }
}
}
    
    
}