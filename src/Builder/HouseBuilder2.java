package Builder;

public class HouseBuilder2 implements Builder {
    private House house;

    public HouseBuilder2() {
        this.house = new House();
    }

    @Override
    public void buildHouseWalls() {
        house.setWalls("marble walls");
    }

    @Override
    public void buildHouseDoors() {
        house.setDoors("metal doors");
    }

    @Override
    public void buildHouseWindows() {
        house.setWindows("glass windows");
    }

    @Override
    public void buildHouseRoof() {
        house.setRoof("black roof");
    }

    @Override
    public void buildHouseGarage() {
        house.setGarage("small garage");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
