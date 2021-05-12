// not passing all test cases
    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {

                int v = map.get(arr[i]);
                v++;
                map.put(arr[i], v);
            }

            map.put(arr[i], 1);

        }

        int max = Integer.MIN_VALUE;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {

            int val = map.get(arr[i]);
            if (val > max) {
                max = val;
                num = arr[i];

            }

        }


        return num;


    }
