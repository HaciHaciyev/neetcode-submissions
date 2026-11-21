class Solution {

    record Car(int position, int speed) {}

    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, Comparator.comparingInt(Car::position).reversed());

        int fleets = 0;
        double previousTime = 0;

        for (Car car : cars) {

            double currentTime =
                    (double) (target - car.position()) / car.speed();

            if (currentTime > previousTime) {
                fleets++;
                previousTime = currentTime;
            }
        }

        return fleets;
    }
}