// using HashMpas
public static ArrayList<Integer> removeDuplicates(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                continue;
            }
            newList.add(arr[i]);
            map.put(arr[i], true);
        }


        return newList;
    }
