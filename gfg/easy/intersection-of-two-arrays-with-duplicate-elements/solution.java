class Solution {
	public ArrayList<Integer> intersect(int[] a, int[] b) {
		// code here
		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
		    hs2.add(b[j]);
		}
		for(int num : hs){
		    if(hs2.contains(num))
		        result.add(num);
		}
		return result;
	}
}
