class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int waterLevel = 0; // Water level in the watering can
        int riverDistance = 0; // Distance from the river to the current plant

        for (int i = 0; i < plants.length; i++) {
            // If the water level is not enough to water the current plant
            if (waterLevel < plants[i]) {
                // Refill the watering can and move to the river
                waterLevel = capacity;
                steps += 2 * riverDistance; 
            }
            waterLevel -= plants[i]; // Water the current plant
            // One step to move to the next plant
            steps++;
            // Increment the river distance
            riverDistance++;
        }
        return steps; 
    }
}
