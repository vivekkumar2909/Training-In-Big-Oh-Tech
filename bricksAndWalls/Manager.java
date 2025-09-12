// package bricksAndWalls;

import java.util.*;

public class Manager {

    private List<User> users = new ArrayList<>();
    private List<City> cities = new ArrayList<>();
    private List<Country> countries = new ArrayList<>();
    private Map<String, City> cityMap = new HashMap<>();
    private Map<String, Bricks> brickMap = new HashMap<>();
    private Map<User, Admin> adminMap = new HashMap<>();

    Walls wall;

    void SetWall(Walls wall) {
        this.wall = wall;
        System.out.println("Wall Created");
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addCity(City city) {
        cities.add(city);
        cityMap.put(city.getName(), city);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void setAdmin(User user, Admin admin) {
        adminMap.put(user, admin);
    }

    public boolean addBrick(String cityName, Bricks brick) {
        City city = cityMap.get(cityName);
        if (city != null) {
            Walls wall = city.getAvailableWalls();
            boolean added = wall.addBricks(brick);
            if (added) {
                brickMap.put(brick.getIdOfBrick(), brick);
                brick.getOwner().addOwnBrick(brick);
            }
            return added;
        }
        return false;
    }

    public void flagBrick(String brickId) {
        Bricks brick = brickMap.get(brickId);
        if (brick != null) {
            brick.addIncreaseCount();
        }
    }

    public boolean editBrick(String brickId, String newCaption, Admin editor) {
        Bricks brick = brickMap.get(brickId);
        if (brick != null) {
            if (editor instanceof Admin || brick.getOwner().equals(editor)) {

                System.out.println("Edited By admin");
                brick.setCaption(newCaption);
                return true;

            }
        }
        return false;
    }

    public int getTotalWallsInCity(String cityName) {
        City city = cityMap.get(cityName);
        if (city != null) {
            return city.getTotalWallInCity();
        }
        return 0;

    }

    public int getTotalBricksInWall(String cityName, int wallId) {
        City city = cityMap.get(cityName);
        if (city != null) {
            for (Walls w : city.getWalls()) {
                if (w.getWallId() == wallId) {
                    return w.getBrickCount();
                }
            }
        }
        return 0;
    }

    public User getHottestUser() {
        Map<User, Integer> MostDedicated = new HashMap<>();
        for (Bricks b : brickMap.values()) {
            User dedicated = b.getDedicatedToUser();
            MostDedicated.put(dedicated, MostDedicated.getOrDefault(dedicated, 0) + 1);
        }
        User hottest = null;
        int max = 0;
        for (Map.Entry<User, Integer> entry : MostDedicated.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                hottest = entry.getKey();
            }
        }
        return hottest;
    }

    public List<User> getUsersWithNoDedications() {
        Set<User> dedicatedUsers = new HashSet<>();
        for (Bricks b : brickMap.values()) {
            dedicatedUsers.add(b.getDedicatedToUser());
        }
        List<User> noDed = new ArrayList<>();
        for (User u : users) {
            if (!dedicatedUsers.contains(u)) {
                noDed.add(u);
            }
        }
        return noDed;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<City> getCities() {
        return cities;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
