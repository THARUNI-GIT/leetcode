// Last updated: 7/16/2026, 11:04:34 AM
class Solution {
    public int[] maximumMEX(int[] nums) {

        int n = nums.length;
        int LIMIT = n + 5;

        int[] freq = new int[LIMIT];

        for (int x : nums) {
            if (x < LIMIT) {
                freq[x]++;
            }
        }

        TreeSet<Integer> missing = new TreeSet<>();

        for (int i = 0; i < LIMIT; i++) {
            if (freq[i] == 0) {
                missing.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int[] seen = new int[LIMIT];
        int stamp = 1;

        int i = 0;

        while (i < n) {

            int mex = missing.first();

            if (mex == 0) {

                ans.add(0);

                int x = nums[i];

                if (x < LIMIT) {
                    freq[x]--;
                    if (freq[x] == 0) {
                        missing.add(x);
                    }
                }

                i++;
                continue;
            }

            int need = mex;
            int j = i;

            while (need > 0) {

                int x = nums[j];

                if (x < mex && seen[x] != stamp) {
                    seen[x] = stamp;
                    need--;
                }

                if (x < LIMIT) {
                    freq[x]--;

                    if (freq[x] == 0) {
                        missing.add(x);
                    }
                }

                j++;
            }

            ans.add(mex);

            stamp++;
            i = j;
        }

        int[] res = new int[ans.size()];

        for (int k = 0; k < ans.size(); k++) {
            res[k] = ans.get(k);
        }

        return res;
    }
}