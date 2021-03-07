package Builder;

public class HouseApplication {
    public static void main(String[] args) {
        Builder houseBuilder1 = new HouseBuilder1();
        Director director = new Director(houseBuilder1);
        director.houseBuild();
        House house = director.getHouse();
        System.out.println(house);
        Builder houseBuilder2=new HouseBuilder2();
        Director director1=new Director(houseBuilder2);
        director1.houseBuild();
        House house1=director1.getHouse();
        System.out.println(house1);
    }
}
