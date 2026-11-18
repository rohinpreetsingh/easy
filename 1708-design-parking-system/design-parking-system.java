class ParkingSystem {
    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        // Store counts at indices 0, 1, and 2
        slots = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        // carType is 1-indexed (1 = big, 2 = medium, 3 = small)
        if (slots[carType - 1] > 0) {
            slots[carType - 1]--;
            return true;
        }
        return false;
    }
}
